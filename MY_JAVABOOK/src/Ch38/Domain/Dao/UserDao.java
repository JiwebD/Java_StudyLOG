package Ch38.Domain.Dao;

import java.sql.SQLException;
import java.util.List;

import Ch38.Domain.Dto.UserDto;

public interface UserDao {
	//인터페이스화 하는법 UserDaoImpl.java 우클릭 >
	//Refator > Extract Interface..
	//인터페이스 이름 UserDao > select all선택 > OK
	
	//CRUD 
	int insert(UserDto userDto) throws Exception;

	int update(UserDto userDto);

	int delete(UserDto userDto);

	//단건조회
	UserDto select(UserDto userDto);

	//다건조회
	List<UserDto> selectAll();

}