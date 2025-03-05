package Ch10;

public class C03ArrayMain {

	public static void main(String[] args) {
		//1차원배열의 배열요소는 idx위치에서의 지정자료형이다.
		//2차원배열의 배열요소는 1차원 배열이다.
		int arr[][] = {
				{10,20,30},
				{40,50,60,65,67},
				{70,80,90,96,11,56},
				{100,110,120,15,22,33,44},
		};
		
		System.out.println("행의 길이 : " + arr.length);
		System.out.println("행의 길이 : " + arr[0].length);
		System.out.println("행의 길이 : " + arr[1].length);
		System.out.println("행의 길이 : " + arr[2].length);
		System.out.println("행의 길이 : " + arr[3].length);

	}

}
