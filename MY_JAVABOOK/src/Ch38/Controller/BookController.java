package Ch38.Controller;

import java.util.HashMap;
import java.util.Map;

import Ch38.Domain.Dto.BookDto;

public class BookController implements SubController {
	
	Map<String, Object> response ;
	
	//C(1)R(2)U(3)D(4)
	@Override
	public Map<String,Object> execute (Map<String,Object> params){
		System.out.println("[SC] BookController execute invoke..!");
		
		//컨트롤러할 일.
		//00
		response = new HashMap();
		Integer serviceNo = (Integer)params.get("serviceNo");
		if(serviceNo == null) {
			response.put("status", false);
			response.put("message", "유효하지 않은 서비스 요청입니다.");
			return response;
		}
		switch(serviceNo) {
		case 1:				//C = 도서등록(ROLE-사서)
			System.out.println("[SC] 도서등록 요청 확인");
			//01 요청 파라미터받기
			String bookCode = (params.get("bookCode")!=null)?(String)params.get("bookCode"):null;
			String bookName = (params.get("bookName")!=null)?(String)params.get("bookName"):null;
			String publisher = (params.get("publisher")!=null)?(String)params.get("publisher"):null;
			String isbn = (params.get("isbn")!=null)?(String)params.get("isbn"):null;
			
			BookDto bookDto = new BookDto(bookCode, bookName, publisher, isbn);
			
			//02 유효성검증(Validation)
			boolean isOk = isValid(bookDto);
			System.out.println("[N0-1 도서등록] : 유효성 검증 확인 : " + isOk );
			if(!isOk) {
				response.put("status", false);
				return response;
			}
			//03 관련 서비스 실행
			//04 뷰로 이동(or 내용전달)
			break;
		case 2:				//R = 도서조회(ROLE-회원,사서,관리자)
			System.out.println("[SC] 도서조회 요청 확인");
			//01 요청 파라미터받기
			//02 유효성검증(Validation)
			//03 관련 서비스 실행
			//04 뷰로 이동(or 내용전달)
			break;
		case 3:
			System.out.println("[SC] 도서수정 요청 확인");
			//01 요청 파라미터받기
			//02 유효성검증(Validation)
			//03 관련 서비스 실행
			//04 뷰로 이동(or 내용전달)
			break;
		case 4:
			System.out.println("[SC] 도서삭제 요청 확인");
			//01 요청 파라미터받기
			//02 유효성검증(Validation)
			//03 관련 서비스 실행
			//04 뷰로 이동(or 내용전달)
			break;
		default :
			System.out.println("[SC] 잘못된 서비스번호 요청 확인");
			response.put("status", false);
			response.put("message", "잘못된 서비스번호 요청입니다.");
		}
		
		return response;
	}

	private boolean isValid(BookDto bookDto) {
		if(bookDto.getBookCode()==null || bookDto.getBookCode().length()!=8) {
			response.put("error", "bookCode의 길이는 8자리만 허용합니다.");
			System.out.println("[INVALID] bookCode의 길이는 8자리만 허용합니다.");
			return false;
		}
		if(bookDto.getBookCode().matches("[0-9]+")) {
			response.put("error", "bookCode의 숫자만 허용합니다.");
			System.out.println("[INVALID] bookCode의 숫자만 허용합니다.");
			return false;
		}
		if(bookDto.getBookName().length()>255) {
			response.put("error", "bookName의 길이는 255자를 넘기지 않아야 합니다.");
			System.out.println("[INVALID] bookName의 길이는 255자를 넘기지 않아야 합니다.");
			return false;
		}
		return true;
	}
	

}
