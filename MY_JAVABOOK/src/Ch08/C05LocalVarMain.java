package Ch08;


// 멤버변수		: 클래스 내부에서 - 메서드영역 바깥에서 생성
//				  생성된 객체의 개별 정보 저장
// static 변수	: 동일 클래스로부터 만든 여러객체간 공유하는 멤버변수


// 지역변수		: 메서드 영역내(파라미터, 매개변수도 포함)에서
//				  (or 매서드 영역내의 {}범위에서 포함)
//				  생성되는 변수
//				  (파라미터,일반변수)


class C05Simple{
	int num = 10;	//멤버변수
	
	void Func1() {
		System.out.println("멤버변수 num : " + num);
		int num = 5;
		System.out.println("Func1's 지역변수 num : " + num);
		num++;
		this.num++; 
		
	}
	
	void Func2() {
		System.out.println("멤버변수 num : " + num);
		if(true) {
			int num=100;
			System.out.println("Func2's if안 지역변수 num : " + num);
		}
		System.out.println("멤버변수 num : " + num);
		
		while(num<15) {
			int num=7;
			System.out.println("num : " + num);
			num++;
		}
	}
	
	void Func3(int num) {
		this.num = num;
	}
}
public class C05LocalVarMain {

	public static void main(String[] args) {
		
		C05Simple obj = new C05Simple();
		obj.Func1();
		obj.Func2();

	}

}
