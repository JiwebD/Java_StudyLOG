package Ch38.Domain.Service;

import java.sql.SQLException;

import Ch38.Domain.Dao.BookDaoImpl;
import Ch38.Domain.Dto.BookDto;



public class BookServiceImpl {
	
	//
	private BookDaoImpl bookDao;
	
	//싱클톤 패턴
	private static BookServiceImpl instance;
	private BookServiceImpl() throws ClassNotFoundException, SQLException {
		bookDao = BookDaoImpl.getInstance();
		System.out.println("[SERVICE] BookServiceImpl init...");
	};
	public static BookServiceImpl getInstance() throws ClassNotFoundException, SQLException{
		if(instance==null)
			instance = new BookServiceImpl();
		return instance ;
	}

	//회원가입 (+TX처리필요)
	public boolean bookJoin(BookDto bookDto) throws SQLException{
		
		return bookDao.insert(bookDto) > 0;
		
	};
	
	//회원조회
	
	//회원정보수정
	
	//회원탈퇴
	
	//로그인
	
	//로그아웃
}
