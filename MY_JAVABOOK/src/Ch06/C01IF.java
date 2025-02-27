package Ch06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
		// --------------------
		// 단순 IF
		// --------------------
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		if (age >= 8)
//			System.out.println("학교에 다닙니다.");
//		System.out.println("첫번째 IF 코드 블럭 종료..");
//		
//		if (age < 8)
//			System.out.println("학교에 다니지 않습니다.");
//		
//		System.out.println("두번째 IF 코드 블럭 종료..");
//		System.out.println("프로그램을 종료합니다.");
//
//		sc.close();

		// --------------------
		// IF-ELSE
		// --------------------
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		if (age >= 8)
//			System.out.println("학교에 다닙니다.");
//		else
//			System.out.println("학교에 다니지 않습니다.");
//			
//		System.out.println("프로그램을 종료합니다.");
//
//		sc.close();

		// 문제
		// 정수 한개값을 입력받아 3의 배수이면 해당 수를 출력하세요
		// 3의 배수이면서 5의 배수라면 출력

//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 값을 입력하세요 : ");
//		int num = sc.nextInt();
//
//		// 3의 배수인지 확인
//		if (num % 3 == 0) {
//			System.out.printf("%d는 3의 배수입니다.\n", num);
//
//			if (num % 3 == 0 && num % 5 == 0) {
//				System.out.printf("%d는 3의 배수이면서 5의 배수입니다.", num);
//			}
//
//		} else
//			System.out.printf("%d는 3의배수가 아닙니다.", num);
//
//		sc.close();

		// 문제
		// 두개의 정수를 입력받아 큰 수 출력

//		Scanner sc = new Scanner(System.in);
//		System.out.print("두개의 정수 값를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		if(num1 >= num2) {
//			System.out.printf("첫번째 입력한 수 %d이 더 큽니다.", num1);	
//		}
//		else {
//			System.out.printf("두번째 입력한 수 %d이 더 큽니다.", num2);
//		}

		// 문제
		// 세 개의 정수를 입력받아 큰 수 출력

//		Scanner sc = new Scanner(System.in);
//		System.out.print("두개의 정수 값를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		
//		// 모범답안. 데이터 공간을 적게 쓸수록, 연산이 적을 수록 좋은 코드
//		int max = num1; // 최대값(max)이 n1이라고 가정 시작 - !
//
//		if (max < num2) {
//			max = num2;
//		}
//		if (max < num3) {
//			max = num3;
//		}
//
//		System.out.println("큰 수 : " + max);
//		sc.close();
		
		
		// 답 2
//		if(num1 > num2) {
//			if(num1 > num3) {
//				System.out.printf("첫번째 입력한 %d가 제일 큽니다.", num1);
//			}
//			else {
//				System.out.printf("세번째 입력한 %d가 제일 큽니다.", num3);
//			}
//		}
//		else {
//			if(num2 > num3) {
//				System.out.printf("두번째 입력한 %d가 제일 큽니다.", num2);
//			}
//			else {
//				System.out.printf("세번째 입력한 %d가 제일 큽니다.", num3);
//			}
//		}

		// 답 3
//		if(num1 >= num2 && num1 >= num3)
//			System.out.printf("%d", num1);
//		if(num2 >= num1 && num2 >= num3)
//			System.out.printf("%d", num2);
//		if(num3 >= num1 && num3 >= num2)
//			System.out.printf("%d", num3);

		// 문제
		// 세개의 정수를 입력받아 해당수의 합과 평균을 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("세개의 정수 값를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		
//		System.out.printf("총합 : %d\n", (num1 + num2 + num3));
//		System.out.printf("평균 : %.1f", (double)((num1 + num2 + num3)/3));

//		System.out.println("총합 : " + (num1 + num2 + num3));
//		System.out.println("평균 : " + ((double)(num1 + num2 + num3)/3));
		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
		
//		int sum = num1 + num2 + num3; 
//		double avg = (double)sum/3;
		
