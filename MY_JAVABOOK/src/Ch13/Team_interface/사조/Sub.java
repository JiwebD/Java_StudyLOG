//package Ch13.Team_interface.사조;
//
//
//public class Sub implements Calculation{
//
//	@Override
//	public void sub(int a, int b) {
//		
//		int tmp;
//		if(a<b) {
//			tmp = b;
//			b = a;
//			a = tmp;
//			
//			System.out.printf("%d - %d = %d\n", a,b,a-b);			
//		}
//		
//	}
//
//	@Override
//	public void sub(int... args) {
//
//		int max = Integer.MIN_VALUE;
//		int sum = 0;
//		
//		for(int num : args) {
//			if(num>max) {
//				max=num;
//			}
//			sum += num;
//		}
//		int subb = max - (sum-max);
//		
//		System.out.printf("%d -나머지 수 = %d\n", max,subb);
//		
//	}
//
//	@Override
//	public void sub(double... args) {
//		double max = Double.MIN_VALUE;
//		double sum = 0;
//		
//		for(double num : args) {
//			if(num>max) {
//				max=num;
//			}
//			sum += num;
//		}
//		double subb = max - (sum-max);
//		
//		System.out.printf("%.1f -나머지 수 = %.1f\n", max,subb);
//		
//	}
//
//	@Override
//	public void sub(String... args) {
//		
//		String sub = args[0];
//		
//		for(int i=0; i<args.length;i++) {
//			sub += "-" + args[i];
//		}
//		System.out.println(sub);
//		
//	}
//
//
//	
//}
