package Ch00;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		

		if(60-B<C%60 || C/60 >0) {
			A++;
			
			if(A>23) {
				A =0;
			}
			A +=(C/60);
			
			
			B += C%60;

			if(B > 59) {
				B -=60;
			}
			System.out.println(A + " " + B);
		}
		else{
			B+= C;
			 if(B > 59) {
				B -=60;
			 }
			 System.out.println(A + " " + B);
		}

	}
}
