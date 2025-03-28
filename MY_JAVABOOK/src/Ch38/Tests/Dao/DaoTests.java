
package Ch38.Tests.Dao;

import java.sql.SQLException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import Ch38.Domain.Dao.BookDao;
import Ch38.Domain.Dao.BookDaoImpl;
import Ch38.Domain.Dao.UserDao;
import Ch38.Domain.Dao.UserDaoImpl;
import Ch38.Domain.Dto.BookDto;
import Ch38.Domain.Dto.UserDto;

class DaoTests {

	@Test
	void test1() throws ClassNotFoundException, SQLException {
		
//		UserDaoImpl userDaoImpl = UserDaoImpl.getInstance();
		
		BookDao bookDaoImpl = BookDaoImpl.getInstance();
	}

	
	
	@Test

	void test2() throws Exception{
		UserDao userDaoImpl = UserDaoImpl.getInstance();
		userDaoImpl.insert(new UserDto("eee","홍길동","12121234",""));
	}
	
	@Test
	@Disabled
	void test3() throws Exception {
		BookDao bookDaoImpl = BookDaoImpl.getInstance();
		bookDaoImpl.insert(new BookDto("aaa","길동이","발행자a","1234-1234"));
	}
}
