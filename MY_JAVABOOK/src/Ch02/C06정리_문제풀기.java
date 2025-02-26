package Ch02;

public class C06정리_문제풀기 {

	public static void main(String[] args) {
//		정수 타입 		: byte,short,int ,long
//		char 타입 	: ' ' 
//		String 타입 	: " "
//		실수 타입 		: double , float
//		논리 타입 		: boolean

		
//		확인 문제1

//		정수타입 
//		1byte : byte
		byte n1 = 127;
//		byte n1 = 128;  //에러남 1000 0000  =>맨 앞 비트가 음수부호라 
		System.out.println(n1);
//		2byte : char / short		
		char n2 = 51111; //(0~2^16-1)	(0~65535)
		short n3 = 32767;
		short n4 = -32768;
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
//		4byte : int 
		int n5 = 1;
		System.out.println(n5);
//		8byte : long 
		long n6 = 10000000000L;
		System.out.println(n6);
//		실수타입
//		4byte : float
		float n7 = 0.123456789123456789F;
		System.out.println(n7);
//		8byte : double
		double n8 = 0.123456789123456789;
		System.out.println(n8);

//		논리타입
//		1byte : boolean
		boolean flag = (10>11);
		if(flag) {
			System.out.println("참 : true");
		}
		else {
			System.out.println("거짓 : false");
		}

		
//		확인문제2

		
//		맞는 코드인지 틀린 코드인지 확인 
//		byte var = 200;							//( x ) 1byte값을 넘어서 에러 
//		char var='AB';							//( x ) 하나의 문자만 가능
//		char var=65;							//( o ) 0~65535 부호없는 정수형으로 유니코드 문자 저장
//		long var=50000000000;					//( x )	
//		float var = 3.14;						//( x ) f접미사 없음 실수의 기본자료는 double인데 64비트를 float32비트에 저장할려니 에러
//		double var = 100.0						//( o ) 
//		String var = "나의직업은 "개발자" 입니다.";		//( x ) "" 안에 ""를 입력하고 싶으면 \" \"로 작성해야한다. 
//		boolean var = 0;						//( x ) 
//		int v2 = 1e2;							//( x ) 1e2 = 10.0000 (실수) = double
//		float var =1e2f;						//( o ) 100.0

//		System.out.println(var);
		

	}

}
