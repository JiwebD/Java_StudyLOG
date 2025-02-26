package Ch05;

import java.util.Scanner;

public class C02Ex {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		
		//1.문제(삼항연산자)
		// 키보드로 국어/영어/수학 점수를 입력받아 각각의부분점수가 40점이상이고
		// 총점수 평균이 70점이상이면 '합격'
		// 미만이면 '불합격'을 출력합니다
		
//		System.out.print("국어/영여/수학 점수를 입력 : ");
//		String strn1 = sc.next();
//
//		String strn2 = sc.next();
//
//		String strn3 = sc.next();
//
//		int kori = Integer.parseInt(strn1);
//		int engl = Integer.parseInt(strn2);
//		int math = Integer.parseInt(strn3);
//		
//		double average = (double)(kori + engl + math)/3;
//		System.out.println("평균 : "+average);
//		
//		String result = (kori>=40&&engl>=40&&math>=40&&average>=70) ? "합격" : "불합격";
//		System.out.println(result);
//		
//		sc.close();
		
		//2.미니문제(%연산자)
		//키보드로 부터 정수값 2 를 입력받아
		//두수의 합이 짝수이면 "짝수입니다"
		//홀수이면 "홀수입니다" 를 출력하세요~
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("첫번째 값을 입력하세요 :");
		int n1 = sc.nextInt();
		System.out.print("두번째 값을 입력하세요 :");
		int n2 = sc.nextInt();
		
		int sum = n1+n2;
		
		String result2 = sum%2==0 ? "짝수입니다." : "홀수입니다.";
		
		System.out.println(result2);
	
		sc.close();
//		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("두 수 입력 : " );
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		
//		String result =  ((n1+n2)%2==0)?"짝수입니다" : "홀수입니다" ; 
//		System.out.println(result);
		

	}

}
