package Ch07;

import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {

		// 2단 - 9단 출력
//		dan	i
//		2	1-9
//		3	1-9
//		...
//		9	1-9
//		---------------------------
//		dan=2	i=1
//		dan++	i++
//		dan<10   i<10

//		int dan = 2;
//		while(dan<10) {
//			
//			int i=1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			
//			dan++;
//		}

		// 2단 - 9단 출력 (2x9,2x8 ,.... 9x9 ,...9x1)

//		int dan;
//		
//		dan =2;
//		while(dan<10) {
//			
//			int i=9;
//			while(i>0) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			
//			dan++;
//		}

		// 9단 - 2단( 9x9 9x8 - 2x1)

//		int dan;
//		
//		dan = 9;
//		
//		while(dan>1) {
//			int i = 9;
//			while(i>0) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}

		// 2단 - N단(N<9)

//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("단수를 입력하세요 : ");
//		int n = sc.nextInt();
//
//		while (n < 2 || n > 9) {
//			System.out.println("구구단이니까 2 - 9이하 값을 입력하세요");
//			System.out.print("단 수를 입력하세요 : ");
//			n = sc.nextInt();
//		}
//
//		int dan = 2;
//		while (dan <= n) {
//			int i = 1;
//			while (i < 10) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}

		// N단 - M단(N<M , N<9 , M<9)
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("단 수를 입력하세요(시작단수, 끝단수) : ");
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		if (n >= m) {
//			// 잘못 입력한경우(시작값(n)이 끝값(m)보다 큰경우 , (5,3)...)
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//
//		while (n < 2 || n > 9 || m < 2 || m > 9) {
//			System.out.println("[!] 값범위[2-9]를 초과하였습니다.");
//			System.out.print("단 수를 입력하세요(시작단수, 끝단수) : ");
//			n = sc.nextInt();
//			m = sc.nextInt();
//		}
//
//		int dan = n;
//		while (dan <= m) {
//			int i = 1;
//			while (i < 10) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}

		// 별찍기(기본높이:4)

		// *****
		// *****
		// *****
		// *****

//		int i = 0;
//		while(i<5) {
//			int j = 0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

		// *
		// **
		// ***
		// ****
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 0;
//		while(i<n) {
//			int j = 0;
//			while(j<i+1) {
//				System.out.print("*");
//				j++;
//			}
//			int k = 4;
//			while(k>i) {
//				System.out.print(" ");
//				k--;
//			}
//			System.out.println();
//			i++;
//		}

		// ****
		// ***
		// **
		// *

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = n;
//		while(i>0) {
//			int j = 0;
//			while(j<i) {
//				System.out.print("*");
//				j++;
//			}
//			int k = 4;
//			while(k>i) {
//				System.out.print(" ");
//				k--;
//			}
//			System.out.println();
//			i--;
//		}

		// *
		// ***
		// *****
		// *******

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("n번째 줄까지 별 : ");
//		int n = sc.nextInt();
//
////		i	k(공백) 	j(*)	n				
////		0	0-2 	0-0		4		
////		1	0-1   	0-2		4		
////		2	0-0   	0-4		4		
////		3	x     	0-6		4		
//		
//		int i = 0;
//
//		while(i<n) {
//			int k = 0;
//			while(k<(n-1)-i) {
//				System.out.print(" ");
//				k++;
//			}
//			int j = 0;
//			while(j<=i*2) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

		// *******
		// *****
		// ***
		// *
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("n번째 줄까지 별 : ");
//		int n = sc.nextInt();
//
////	i	j(공백) 	k(*)	n				
////	0	x	 	0-6		4		
////	1	0-0   	0-4		4		
////	2	0-1   	0-2		4		
////	3	0-2   	0-0		4	
////---------------------------
//// i=0	j=0		k=0
//// i++	j++		k++
//// i<n	j<i		k<=((n-1)*2) - 2*i
//	
//		
//		int i = 0;
//
//		while(i<n) {
//			int j = 0;
//
//			while(j<i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k = 0;
//			while(k<=((n-1)*2) - 2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}

		// *
		// ***
		// *****
		// *******
		// *****
		// ***
		// *
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("n번째 줄까지 별 : ");
//		int n = sc.nextInt();
//
////	i	j(공백) 	k(*)	n				
////	0	0-2	 	0-0		4		
////	1	0-1   	0-2		4		
////	2	0-0   	0-4		4		
////	3	x   	0-6		4	
////---------------------------
//// i=0	j=0				k=0
//// i++	j++				k++
//// i<n	j<(n-1)-i		k<=(n-2)*i
//	
//		int i = 0;
//
//		while(i<n) {
//			int j = 0;
//
//			while(j<i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k = 0;
//			while(k<=((n-1)*2) - 2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}

		// *******
		// *****
		// ***
		// *
		// *
		// ***
		// *****
		// *******

//	i	j(공백) 	k(*)	n(높이)				
//	0	x	 	0-6		7		
//	1	0-0   	0-4				
//	2	0-1   	0-2				
//	3	0-2 	0-0			
//---------------------------
// i<n/2+1	j=0				k=0
// 			j++				k++
// 			j<=i-1			k<=(n-1) - 2*i		

//	4		0-1			0-2
//	5		0-0			0-4
//	6		x			0-6
//---------------------------
// i=0		j=0				k=0
// i++		j++				k++
// i>=n/2+1	j<n-(i+1)		k<=(2*i)-(n-1)

		Scanner sc = new Scanner(System.in);

		System.out.println("n번째 줄까지 별 : ");
		int n = sc.nextInt();

		int i = 0;
		while (i < n) {

			if (i <( n / 2 )+ 1) {
				// 공백
				int j = 0;
				while (j <= i-1) {
					System.out.print(" ");
					j++;
				}
				int k = 0;
				while (k <= (n-1) - 2*i) {
					System.out.print("*");
					k++;
				}
			}

			System.out.println();
			i++;
		}

//		i		j(*)	n		k(공백)		
//		7		0-6		8		x
//		5		0-4		8		7
//		3		0-2		8		7,5
//		1		0-0		8		7,5,3

//		int i = (n*2)-1;
//
//		while(i>0) {
//			int k = (n*2)-1;
//
//			while(k>i) {
//				System.out.print(" ");
//				k-=2;
//			}
//			int j = i-1;
//			while(j>=0) {
//				System.out.print("*");
//				j--;
//			}
//			System.out.println();
//			i-=2;
//		}
//		i = 1;
//
//		while(i<n*2) {
//			int k = (n*2)-1;
//
//			while(k>i) {
//				System.out.print(" ");
//				k-=2;
//			}
//			int j = 0;
//			while(j<i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i+=2;
//		}

	}

}
