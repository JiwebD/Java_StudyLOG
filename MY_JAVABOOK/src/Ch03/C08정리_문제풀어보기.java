package Ch03;

public class C08정리_문제풀어보기 {

	public static void main(String[] args) {
//		--------------------------------------------------------
//		정리
//		--------------------------------------------------------
//		자동 타입 변환
//		- 컴파일에 의한 자동 형변환
//		- 큰 공간에 작은자료형의 값을 넣을때 발생
//		- 데이터 손실이 최소화 되는 방향으로 자료형이 결정된다
//
//		강제 타입 변환
//		- 프로그래머에 의한 강제 형변환
//		- 작은 공간에 큰 자료형의 값을 저장(데이터 손실발생)
//
//
//		문자열 결합 연산
//		- 문자열과  + 연산을 하면 다른 피연산자도 문자열로 변환되어 문자열 결합이 일어난다
//
//		Integer.parseInt() : 문자열을 정수 int 타입으로 변환
//		Double.parseDouble() : 문자열을 실수 double로 변환
//
//
//
//		--------------------------------------------------------
//		문제
//		--------------------------------------------------------
//		1. 자동 타입 변환에 대한 내용입니다 컴파일 에러가 발생하는 것은 무엇입니까
//		답 : 2)
//		[예시]
//		----------------------------
//		byte byteValue = 10;
//		char charValue = 'A';
//		----------------------------
//		1) int intValue = byteValue;
//		2) int intValue = charValue;
//		3) short shortValue = charValue;		//같은 2byte공간이지만 char은 0~65535에 아스키코드를 저장하기에 타입이 다르다. short는 -32768 ~ + 32767
//		4) double doubleValue = byteValue;
		
//
//
//		2. 강제 타입 변환에 대한 내용입니다. 컴파일 에러가 발생하는 것은 무엇입니까
//		답 : 4)
//		[예시]
//		----------------------------
//		int intValue = 10;
//		char charValue = 'A';
//		double doubleValue = 5.7;
//		String strValue = "A";
//		----------------------------
//		1) double var = (double)intValue;
//		2) byte var = (byte) intValue;
//		3) int var = (int)doubleVale;
//		4) char var = (char)strValue;		char은 단일문자타입이고  String은 문자열타입이라 강제형변환이 안된다  strValue.charAt(0)으로 몇번째 문자를 가져오는 방법으로 출력할 수 있다.
		String strValue = "A";
		char var = strValue.charAt(0);
		System.out.println(var);
//
//
//		3. 연산식에서의 타입 변환에 대한 내용입니다. 컴파일 에러가 발생하는 것은 무엇입니까?
//		[예시]
//		----------------------------
//		byte byteValue = 10;
//		float floatValue = 2.5F;
//		double doubleValue = 2.5;
//		----------------------------
//		1) byte result = byteValue + byteValue;
//		2) int result = 5 + byteValue;
//		3) float result = 5 + floatValue;
//		4) double result = 5 + doubleValue;
//		답 : 1)
//		+가 들어가게 되면 int로 형변환이 된다 (byte)(byteValue + byteValue); 강제형변환



//
//		4. 다음 코드에서 컴파일 에러가 발생하는 위치와 이유를 설명해 보세요
//		[예시]
//		----------------------------
//		short s1 = 1;				
//		short s2 = 2;
//		int i1 = 3;
//		int i2 = 4;
//		short result = s1 + s2;		에러발생
//		int result = i1 + i2;
//		----------------------------
//		short(2byte) 값에 + 가 들어가면 자료형이 int로 형변환됨 (short)(s1 + s2); 강제 형변환 해야함


		
//
//		5. 알파벳 a의 유니코드는 97이고 b의 유니코드는 98입니다.
//		따라서 a의 유니코드에 1을 더하면 b의 유니코드가 되므로
//		다음과 같이 코드를 작성했습니다. 실행결과는 b가 출력되어야 하는데 
//		컴파일 에러가 발생하였습니다. 무엇이 문제이고, 어떻게 수정하면 좋을지
//		적어보세요
//		[예시]
//		----------------------------
//		char c1 = 'a';
//		char c2 = c1 + 1;
//		System.out.println(c2);
//		----------------------------
//		답
//		char c2 = c1 + 1; 에러 발생
//		연산 결과값 int 이라 강제 형변환 해야함  (char)(c1 + 1)

//
//
//		6. 자바에서 / 는 나눗셈 연산자 입니다 x/y 는 x 를 y 로 나누는 연산을 수행합니다
//		빈칸에 들어갈 타입은 무엇이며 출력되는 결과와 그 이유를 설명해 보세요
//		[예시]
//		----------------------------
//		int x = 5;
//		int y = 2;
//		____ result = x/y;
//		System.out.println(result);
//		----------------------------
//		int 
//		결과값 2   int가 정수타입이라 2출력
//
//		7. 6번 문제에서 출력되는 결과로 2.5가 나오게 하고 싶습니다 빈칸에 들어갈 코드를
//		작성하세요
//		[예시]
//		----------------------------
//		int x = 5;
//		int y = 2;
//		____ result = _____________;
//		System.out.println(result);
//		----------------------------
//		double result = (double)x/y;
//		2.5값이 나오게 할려면 실수여야한다.
//
//		8. 두 실수를 덧셈 연산하고 소수점 이하 자리를 버리고 싶습니다
//		빈칸에 들어갈 코드를 작성해 보세요
//
//		[예시]
//		----------------------------
//		double var1 = 3.5;
//		double var2 = 2.7;
//		int result = _____________;
//		----------------------------
//		int result = (int)(var1 + var2);

//
//		9. var1 부터 var4까지 + 연산을 수행해서 int 타입 result변수에 9가 저장되도록
//		빈칸에 들어갈 코드를 작성해보세요
//		[예시]
//		----------------------------
//		long var1 = 2L;
//		float var2 = 1.8f;
//		double var3 = 2.5;
//		String var4 = "3.9";
//		int result =_______________;
//		System.out.println(result);
//		----------------------------
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
//		int result = (int)var1 + (int)(var2 + var3) + (int)Double.parseDouble(var4);
		int result = (int)var1 + (int)(var2 + var3) + (int)Double.parseDouble(var4);
		System.out.println(result);
//
//
//		10. 다음코드를 실행했을 때 출력 결과를 적어보세요
//		[예시]
//		----------------------------
//		String str1 = 2 + 3 + "";	5
//		String str2 = 2 + "" + 3;	23
//		String str3 = "" + 2 + 3;	23
//		System.out.println(str1);	
//		System.out.println(str2);
//		System.out.println(str3);
//		----------------------------
//
//		11. 문자열을 기본 타입으로 변환하려고 합니다
//		빈칸에 알맞은 코드를 작성해 보세요
//		[예시]
//		----------------------------
//		 byte value =	_________("10");
//		 int value2 = 	_________("100");
//		 float value3 =	_________("20.5");
//		 double value4 =	_________("3.14159");
//		----------------------------
		 byte value =	Byte.parseByte("10");
		 int value2 = 	Integer.parseInt("100");
		 float value3 =	Float.parseFloat("20.5");
		 double value4 =	Double.parseDouble("3.14159");
		 System.out.println(value);
		 System.out.println(value2);
		 System.out.println(value3);
		 System.out.println(value4);
//
//
//
//
//		[답]
//		1. 3 char 타입의 양의 허용 범위가 short 타입보다 더 큼
//
//		2. 4 문자열을 char 타입으로 강제 타입 변환(캐스팅)할 수 없음
//
//		3. 1 연산의 결과는 int 타입임
//
//		4. 5 연산의 결과는 int 타입임
//
//		5. 연산의 결과는 int 타입인데 , char 타입 변수 c2 에 저장했기 때문
//
//		char c2 = (char) (c1 + 1);
//
//		6. int 2, 연산의 결과는 int 타입임
//
//		7. double, (double)x / y 또는 x / (double)y 또는 (double)x / (double)y
//
//		8. (int) (var1 + var2)
//
//		9. 
//		(int)var1 + (int)(var2 + var3) + (int)Double.parseDouble(var4) 또는
//		(int)(var1 + (int)var2 + var3 + Double.parseDouble(var4)) 또는
//		(int)(var1 + var2 + (int)var3 + Double.parseDouble(var4)) 또는
//		(int)(var1 + var2 + var3 + (int)Double.parseDouble(var4))
//
//		10.실행결과
//		5
//		23
//		23
//
//		11. 
//		Byte.parseByte
//		 Integer.parseInt
//		 Float.parseFloat
//		 Double.parseDouble

	}

}
