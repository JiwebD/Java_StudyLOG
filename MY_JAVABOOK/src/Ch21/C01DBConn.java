package Ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C01DBConn {

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
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB CONNECTED...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {conn.close();} catch (SQLException e) {e.printStackTrace();}
		}

	}
}
