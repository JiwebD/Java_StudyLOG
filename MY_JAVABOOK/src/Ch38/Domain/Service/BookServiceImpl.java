package Ch38.Domain.Service;

import java.sql.SQLException;

import Ch38.Domain.Dao.BookDao;
import Ch38.Domain.Dao.BookDaoImpl;
import Ch38.Domain.Dto.BookDto;



public class BookServiceImpl {
	
	//
	private BookDao bookDao;
	
	//싱클톤 패턴
	private static BookServiceImpl instance;
	private BookServiceImpl() throws Exception{
		bookDao = BookDaoImpl.getInstance();
		System.out.println("[SERVICE] BookServiceImpl init...");
	}
	public static BookServiceImpl getInstance() throws Exception{
		if(instance==null)
			instance = new BookServiceImpl();
		return instance ;
	}

	// TX처리필요 + 비즈니스 유효성검사
	public boolean bookRegistration(BookDto bookDto) throws Exception{
		
		return bookDao.insert(bookDto) > 0;
		
	}
	
	//회원조회
	
	//회원정보수정
	
	//회원탈퇴
	
	//로그인
	
	//로그아웃
}
