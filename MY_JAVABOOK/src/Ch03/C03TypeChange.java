package Ch03;

public class C03TypeChange {

	public static void main(String[] args) {
		int num1 = 129;			//00000000 00000000 00000000 100000001
		int num2 = 1;			//00000000 00000000 00000000 100000010
		byte ch1 = (byte)num1;	//마지막 1byte만 존재 100000001
		byte ch2 = (byte)num2;	//마지막 1byte만 존재 100000010
		
		System.out.printf("%d\n", ch1);
		System.out.printf("%d\n", ch2);
		
		int a = (int)100F;
		System.out.println(a);

	}

}
