package Ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C08Tx {
	
	//DB CONN DATA
	static String id = "root";
	static String pw = "1234";
	static String url = "jdbc:mysql://localhost:3306/testdb";
	
	//JDBC참조변수
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;

	public static void main(String[] args) {
		//트랜젝션 : 한꺼번에 수행되어야 할 연산모음 
		//		 : 하나의 논리적인 작업을 수행하기 위해 필요한 연속적인 작업의 묶음을 의미
		//목적 	 : 연속적인 작업 도중 하나라도 실패하면, 모든 작업을 작업 실행 이전의 상태로 되돌리기 위해.
		
		
		try {
			//DB 연결
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success...");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB CONNECTED...");
			
			//
			System.out.println("INSERT 시작....");
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement("insert into tbl_std values('a',1,'a')");
			pstmt.executeUpdate();
			pstmt = conn.prepareStatement("insert into tbl_std values('b',1,'a')");
			pstmt.executeUpdate();
			pstmt = conn.prepareStatement("insert into tbl_std values('a',1,'a')");
			pstmt.executeUpdate();
			pstmt = conn.prepareStatement("insert into tbl_std values('d',1,'a')");
			pstmt.executeUpdate();
			conn.commit();
			System.out.println("INSERT 종료....");
			
		}catch(Exception e) {
			e.printStackTrace();
			try {conn.rollback();} catch (SQLException e3) {}
			
		}finally {
			try {pstmt.close();}catch(Exception e2) {}
			try {conn.close();}catch(Exception e2) {}			
			
		}

	}

}
