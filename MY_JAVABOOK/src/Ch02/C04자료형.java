package Ch02;

public class C04자료형 {

	public static void main(String[] args) {
		
		//--------------------------
		//정수 int - 4byte 정수 부호 o
		//--------------------------
//		int n1 = 0b10101101;	//2진수값
//		int n2 = 173;			//10진수값
//		int n3 = 0255;			//8진수값
//		int n4 = 0xad;			//16진수값
//		System.out.printf("%d %d %d %d\n", n1,n2,n3,n4);
		
		//--------------------------
		//정수 byte - 1byte 정수 부호 o
		//--------------------------
//		byte n5 = -129;							//자료형 변경 불가 -129는 4byte값인데 1byte에 대입할 수 없음
//		byte n5 = (byte)-129;					//데이터 손실 (4byte)11111111 11111111 11111111 01111111 => (1byte)01111111 = 127
//		System.out.println(n5);
//		byte n6 = -30;
//		byte n7 = 30;
//		byte n8 = 127;
//		byte n9 = (byte)129;					//왜?? (byte)로 강제변환 하지 않을 시 컴파일에러
//		System.out.printf("%d\n",n9);			//왜 ??
//		System.out.println(0b10101101);			//왜 ?? 음수아니지?;;
//		System.out.println(Integer.toBinaryString(-129));
		
		//--------------------------
		//정수 short-2byte정수 부호 o | char-2byte정수 부호x(양수만)
		//--------------------------
//		char n1 = 65536; //(0~2^16-1)	(0~65535)
//		short n2 = 32767; //(-2^15 ~ +2^15-1)(-32768 ~ + 32767)
//		
//		char n3 = 60000;
//		short n4 = n3; //문제발생... 왜??
//		
//		System.out.printf("%d\n",n4);
		
		//--------------------------
		//정수 long-8byte정수 부호 o
		//--------------------------
		
		long n1 = 10000000000L;
		long n2 = 20;		//L,l (리터럴접미사) : long 자료형 사용하여 값 저장
		
		long n3 = 10000000000;//문제발생... 왜?
		long n4 = 10000000000L;
		
	}

}
