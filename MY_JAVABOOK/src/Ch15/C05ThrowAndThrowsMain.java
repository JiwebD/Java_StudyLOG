package Ch15;

//throw : 예외를 생성
//throws : 예외를 던짐.
class A {

	public void Ex1() throws NullPointerException { // 1인칭 내가(Ex1)이 NullPointerException을 던지겠다.
		System.out.println("Ex1 process..1");
		throw new NullPointerException("Ex1 NULL Exception"); // 예외 생성해서 실행안됨.
	}
}

class B {
	public void Ex2() throws NullPointerException { // 1인칭 내가(Ex1)이 NullPointerException을 던지겠다.
		System.out.println("Ex2 process..1");
		throw new NullPointerException("Ex2 NULL Exception");
	}
}

public class C05ThrowAndThrowsMain {

	public static void main(String[] args) {
		System.out.println("실행코드1");
		System.out.println("실행코드2");
		A a = new A();
		B b = new B();

		try {
			a.Ex1();
			b.Ex2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("실행코드3");

	}

}
