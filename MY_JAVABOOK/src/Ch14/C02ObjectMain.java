package Ch14;

class C02Simple {
	int n;

	C02Simple(int n) {
		this.n = n;
	}

	@Override
	public boolean equals(Object obj) {	// obj가 C02Simple 타입인지 확인 (안전한 다운캐스팅을 위한 필수 검사)
		//
		if(obj instanceof C02Simple) {		// 전달된 매개변수 obj(ex ob2)가 C02Simple타입인지 확인
			C02Simple down = (C02Simple)obj;	 // Object → C02Simple 다운캐스팅
			
			return this.n==down.n;		// C02Simple의 맴버변수 n == 지역변수 down.n 값 비교
		}
		
		return false;
	}
	
}

public class C02ObjectMain {

	public static void main(String[] args) {
		
//		equals() 어떤 두 참조 변수의 값이 같은지 다른지 비교할때 사용하는 메서드
//		대표적으로 String 타입의 변수를 비교할때 가장 많이 사용.
//		비교 대상이 객체인 경우 객체의 주소를 비교한다.
//		

		C02Simple ob1 = new C02Simple(10);
		C02Simple ob2 = new C02Simple(10);
		C02Simple ob3 = new C02Simple(20);
		
		System.out.println(ob1);
	
		System.out.println(ob1.equals(ob2));	// 기본 Object의 equals()는 주소를 비교하지만, 객체 값을 비교하고 싶다면 다운케스팅 필요.
		System.out.println(ob1.equals(ob3));	// false 객체를 비교하기때문에 서로 다른 heap메모리주소를 참조하고 있어서 주소가 다르다.
		
		String str1 = new String("JAVA");
		String str2 = new String("JAVA");
		System.out.println(str1.equals(str2));

	}

}