//		System.out.println("총합 : " + sum);
//		System.out.println("평균 : " + avg);
//		

		
//		System.out.println("총합 : " + (num1 + num2 + num3));
//		System.out.println("평균 : " + ((double)(num1 + num2 + num3)/3));

		// 문제
		// 입력한 수가 짝수이고, 3의 배수라면 출력
		// 입력한 수가 홀수이고, 5의 배수라면 출력

//		Scanner sc = new Scanner(System.in);
//		System.out.print("하나의 정수 값을 입력하세요 : ");
//		int num1 = sc.nextInt();
//
//		if (num1 % 2 == 0 && num1 % 3 == 0) {
//			System.out.printf("입력한 수 %d는 짝수이며 3의 배수입니다.", num1);
//		} else {
//			if (num1 % 2 == 1 && num1 % 5 == 0) {
//				System.out.printf("입력한 수 %d는 홀수이며 5의 배수입니다.", num1);
//			}
//		}
		
		
		// --------------------
		// IF-ELSE IF-ELSE
		// --------------------
		// 과목1, 2, 3, 4 중 하나라도 40점 미만이면 불합격
		// 과목평균이 100점만점 기준으로 60점 미만이면 불합격
		// 아니면 불합격
		
//		Scanner sc = new Scanner(System.in);
//		
//		int 과목1 = sc.nextInt();
//		int 과목2 = sc.nextInt();
//		int 과목3 = sc.nextInt();
//		int 과목4 = sc.nextInt();
//		double 평균 = (double)(과목1 + 과목2 + 과목3 + 과목4)/4;
//		
//		if(과목1<40) {
//			System.out.println("불합격");
//		}
//		else if(과목2<40)		//과목1>=40 && 과목2<40
//		{
//			System.out.println("불합격");
//		}
//		else if(과목3<40)		//과목1>=40 && 과목2>=40 &&과목3<40
//		{
//			System.out.println("불합격");
//		}
//		else if(과목4<40)		//과목1>=40 && 과목2>=40 &&과목3>=40 &&과목4<40
//		{
//			System.out.println("불합격");
//		}
//		else if(평균<60)	//과목1>=40 && 과목2>=40 &&과목3>=40 &&과목4<40 && 평균<60
//		{
//			System.out.println("불합격");
//		}
//		else //과목1>=40 && 과목2>=40 &&과목3>=40 &&과목4<40 && 평균>=60
//		{
//			System.out.println("합격");
//		}
//		sc.close();
		
		
		//문제
		
		//시험 점수를 입력받아
		//90 ~ 100점은 A,
		//80 ~ 89점은 B,
		//70 ~ 79점은 C,
		//60 ~ 69점은 D,
		//나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		
//		Scanner sc = new Scanner(System.in);
//		
//		int 점수 = sc.nextInt();
//		if(점수 > 89) {
//			System.out.println("A");
//		}
//		else if(점수 >79)
//		{
//			System.out.println("B");
//		}
//		else if(점수 >69)
//		{
//			System.out.println("C");
//		}
//		else if(점수 >59)
//		{
//			System.out.println("D");
//		}
//		else
//		{
//			System.out.println("F");
//		}

		
		//문제
		
		//나이별로 요금을 부과하는 else if문을 만드세요.
		//8세 미만 : 요금은 1000원
		//14세미만 : 요금은 2000원
		//20세미만 : 요금은 2500원
		//20세이상 : 요금은 3000원
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int 나이 = sc.nextInt();
		
		if(나이 < 8) {
			System.out.println("8세 미만 : 요금은 1000원");
		}
		else if(나이 <14)
		{
			System.out.println("14세미만 : 요금은 2000원");
		}
		else if(나이 <20)
		{
			System.out.println("20세미만 : 요금은 2500원");
		}
		else
		{
			System.out.println("20세이상 : 요금은 3000원");
		}

	}

}
