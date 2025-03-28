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
	public void JoinMenu() {
		System.out.println("--------------------------");
		System.out.println("회원정보 입력");
		System.out.println("--------------------------");
		System.out.print("USERID : ");
		String id = sc.next();
		System.out.print("USERNAME : ");
		String name = sc.next();
		System.out.print("PASSWORD : ");
		String pw = sc.next();
		
		//요청처리
		Map<String, Object> params = new HashMap();
		params.put("endPoint", "/user");
		params.put("serviceNo", 1);
		params.put("userid", id);
		params.put("username", name);
		params.put("password", pw);
		
		Map<String,Object> response = controller.execute(params);
		
		for(String key : response.keySet())
			System.out.println(key + " : " + response.get(key));
		
	}
	
	
	
	public void loginMenu() {
		System.out.println("--------------------------");
		System.out.println("로그인");
		System.out.println("--------------------------");
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();


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

	private void 삭제Menu() {
		
		
	}



	private void 수정Menu() {
		// TODO Auto-generated method stub
		
	}



	private void 전체조회Menu() {
		// TODO Auto-generated method stub
		
	}



	private void 단권조회Menu() {
		// TODO Auto-generated method stub
		
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



	private void 도서조회Menu() {
		// TODO Auto-generated method stub
		
	}



	public void 회원Menu() {
		while (true) {
			System.out.println("--------------------------");
			System.out.println("회원메뉴");
			System.out.println("--------------------------");
			System.out.println("[도서]			[회원]			[대여]");
			System.out.println("1 도서조회하기		5 나의 정보조회		8 대여 도서 조회");
			System.out.println("2 도서추가하기		6 나의 정보수정		9 대여 도서 예약");
			System.out.println("3 도서수정하기		7 회원 탈퇴					");
			System.out.println("4 도서삭제하기									");

			System.out.println("10 이전으로");
			System.out.println("11 로그아웃");
			System.out.print("번호 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;

			case 5:
				return;

			}
		}
	}

	public void BookMenu() {
		System.out.println("--------------------------");
		System.out.println("도서 정보 입력");
		System.out.println("--------------------------");
		System.out.printf("도서코드 도서명 출판사 ISBN순으로 입력 : ");
		int bookcode = sc.nextInt();
		String bookname = sc.next();
		String publisher = sc.next();
		String isbn = sc.next();

		// 컨트롤러 호출!

	}

	public void MemberMenu() {
		System.out.println("--------------------------");
		System.out.println("회원 정보 입력");
		System.out.println("--------------------------");
		System.out.printf("ID PW USERNAME ROLE 순으로 입력 : ");
		String id = sc.next();
		String pw = sc.next();
		String username = sc.next();
		String role = sc.next();

	}

	public void LendMenu() {
		System.out.println("--------------------------");
		System.out.println("대여 정보 입력");
		System.out.println("--------------------------");

		System.out.printf("BOOKCODE USERID 입력 : ");
		int bookcode = sc.nextInt();
		String id = sc.next();

	}

}
