package Ch06;

import java.util.Scanner;

public class C03SWITCH {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		

		while(true) {
			System.out.println("---------- JOIN MENU ----------");
			System.out.println("1 이메일 인증");
			System.out.println("2 아이디 입력");
			System.out.println("3 패스워드 입력");
			System.out.println("4 패스워드 확인");
			System.out.println("5 연락처 이력");
			System.out.println("6 회원가입 요청");
			System.out.println("7 종료");
			System.out.println("---------- JOIN MENU ----------");
			System.out.println("번호 입력 : ");
			num = sc.nextInt();
			switch(num)
			{
			case 1:							//case (ranking>=1)같은 조건식 을 넣을 수 없다.
				System.out.println("이메일 인증처리 작업 - ");
				break;						//break가 없으면 다음 case까지 계속 실행
			case 2:
				System.out.println("이메일 개인정보 입력 작업 - ");
				break;
			case 3:
				System.out.println("회원가입 처리 작업 - ");
				break;
			case 4:
				System.out.println("JOIN 메뉴 종료 - ");
				System.exit(-1);										
				break;
//			case 4에서 "JOIN 메뉴 종료 -"를 출력한 후 System.exit(-1);을 실행하여 프로그램을 강제 종료함.
//			System.exit(int status);에서 status 값이 0이면 정상 종료, -1이면 비정상 종료를 의미함.
//			즉, case 4를 선택하면 프로그램이 즉시 종료됨!
			case 5:
				System.out.println("잘못된 메뉴번호를 입력하셨습니다. - ");
				break;
			}
		}
		
	}

}
