package Ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C02Insert {

	public static void main(String[] args) {
		// DB CONN DATA
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/testdb";
					// 고정 :DBMS :	 네트워크 		/스키마db
		// JDBC참조변수
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		//mysql-connector-j-9.2.0.jar 추가
		try {
			//DB 연결코드
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success...");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB CONNECTED...");
			
			//SQL 쿼리 준비(!)
			//방법 1: 직접 SQL 문 실행 (정적)
//			pstmt = conn.prepareStatement("insert into tbl_std values('남길동',10,'부산')");
			
			//방법 2: ? 플레이스홀더를 사용한 PreparedStatement (권장)
			String name = "길동이";
			int age = 10;
			String addr = "광주";
			pstmt = conn.prepareStatement("insert into tbl_std values(?,?,?)");
			pstmt.setString(1,  name);
			pstmt.setInt(2, age);
			pstmt.setString(3,  addr);
			
			//방법 3: String 연결 방식 (비권장)
//			String name = args[0];
//			int age = Integer.parseInt(args[1]);
//			String addr = args[2];
//			pstmt = conn.prepareStatement("insert into tbl_std values('"+name+"',"+age+",'"+addr+"')");
//			pstmt.setString(1,  name);
//			pstmt.setInt(2, age);
//			pstmt.setString(3,  addr);
			

			//SQL 실행
			int result = pstmt.executeUpdate();
			
			if(result>0)
				System.out.println("INSERT 성공");
			else
				System.out.println("INSERT 실패");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {conn.close();} catch (SQLException e) {e.printStackTrace();}
		}

	}
}
