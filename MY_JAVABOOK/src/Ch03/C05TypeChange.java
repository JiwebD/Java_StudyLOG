package Ch03;

public class C05TypeChange {

	public static void main(String[] args) {
		int num1 = 10, num2 = 4;
		double dnum1 = (double)num1 / num2;		//num1을 double로 형변환해주기
		double dnum2 = (num1*1.0) / num2;		//num에 1.0을 곱해줘서 실수로 바꿔주기
		double dnum3 = num1 / num2;
		System.out.println("dnum1 : " + dnum1);
		System.out.println("dnum2 : " + dnum2);
		System.out.println("dnum3 : " + dnum3);

	}

}
