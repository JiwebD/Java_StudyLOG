package Service;


import Domain.BookDAO;
import Domain.BookDTO;



public class BookService {
	
	//
	private BookDAO bookDao;
	
	//싱클톤 패턴
	private static BookService instance;
	private BookService() throws Exception{
		bookDao = BookDAO.getInstance();
		System.out.println("[SERVICE] BookServiceImpl init...");
	}
	public static BookService getInstance() throws Exception{
		if(instance==null)
			instance = new BookService();
		return instance ;
	}

	// TX처리필요 + 비즈니스 유효성검사
	public boolean bookRegistration(BookDTO bookDto) throws Exception{
		
		return bookDao.insert(bookDto) > 0;
		
	}
	
	//회원조회
	
	//회원정보수정
	
	//회원탈퇴
	
	//로그인
	
	//로그아웃
}
