package Ch04;

import java.util.Scanner;

public class C01Scanner {

	public static void main(String[] args) {
		
		//자동 import : ctrl + shift + o
		//자동 formatting : ctrl + shift + f
		
		//스트림 : 시냇물, 물줄기(단방향성) = 데이터의 이동 통로
		//System.in :	표준입력 스트림 생성(요청)   키보드(표준입력장치)		--(System.in)-->	OS>java.app(Scanner sc = new Scanner(System.in));
		//System.out :	표준출력 스트림 생성(요청)   			OS		--(System.out)-->	모니터(표준출력장치)
		//
		//코드 해석
		//new Scanner(System.int) : 표준입력 스트림을 연결한 Scanner객체 생성
		//Scanner sc : 생성된 Scanner객체의 위치정보(메모리주소)를 저장한 참조변수 sc
		//Scanner sc = new Scanner(System.in);
		//- 표준입력스트림에 연결된 Scanner객체를 생성 이후
		//	위치정보를 main Stack영역의 Scanner sc 참조변수에 초기화
		
		Scanner sc = new Scanner(System.in);

		
		System.out.printf("num1 입력 : ");
		int num1 = sc.nextInt(); // 엔터(\n),스페이스바를 기준으로 값을 구분함
		System.out.printf("num2 입력 : ");
		
		int num2 = sc.nextInt();
		System.out.println("num3 입력 : ");
		
		int num3 = sc.nextInt();
		System.out.println("num4 입력 : ");
		
		int num4 = sc.nextInt();
		
		int sum = num1 + num2 + num3 + num4;
		System.out.printf("%d + %d + %d + %d = %d \n", num1, num2, num3, num4, sum);
		

	}

}
