package Ch03;

public class C04TypeChange {

	public static void main(String[] args) {
		//상수 연산식(int 보다 작은 변수자료형(short, char , byte))
		//int 로 자동 형변환
		byte x = 10;
		byte y = 20;
//		byte result1 = x + y;			//자바에서 연산을 하게되면 작은자료형은 int로 변환됨
										//램에서 x,y를 cpu로 가져와서 + 계산을할때 int형으로 계산
//		byte result1 = (byte)(x + y);
//		System.out.println(result1);
//		
//		int result2 = x + y;			//애초에 int자료형으로 저장
//		System.out.println(result1);
		
		
		//정수 연산식(int 보다 큰 변수자료형(long))
		//큰 타입으로 자동 형 변환
//		byte var1 = 10;
//		int var2 = 100;
//		long var3 = 1000L;
//		int result = var1 + var2 + var3;	//큰 값의 long값을 작은공간int에 저장 할 수 없음
//		int result = (int)(var1 + var2 + var3);
		
//		long result2 = var1 + var2 + var3;	//애초에 long자료형에 저장하는 법
//		System.out.println(result2);
		
		
		//실수연산식
		//큰 타입으로 자동 형 변환
		int intvar = 10;
		float flvar = 3.3F;
		double dbvar = 5.5;
		int result3 = (int)(intvar + flvar + dbvar);	//intvar , flvar 가  각각 double 형으로 형변환된값이 더해져서 result 3에 저장
		double result4 = intvar + flvar + dbvar;
		System.out.println(result3);
		System.out.println(result4);

	}

}
