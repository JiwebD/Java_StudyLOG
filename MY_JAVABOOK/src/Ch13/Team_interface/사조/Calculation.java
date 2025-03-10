package Ch13.Team_interface.사조;

public interface Calculation {
	//사칙연산의 결과를 담기위한 멤버변수를 만드세요(덧셈,뺄셈,곱셈,나눗셈별)	
	//사칙연산을 위한 추상 메서드를 만들고
	//해당 폴더에 있는 Div,Mul,Sub,Sum을 각각 역할 나눠서 함수를 완성하세요(C99Ex참고)
	//나머지는 자유롭게 - !
	void sum(int a, int b);
	void sum(int ...args);
	void sum(double ...args);
	void sum(String ...args);
	
	void sub(int a, int b);
	void sub(int ...args);
	void sub(double ...args);
	void sub(String ...args);
	
	void mul(int a, int b);
	void mul(int ...args);
	void mul(double ...args);
	void mul(String ...args);
	
	void div(int a, int b);
	void div(int ...args);
	void div(double ...args);
	void div(String ...args);
}
