package Ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C04Delete {

	public static void main(String[] args) {
		//DB CONN DATA
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/testdb";
		
		//JDBC참조변수
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//
		//tbl_std 에 삭제 코드 넣어보세요(단일삭제하기)

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success...");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB CONNECTED...");
			
			//SQL 쿼리 준비(!)
			//방법 1: 직접 SQL 문 실행 (정적)
//			pstmt = conn.prepareStatement("delete from tbl_std where name='길동이'");
			
			//방법 2: ? 플레이스홀더를 사용한 PreparedStatement (권장)
//			String name = "남길동";
//			pstmt = conn.prepareStatement("delete from tbl_std where name=?");
//			pstmt.setString(1,  name);

			
			//방법 3: String 연결 방식 (비권장)
			String name = args[0];

			pstmt = conn.prepareStatement("delete from tbl_std where name=?");
			pstmt.setString(1,  name);
			

			//SQL 실행
			int result = pstmt.executeUpdate();
			
			if(result>0)
				System.out.println("INSERT 성공");
			else
				System.out.println("INSERT 실패");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {	
			try { conn.close();} catch (SQLException e) {e.printStackTrace(); }
		}
	}

}
