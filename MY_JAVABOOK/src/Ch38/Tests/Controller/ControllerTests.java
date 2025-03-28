package Ch38.Tests.Controller;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import Ch38.Controller.FrontController;

class ControllerTests {
	
	FrontController fc = FrontController.getInstance();
	

	@Test
	@Disabled
	void test() {
		
		//View에서 요청정보 담기
		Map<String,Object> params = new HashMap();
		params.put("endPoint", "/user");//endPoint
		params.put("serviceNo", 1);	//ServiceNo
		//회원가입 - 인자전달
		params.put("userid", "eeeee");	//ServiceNo
		params.put("username", "홍길동");	//ServiceNo
		params.put("password", "1234");	//ServiceNo
		
		//요청하기
		Map<String,Object> response = fc.execute(params);
		
		//응답확인
		for(String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
		}
	}
	@Test

	void test2() {
		
		//View에서 요청정보 담기
		Map<String,Object> params = new HashMap();
		params.put("endPoint", "/book");//endPoint
		params.put("serviceNo", 1);	//ServiceNo
		//도서등록 - 인자전달
		params.put("bookCode", "02345678");	//ServiceNo
		params.put("bookName", "이게뭘까요");	//ServiceNo
		params.put("publisher", "왓미디어");	//ServiceNo
		params.put("isbn", "1111-1111");	//ServiceNo
		
		//요청하기
		Map<String,Object> response = fc.execute(params);
		
		//응답확인
		for(String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
		}
	}
	

}
