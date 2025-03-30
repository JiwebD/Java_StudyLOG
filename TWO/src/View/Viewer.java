package View;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Controller.FrontController;







public class Viewer {

	//사용자의 상태정보
	private String userid; // UserId
	private String username; // Username
	private String role;
	private Scanner sc = new Scanner(System.in);

	private FrontController controller;		//FrontController와 연결

	public Viewer() throws Exception {
		controller = FrontController.getInstance();
	}

	

	public void MainMenu() {

		while (true) {
			System.out.println("--------------------------");
			System.out.println("MAIN");
			System.out.println("--------------------------");
			System.out.println("1 도서서비스");
			System.out.println("2 인증서비스");
			System.out.println("3 대여서비스");
			System.out.println("4 예약서비스");
			System.out.println("5 종료");
			System.out.print("번호 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				도서서비스Menu();
				break;
			case 2:
				loginMenu();
				break;
			case 3:
				JoinMenu();
				break;
			case 4:
				JoinMenu();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				System.exit(-1);
			}
		}

	}
	


	private void JoinMenu() {
		// TODO Auto-generated method stub
		
	}



	private void loginMenu() {
		// TODO Auto-generated method stub
		
	}



	public void 도서서비스Menu() {
		while (true) {
			System.out.println("--------------------------");
			System.out.println("도서서비스");
			System.out.println("--------------------------");
			System.out.println("[도서]	");
			System.out.println("1 도서추가하기");
			System.out.println("2 단건 조회");
			System.out.println("3 전체 조회");
			System.out.println("4 수정하기");
			System.out.println("5 삭제하기");
			System.out.println("6 이전으로");
			System.out.print("번호 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				도서추가Menu();
				
				break;
			case 2:
				단권조회Menu();
				break;
			case 3:
				전체조회Menu();
				break;
			case 4:
				수정Menu();
				break;
			
			case 5:
				삭제Menu();
				break;
				
			case 6:
				MainMenu();
				break;

			}

		}
	}
	
	private void 도서추가Menu() {

		System.out.println("--------------------------");
		System.out.println("도서추가하기");
		System.out.println("--------------------------");
		System.out.print("도서코드 : ");
		String code = sc.next();
		System.out.print("분류번호 : ");
		String ClfID = sc.next();
		System.out.print("저자 : ");
		String author = sc.next();
		System.out.print("도서이름 : ");
		String name = sc.next();
		System.out.print("출판사 : ");
		String psher = sc.next();
		System.out.print("예약상태 : ");
		String isrv = sc.next();

		//View에서 요청정보 담기
		Map<String,Object> params = new HashMap();
		params.put("endPoint", "/book");//endPoint
		params.put("serviceNo", 1);	//ServiceNo
		//도서등록 - 인자전달
		params.put("bookCode", code);
		params.put("classificationId", ClfID);
		params.put("bookAuthor", author);
		params.put("bookName", name);
		params.put("publisher", psher);
		params.put("isreserve", isrv);

		
		//요청하기
		Map<String,Object> response = controller.execute(params);
		
		//응답확인
		
		for(String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
			
		}
		
	}







	private void 전체조회Menu() {
		System.out.println("--------------------------");
		System.out.println("도서 전체조회");
		System.out.println("--------------------------");

		// View에서 요청정보 담기
		Map<String, Object> params = new HashMap();
		params.put("endPoint", "/book");	// endPoint
		params.put("serviceNo", 3);			// ServiceNo

		// 요청하기
		Map<String, Object> response = controller.execute(params);

		// 응답확인
		for (String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
		}
		
	}



	private void 단권조회Menu() {
		System.out.println("--------------------------");
		System.out.println("도서 단건조회");
		System.out.println("--------------------------");
		System.out.print("도서코드 : ");
		String code = sc.next();

		// View에서 요청정보 담기
		Map<String, Object> params = new HashMap();
		params.put("endPoint", "/book");	// endPoint
		params.put("serviceNo", 2);			// ServiceNo
		params.put("bookCode", code);		// 조회할 도서코드

		// 요청하기
		Map<String, Object> response = controller.execute(params);

		// 응답확인
		for (String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
		}
		
	}
	

	private void 수정Menu() {
		System.out.println("--------------------------");
		System.out.println("도서 수정하기");
		System.out.println("--------------------------");
		System.out.print("도서코드 : ");
		String code = sc.next();
		System.out.print("분류번호 : ");
		String ClfID = sc.next();
		System.out.print("저자 : ");
		String author = sc.next();
		System.out.print("도서이름 : ");
		String name = sc.next();
		System.out.print("출판사 : ");
		String psher = sc.next();
		System.out.print("예약상태 : ");
		String isrv = sc.next();

		// View에서 요청정보 담기
		Map<String,Object> params = new HashMap();
		params.put("endPoint", "/book");	// endPoint
		params.put("serviceNo", 4);			// ServiceNo
		params.put("bookCode", code);
		params.put("classificationId", ClfID);
		params.put("bookAuthor", author);
		params.put("bookName", name);
		params.put("publisher", psher);
		params.put("isreserve", isrv);

		// 요청하기
		Map<String,Object> response = controller.execute(params);

		// 응답확인
		for(String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
		}
		
	}

	private void 삭제Menu() {
		System.out.println("--------------------------");
		System.out.println("도서 삭제");
		System.out.println("--------------------------");
		System.out.print("삭제할 도서코드 : ");
		String code = sc.next();

		// View에서 요청정보 담기
		Map<String, Object> params = new HashMap();
		params.put("endPoint", "/book");	// endPoint
		params.put("serviceNo", 5);			// ServiceNo
		params.put("bookCode", code);		// 삭제할 도서코드

		// 요청하기
		Map<String, Object> response = controller.execute(params);

		// 응답확인
		for (String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
		}
		
	}








}
