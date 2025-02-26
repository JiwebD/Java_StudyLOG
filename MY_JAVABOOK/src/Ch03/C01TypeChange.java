package Ch03;

public class C01TypeChange {

	public static void main(String[] args) {
		// (자료)형변환
		// 연산시 일치하지 않는 자료형을 일치시키는 작엄

		// 자동형변환(암시적 형변환) : 컴파일러에 의해 자동 형변환
		// 강제형변환(명시적 형변환) : 프로그래머에 의해 강제 형변환

		// 자동형변환(=)
		// '변수 연산처리'시 범위가 넓은 공간에 작은값이 대입되는 경우
		// '리터럴 상수 연산처리'시 리터럴값에 따른 형변환 여부 결정
		// ex

//		byte a = 10;
//		int b = a;
		// byte > short,char > int > long > float > double
		// long(8byte) > float(4byte)

		byte byteValue = 10; // 상수풀에 int(4byte) 10 저장 > byte형 byteValue변수 공간에 대입할때 10이란 값이 1byte를 넘지 않으니 알아서
								// 1byte로 변환해서 저장
		int intValue = byteValue; // byte자료형 > int자료형으로 자동 형변환 된다.
		System.out.println("intValue: " + intValue);

		char charValue = '가';
		intValue = charValue; // char자료형 > int자료형으로 자동 형변환 된다.
		System.out.println("가 의 유니코드 : " + intValue);

		intValue = 50;
		long longValue = intValue; // int자료형 > long자료형으로 자동 형변환 된다.
		System.out.println("longValue : " + longValue);

		longValue = 100;
		float floatValue = longValue; // long자료형 > float자료형으로 자동 형변환 된다.
		System.out.println("floatValue : " + floatValue);

		floatValue = 100.5F;
		double doubleValue = floatValue; // float자료형 > double자료형으로 자동 형변환 된다.
		System.out.println("doubleValue : " + doubleValue);

	}

}
