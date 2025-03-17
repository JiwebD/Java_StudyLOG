package Ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C05Select {

	public static void main(String[] args) {
		// DB CONN DATA
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/testdb";
					//고정 :DBMS :	 네트워크 	 /스키마db
		// JDBC참조변수
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		//19번 패키지 라이브러리에 mysql-connector-j-9.2.0.jar 추가
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 무슨경로를 말하는거지?
			System.out.println("Driver Loading Success...");
			//DB 연결
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB CONNECTED...");
			
			//SQL 쿼리 준비
			pstmt = conn.prepareStatement("select * from tbl_std");
			
			//SQL 실행
			rs = pstmt.executeQuery();
			
			if(rs!=null) {
				while(rs.next()) { //다음 행으로 커서이동 값이 없다면 false => 반복문 탈출
					System.out.print(rs.getString("name")+" ");
					System.out.print(rs.getInt("age")+" ");
					System.out.print(rs.getString("addr")+"\n");

				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { rs.close();} catch (SQLException e) {e.printStackTrace(); }
			try { pstmt.close();} catch (SQLException e) {e.printStackTrace(); }
			try { conn.close();} catch (SQLException e) {e.printStackTrace(); }
		}

	}
}
