package Ch14;

//Object.class 최상위 클래스
//extends 키워드로 다른 클래스를 상속하지 않으면 암시적으로
//java.lang.Object 클래스를 상속
//자바의 모든 클래스는 Object 클래스의 자식이거나, 자손클래스이다.

class A{
	//Object 클래스에 totring은 해쉬값을 리턴하는 함수 이기때문에
	//값을 출력하고 싶으면 아래와 같이 재정의 필요.
	int x;
	int y;
	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + "]";
	}
	
	
}

public class C01ObjectMain {

	public static void main(String[] args) {
		//toString()
		//Object 클래스에 선언되어있는 메소드
		//객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
		//일반적으로 그 객체를 설명해주는 문자열을 리턴
		
		A ob1 = new A();
		System.out.println(ob1);
		System.out.println(ob1.toString());
		
		Object ob2 = new Object();
		System.out.println(ob2);
		System.out.println(ob2.toString());
		

	}

}
