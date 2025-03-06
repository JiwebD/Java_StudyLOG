package Ch10;

public class C05MainParam {

	
	public static void main(String[] args) {
		System.out.println("length : " + args.length);
		for(String param : args) {
			System.out.println(param);
		}
		
//		cmd로 .java 컴파일 -> .class -> 실행
		
//		1. javac C05MainParam.java → Java 파일을 컴파일하여 .class 파일 생성
		
//		2. java Ch10.C05MainParam → 정상 실행
//		출력
//		length : 0
		
//		3. java Ch10.C05MainParam "aaa" "bbb" "ccc" "ddd"
//		=> "aaa" "bbb" "ccc" "ddd"를 입력하면 명령줄 인자로 값을 받아 출력.
//		출력
//		length : 4
//		aaa
//		bbb
//		ccc
//		ddd

	}

}
