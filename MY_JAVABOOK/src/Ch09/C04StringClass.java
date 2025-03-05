package Ch09;

public class C04StringClass {

	public static void main(String[] args) {

		String str1 = "java";
//		1.Stack 메모리에 str1이 생성됨
//		2.str1은 String Constant Pool(예: 100번지)에 저장된 "java"를 참조
//		3.이미 "java"가 존재하면 같은 객체를 참조하고, 없으면 새롭게 생성
//		4.이 방식은 메모리 절약에 유리함
		String str2 = "java";
		String str3 = new String("java");
//		1.Stack 메모리에 str3가 생성됨
//		2.Heap 메모리에 새로운 객체(200번지)가 생성됨
//		3.str3는 200번지 객체를 참조
//		4.new String("java")는 항상 새로운 객체를 생성하므로, 기존의 String Constant Pool을 참조하지 않음
		String str4 = new String("java");
		// 해쉬코드 확인
		System.out.printf("%x\n", System.identityHashCode(str1));
		System.out.printf("%x\n", System.identityHashCode(str2));
		System.out.printf("%x\n", System.identityHashCode(str3));
		System.out.printf("%x\n", System.identityHashCode(str4));

		System.out.println("------------------------------------");
		// == : 메모리 주소(객체의 참조값) 비교
		System.out.println("str1==str2 ? " + (str1 == str2));
		System.out.println("str3==str4 ? " + (str3 == str4)); // str3, str4는 각각 새로 생성된 heap메모리주소를 참조하고있음. false
		System.out.println("str1==str3 ? " + (str1 == str3)); // str1은 상수풀 주소를 참조함. str3는 heap메모리에 생성된 객체 참조. false
		System.out.println("str2==str4 ? " + (str2 == str4));
		
		System.out.println("------------------------------------");
		// .equals()문자열의 실제 값 비교
		System.out.println("str1==str2 ? " + (str1.equals(str2)));
		System.out.println("str3==str4 ? " + (str3.equals(str4)));
		System.out.println("str1==str3 ? " + (str1.equals(str3)));
		System.out.println("str2==str4 ? " + (str2.equals(str4)));

	}

}
