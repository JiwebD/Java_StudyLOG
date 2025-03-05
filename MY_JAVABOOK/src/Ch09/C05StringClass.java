package Ch09;

public class C05StringClass {

	public static void main(String[] args) {
//		String str1 = "Java Powerful";
//		String str2 = new String("Java Powerful");
//		String str3 = str1 + str2;
//		String str4 = str1.concat(str2); //.concat : 덧붙이기.
//
//		// 해쉬코드 확인
//		System.out.printf("%x\n", System.identityHashCode(str1));
//		System.out.printf("%x\n", System.identityHashCode(str2));
//		System.out.printf("%x\n", System.identityHashCode(str3));
//		System.out.printf("%x\n", System.identityHashCode(str4));
		
//		int i=0;
//		String str = "";
//		while(i<10) {	//String은 불변 객체.  =>  while반복문 i++마다 기존 생성된 String객체는 버려지고 새로운 String객체가 생성됨. =>주소값 다름.
//			str +=i;
//			System.out.print("str : " + str + " ");
//			System.out.printf("위치  : %x\n" , System.identityHashCode(str));
//			i++;
//		}
		
		
		//문자열 덧붙이기(메모리 누수 방지 클래스 : StringBuffer , StringBuilder)
		//StringBuilder는 가변(Mutable) 객체이므로, 문자열을 추가할 때 새로운 객체를 만들지 않고 기존 객체의 내부 버퍼에서 변경함.
		//=>동일한 객체를 유지하면서 문자열을 추가할 수 있으므로, 메모리를 효율적으로 사용하고 성능이 향상됨.
		int i=0;
//		String str = "";
		StringBuilder str = new StringBuilder("");
		while(i<10) {
//			str +=i;
			str.append(i);
			System.out.print("str : " + str + " ");
			System.out.printf("위치  : %x\n" , System.identityHashCode(str));
			i++;
		}

	}

}
