package Ch12;
//Upcasting으로 확장된 자식객체에서 부모로부터 Override(재정의)한 메소드 참조가능확인 예제.
class C08Super{
	
	void func1() {System.out.println("C08.Super.func1() Call!");}
	void func2() {}
}
class C08Sub extends C08Super{

	
	void func2() {System.out.println("C08.C08Sub.func2() Call!");}	//Overrid	
}

public class C08UpDownCastingMain {

	public static void main(String[] args) {
		C08Super ob1 = new C08Super();		//No casting
		ob1.func1();
		
		System.out.println("----------------");
		C08Sub ob2 = new C08Sub();			//No casting
		ob2.func1();
		ob2.func2();
		
		System.out.println("----------------");
		C08Super ob3 = new C08Sub();		//Upcasting
		ob3.func1();
		ob3.func2();
		
		//Upcasting
		//확장된(멤버추가) 멤버변수 접근가능하다? x  -> Downcasting -> 접근
		//확장된(멤버추가) 멤버함수 접근 가능하다? x  -> Downcasting -> 접근
		//재정의된 메서드 접근 가능?	O
		
		
		
	}

}
