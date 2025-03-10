package Ch15;

public class C04ExceptionMain {

	public static void main(String[] args) {
		
		try {
			String str=null;
//			str.toString();				//NULL 예외발생			

		int arr[] = {10,20,30};
//		arr[5] = 100;				//Bound Exception 발생
//
//		Integer.parseInt("a1234");	//Parse Exception 발생
		
		Animal animal = new Dog();
//		Cat yummi = (Cat)animal;	//Cast Exception;
		} catch(Exception e) {		//하나하나 예외처리하기 귀찮을때
			System.out.println(e.getMessage());
		}
//		}catch(NullPointerException e) {
//			System.out.println(e.getMessage());
//		}catch(ArrayIndexOutOfBoundsException e2) {
//			System.out.println(e2.getMessage());
//		}catch(NumberFormatException e3) {
//			System.out.println(e3.getMessage());
//		}catch(ClassCastException e4) {
//			System.out.println(e4.getMessage());
//		}
		
		finally {
			//자원정리 작업
			System.out.println("Finally Test..");
		}

		
		
		System.out.println("HELLOWORLD");
	}

}
