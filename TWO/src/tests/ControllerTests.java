//package tests;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.junit.jupiter.api.Test;
//
//import Controller.FrontController;
//
//
//
//class ControllerTests {
//	FrontController fc = FrontController.getInstance();
//	@Test
//	void test() {
//		//View에서 요청정보 담기
//		Map<String,Object> params = new HashMap();
//		params.put("endPoint", "/book");//endPoint
//		params.put("serviceNo", 1);	//ServiceNo
//		//도서등록 - 인자전달
//		params.put("bookCode", "05345678");	//ServiceNo
//		params.put("bookName", "이게뭘까요");
//		//ServiceNo
//		params.put("publisher", "왓미디어");	//ServiceNo
//		params.put("isbn", "1111-1111");	//ServiceNo
//		
//		//요청하기
//		Map<String,Object> response = fc.execute(params);
//		
//		//응답확인
//		
//		for(String key : response.keySet()) {
//			System.out.println(key + " : " + response.get(key));
//			
//		}
//	}
//
//}
