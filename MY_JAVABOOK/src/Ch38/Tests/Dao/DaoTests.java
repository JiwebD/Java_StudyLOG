
package Ch38.Tests.Dao;

import java.sql.SQLException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import Ch38.Domain.Dao.BookDaoImpl;
import Ch38.Domain.Dao.UserDaoImpl;
import Ch38.Domain.Dto.BookDto;
import Ch38.Domain.Dto.UserDto;

class DaoTests {

	@Test
	void test1() throws ClassNotFoundException, SQLException {
		
//		UserDaoImpl userDaoImpl = UserDaoImpl.getInstance();
		
		BookDaoImpl bookDaoImpl = BookDaoImpl.getInstance();
	}

	
	
	@Test
	@Disabled
	void test2() throws Exception{
		UserDaoImpl userDaoImpl = UserDaoImpl.getInstance();
		userDaoImpl.insert(new UserDto("aaa","홍길동","1234",""));
	}
	
	@Test
	
	void test3() throws Exception {
		BookDaoImpl bookDaoImpl = BookDaoImpl.getInstance();
		bookDaoImpl.insert(new BookDto("aaa","길동이","발행자a","1234-1234"));
	}
}
