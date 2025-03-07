package Ch12;

class Super{
	int n1;
}

class Sub extends Super {
	int n2;
}
public class C06UpDownCastingMain {

	public static void main(String[] args) {
		//NoCasting (자료형의 일치)
		Super ob1 = new Super();
		ob1.n1 = 10;
		Sub ob2 = new Sub();
		ob2.n1=10;
		ob2.n2=20;
		
		
		//Upcasting(상위클래스 참조변수 = 하위클래스형 객체)(자동형변환)
		//상속관계로 연결된 모든 하위객체를 연결할 수 있다.
		Super ob3 = new Sub(); //Sub클래스에 Super범위만 참조.
		ob3.n1=100;
//		ob3.n2=200; // ob3가 참조하고있는 Super에는 n1만 있어서 에러
		
		Super ob4 = ob2;
		ob4.n1=100;
//		ob4.n2=200; // ob4가 참조하고있는 Super에는 n1만 있어서 에러
		
		//Downcasting(하위클래스 참조변수 = 상위클래스형 객체)(강제형변환)
		//Upcasting된 상태에서 확장된 멤버에 접근하기 위한 용도.
//		Sub ob5 = (Sub)ob1; //런타임에러 ob5가 ob1의 범위를 넘어가서 
		Sub ob6 = (Sub)ob3;
		

	}

}
