package Ch07;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {

		// 10반복문 - "HELLO WORLD"
		// 탈출용 변수 : i=0
		// 탈출용 조건식 : i<10
		// 탈출용 연산식 : i++

//		while(조건식) {
//			조건식이 true 인동안 실행되는 종속문장
//		}

		// 01 기본 - HELLO WORLD 10회 반복
//		int i=0;
//		while(i<10) {
//			System.out.println("HELLOW WORLD");
//			i++;
//		}

		// 02 기본 - HELLO WORLD N회 반복
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i=0;
//		while(i<n) {
//			System.out.println("HELLOW WORLD");
//			i++;
//		}

		// 03 기본 - 1부터 10까지의 합

//		int i = 1;		//탈출용변수
//		int sum = 0;
//		while(i<=10)	//탈출용 조건식
//		{
//			System.out.println("i : " + i);
//			sum = sum + i;
//			i++;			//탈출용 연산식
//		}
//		System.out.println("SUM : " + sum);

		// i sum print
		// 1 0+1 i=1 출력
		// 2 1+2 i=2 출력
		// 3 3+3 i=3 출력
		// 4 6+4 i=4 출력
		// 5 10+5 i=5 출력
		// 6 15+6 i=6 출력
		// 7 21+7 i=7 출력
		// 8 28+8 i=8 출력
		// 9 36+9 i=9 출력
		// 10 45+10 i=10 출력

		// 04 기본 - 1부터 N까지 합
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		int sum = 0;
//		int i = 1;

//		while(i<=N) {
//			sum = sum+i;
//			i++;
//		}
//		System.out.println("1부터 N까지 총합 : " + sum);

		// 05 기본 - N부터 M까지 합(N<M) - N>=M 인경우 N과 M을 Swap하고 진행합니다.
//		Scanner sc = new Scanner(System.in);

//		System.out.print("N값 , M값을 입력하세요 : ");
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		int sum = 0;
//		int i = N;
//		
//		if (N<M) {
//			while(i<=M) {
//				sum = sum+i;
//				i++;
//			}	
//		}
//
//		
//		else if (N>=M) {
//			i = M;
//			while(i<=N) {
//				sum = sum+i;
//				i++;				
//			}
//		}
//		System.out.println(sum);

//		Scanner sc = new Scanner(System.in);
//		
//
//		System.out.print("N값 , M값을 입력하세요 : ");
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		int sum = 0;
//
//		
//		if (N>M) {
//			int tmp = N; //주로 데이터를 잠시 보관할 때 사용됨.
//			N = M;
//			M = tmp;
//		}
//		int i = N;			//탈출용 변수
//		while(i<=M)			//탈출용 조건식 
//		{
//			sum = sum + i;	//sum += i;
//			i++;			//탈출용 연산식
//		}
//		System.out.println("총합 : " + sum);
//		
//		sc.close();

		// 06 N - M까지 수중(N<M) 짝수의 합, 홀수의 합을 각각 구해서 출력하세요.
		// 예시)
		// n = 3(키보드로 입력된 값)
		// m = 7(키보드로 입력된 값)
		// 짝수의 합 : 10
		// 홀수의 합 : 15

//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("n값을 입력하세요 : ");
//		int n = sc.nextInt();
//		System.out.print("m값을 입력하세요 : ");
//		int m = sc.nextInt();

//		if (n>m) {
//		int tmp = n; //주로 데이터를 잠시 보관할 때 사용됨.
//		n = n;
//		m = tmp;
//		}
//
//		int i = n;
//		int sum1 = 0;		//짝수 합
//		int sum2 = 0;		//홀수 합
//
//		while (i <= m) {
//			if (i % 2 == 0) {
//				System.out.println("짝수 : " + i);
//				sum1 += i;
//			}
//			else {
//				System.out.println("홀수 : " + i);
//				sum2 += i;
//			}
//			i++;
//		}
//		System.out.println("짝수 합 : " + sum1);
//		System.out.println("홀수 합 : " + sum2);

		// 07 1 - N 까지 수중에 4의 배수를 출력하고 4의배수가 아닌 나머지의 합을 구하세요.
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("n값을 입력하세요 : ");
//		int n = sc.nextInt();
//
//		
//		int i = 1;
//		int sum = 0;
//		while(i <= n) {
//			if(i%4 == 0) {
//				System.out.println("4의 배수 : "+ i);
//			}
//			else {
//				sum += i;
//			}
//			i++;
//		}
//		System.out.println("4의 배수가 아닌 나머지 수 합 : " + sum);

		// 08 구구단 N단을 출력합니다.(2<=N<=9)
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("n값을 입력하세요 : ");
//		int n = sc.nextInt();
//
//
//
//		while (n < 2 || n > 9) {
//			System.out.println("구구단이니까 2 - 9이하 값을 입력하세요");
//			System.out.print("n값을 입력하세요 : ");
//			n = sc.nextInt();
//		}
//		int i = 1;
//		while (i <= 9) {
//			System.out.printf("%d X %d : %d\n", n, i, n*i);
//			i++;
//		}
		
		
	}

}
