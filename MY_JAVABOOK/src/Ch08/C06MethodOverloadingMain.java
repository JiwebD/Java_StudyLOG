package Ch08;

// 오버로딩
// 의미 - 같은 이름의 메서드를 매개변수(Parameter)의 개수나 타입을 다르게 하여 여러 개 정의하는 것
// 규칙 1. 메서드 이름이 동일해야 함.
//	   2. 매개변수(Parameter)의 개수 또는 타입이 달라야 함.
//	   3. 반환 타입(Reuturn Type)은 오버로딩에 영향을 주지 않음.

class C06Simple{
	int sum(int x , int y) {
		System.out.println("int sum(int x, int y)");
		return x + y;
	}
	int sum(int x , int y, int z ) {
		System.out.println("int sum(int x, int y, int z)");
		return x + y + z;
	}
	int sum(double x , double y, double z) {
		System.out.println("int sum(double x , double y, double z)");
		return (int)(x + y + z);
	}
}

public class C06MethodOverloadingMain{

	public static void main(String[] args) {
		C06Simple obj = new C06Simple();
		obj.sum(10, 20);
		obj.sum(10, 20, 30);
		obj.sum(10.5, 20.5, 30.5);
		C06Simple obj2 = new C06Simple();

	}

}
