package Ch08;

class TV {
//	속성
	String brandname;
	int year;
	int inch;
	//초기값 생성
	public TV(String brandname, int year, int inch) {
		super();
		this.brandname = brandname;
		this.year = year;
		this.inch = inch;
	}
	//
	void show() {
		//LG에서 만든 2017년 32인치
		System.out.printf("%s 에서 만든 %d년형 %d인치", brandname,year,inch);
	}

}

public class C09명붐자바_예제 {
//	자바 클래스를 작성하는 연습을 해보자. 다음 main() 메소드를 실행하였을 때 예시와 같이 출력되도록 TV 클래스를 작성하라.

	public static void main(String[] args) {
	   TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
	   myTV.show();
	}
//	LG에서 만든 2017년형 32인치 TV

}
