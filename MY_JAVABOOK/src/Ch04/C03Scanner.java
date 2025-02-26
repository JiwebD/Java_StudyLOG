package Ch04;

import java.util.Scanner;

public class C03Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//sc.nextInt() , sc.nextLine() 이어서 사용시 출력오류
		//sc.nextInt()에 10을 입력하고 엔터를 하면
		//버퍼공간에 [ 1 0 \n ]이 저장됨
		//num1에 10값만 가져옴
		//버퍼공간에 [\n] 남아있는 상태
		//이어서 sc.nextLine();에 hellow 입력 후 엔터를 하면
		//버퍼공간의 \n을 읽고 종료됨.
		//입력한 hellow 입력은 처리되지 않음.
		
		//해결 법
		//sc.nextInt();
		//sc.nextLine(); 추가 => 버퍼에 남아 있는 `\n` 제거
		//sc.nextLine();
		
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("입력된 정수 값 : " + num1);
		
		sc.nextLine();
		
		System.out.print("문자열 입력(띄어쓰기포함) : ");
		String str2 = sc.nextLine();		//문자열입력받기기능함수, 띄어쓰기 포함 안함
		System.out.println("문자열 : " + str2);
		
//		System.out.print("실수 입력 : ");
//		double num2 = sc.nextDouble();
//		System.out.println("입력된 실수 값 : " + num2);
//		
//		System.out.print("문자열 입력(띄어쓰기포함안함) : ");
//		String str1 = sc.next();		//문자열입력받기기능함수, 띄어쓰기 포함 안함
//		System.out.println("입력된 문자열 : " + str1);
		

		
		
		sc.close();

	}

}
