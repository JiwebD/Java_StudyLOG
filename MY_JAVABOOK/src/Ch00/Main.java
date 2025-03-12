package Ch00;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		

		if(60-B<C%60) {
			A++;
			B = B+C%60;
			if(A>23) {
				A=0;
			}
			if(B>59) {
				B = (B+C%60)-60;
			}
			System.out.println(A + " " + B);
		}
		else if(C/60 > 0) {
			A += C/60;
			
			if(60-B<C%60) {
				A++;
			}
			B = B+C%60;
			
			if(A>23) {
				A=0;
			}
			if(B>59) {
				B = (B+C%60)-60;
			}
			System.out.println(A + " " + B);
		}
		else {
			System.out.println(A + " " + (B+C));
			
		}


	}
}
