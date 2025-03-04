package Ch08;


class C03Person{
	//속성
	String name;
	int age;
	float height;
	double weight;
	
	//기능
	void talk() {System.out.printf("%s 님이 말합니다.\n", this.name);} //this.name : 만들어진 객체 에(.) name
	void walk() {System.out.printf("%s 님이 걷습니다.\n", this.name);}	//this = 현재 객체의 참조(주소)를 나타내는 키워드
	//속성정보 확인
	void showInfo() {
		System.out.printf("%s %d %f %f\n", this.name, this.age, this.height, this.weight);
	}
	//객체정보 확인(toStrinf)
	//마우스 우클릭 > source > Generate toString()..클릭 
	@Override
	public String toString() {
		return "C03Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	
}
public class C03PersonMain {

	public static void main(String[] args) {
		
		C03Person hong = new C03Person();
		hong.name="홍길동";
		hong.age=15;
		hong.height=177.5f;
		hong.weight=70.5;
		
		hong.talk();
		hong.walk();
		hong.showInfo();
		
		System.out.println(hong.toString());


	}

}
