package Ch17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C03SetMain {

	public static void main(String[] args) {
		Set<String> set = new HashSet();
		//추가
		set.add("HTML/CSS/JS");	//0
		set.add("JQUERY");	//1
		set.add("NODEJS");	//2
		set.add("SCSS");	//3
		set.add("REACT");
		set.add("JAVA");
		set.add("JSP/SERVLET");
		set.add("STS");
		set.add("SPRING BOOT");
		set.add("SPRING BOOT");	
		
		//확인
		System.out.println("개수 확인 : " + set.size());
		
		//삭제
		set.remove("NODEJS");
		
//		//조회(idx x -> Iterator) 옛날에 쓰던거
//		Iterator<String> iter = set.iterator();
//		while(iter.hasNext())
//			System.out.println(iter.next());
		
		//최신식
		for(String el : set)
			System.out.println(el);
		
		
		set.clear();
		
		

	}

}
