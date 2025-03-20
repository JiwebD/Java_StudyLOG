package Ch31;

import java.util.Scanner;

interface Printer{
//	void print_1(String message);		//추상메서드
//	String print_2(String message);		//추상메서드
	String print();					//추상메서드
}
public class C02LAMDA {

	public static void main(String[] args) {
		//01
//		Printer printer = (message)->{System.out.println(message);};
//		printer.print_1("HELLOWORLD");
		
//		(message) ==> print_1(String message) 메서드의 매개변수에 해당
//		{System.out.println(message);} ==> print_1의 구현 부분
		
		//02
//		Printer printer = (message)->{return message+"_HELLOWORLD";}; //람다식 입력		
		// 간략화 가능 (한 개의 매개변수는 () 생략 가능, 한 줄 반환은 {} 생략 가능)
//		Printer printer = message->message+"_HELLOWORLD"; //약식
//		String returnValue = printer.print_2("TEST");
//		System.out.println(returnValue);	//TEST_HELLOWORLD가 출력
		
		//03 (키보드로 입력받아 String 반환)
		Printer printer = ()->{
			Scanner sc = new Scanner(System.in);
			System.out.print("입력 : ");
			String str = sc.nextLine();
			sc.close();
			return str;
			};
		
		String returnValue = printer.print();
		System.out.println(returnValue);
			
		

	}

}
