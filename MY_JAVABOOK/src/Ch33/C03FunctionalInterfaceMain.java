package Ch33;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

//제공되는 함수형 인터페이스들
//Function<T, R>:
//apply 메서드를 가지고 있어서 하나의 인자(T)를 받아서 결과(R)를 반환하는 함수형 인터페이스 입니다.

//Supplier<T>:
//get 메서드를 가지고 있어서 어떠한 인자도 받지 않고 결과만을 제공하는 함수형 인터페이스 입니다.
//
//Consumer<T>:
//accept 메서드를 가지고 있어서 어떠한 인자를 받아서 결과를 반환하지 않는 함수형 인터페이스 입니다.
//
//Predicate<T>:
//test 메서드를 가지고 있어서 어떠한 인자를 받아서 불리언 결과를 반환하는 함수형 인터페이스 입니다.
//
//UnaryOperator<T>:
//apply 메서드를 가지고 있어서 하나의 인자를 받아서 동일한 타입의 결과를 반환하는 함수형 인터페이스 입니다.
//
//BinaryOperator<T>:
//apply 메서드를 가지고 있어서 두 개의 인자를 받아서 동일한 타입의 결과를 반환하는 함수형 인터페이스 입니다.

public class C03FunctionalInterfaceMain {
	
//	(x) → 입력값 (→ Function<Integer, Integer>의 첫 번째 Integer에 해당)
//	{ return x + x; } → 출력값 (→ 두 번째 Integer에 해당)
	
	//01 
//	public static Function<Integer, Integer> func1=(x)->{return x*x;};
	public static Function<Integer, Integer> func1=x->x*x; // 간략화
	//02 
//	public static Function<Integer, Integer> func2=(x)->{return x+x;};
	public static Function<Integer, Integer> func2=x->x+x; // 간략화
	//03 
	public static Function< List<Integer>, Integer> func3=(x)->
//	{
//		return x.stream().reduce(0,(sum,el)->{return sum+el;});
//	};
		x.stream().reduce(0,(sum,el)->{return sum+el;});	// 간략화

	
	//04 
	public static Function< List<Object>, Integer> func4=(li)->{
		//List<Object>로 받은 파라미터 중에 Integer만 추출해서 누적합 구하기
		
		//2 누적합 (reduce)
		return li 
				.stream()
				.filter((item)->{return item instanceof Integer;})	//Integer형만 필터링(instanceof)
				.map((item)->{System.out.print(item+" ");return (Integer)item;})	//자료형 재구성(Object ->Integer)
				.reduce(0,(sum,item)->{return sum+item;});	//2 누적합 (reduce) 
		
//		return -1;
		};
	//05
	public static Function< List<Object>, List<Integer> > func5=(li)->{
		//List<Object>로 받은 파라미터 중에 Integer만 추출해서 리턴하기
		//1 Integer형만 필터링(instanceof)
		//2 재구성(map)
		//3 리스트로 변환(collect)
		
		return li 
				.stream()
				.filter((item)->{return item instanceof Integer;})	//Integer형만 필터링(instanceof)
				.map((item)->{return (Integer)item;})	//자료형 재구성(Object ->Integer)
				.collect(Collectors.toList())	// 리스트로 변환
				;
//		return null;
	};
	
	//06
	public static Function< Integer, Integer > func6=func1.andThen(func2);
													//andThen을 사용하면 앞의 func1의 결과값이 func2의 인자값으로 전달된다.
	
	//07
	public static Function< Integer, Integer > func7=func2.andThen(func1);
	
	//08
	public static Function< List<Integer>, Integer > subFunc = (x)->{return x.stream().reduce(0, (sum,x1)->sum+x1);};
	public static Function< List<Object>,Integer > func8 = func5.andThen(subFunc);
	
	//09고차 함수 = 입력값이 들어오면 또 다른 함수를 불러올 수 있음  (입력값 = 외부 입력값)
	//			= 함수 안에 함수가 있다						 (내부함수)
	//			= 내부 함수에서 외부 입력값을 기억할 수 있다		 
	public static Function < Integer , Function< Integer,Integer> > func9 = (x) -> {
		System.out.println("첫번째 함수 호출! x : " + x);
		return (y)->{
			System.out.println("두번째 함수 호출 y : " + y + " x :" + x);
			return y+x;
			};
		};
		
	//10
	public static Function < Integer , Function< Integer,Integer> > func10 = x -> y -> x+y;
	
	//11
	public static Function < Integer , Function < Integer , Function< Integer,Integer > > > func11 = x->y->z->x+y+z;


	

	
	
	
	public static void main(String[] args) {
		
		//01
		System.out.println(func1.apply(10));
		
		//02
		System.out.println(func2.apply(10));
		
		//03
		System.out.println(func3.apply(Arrays.asList(10,20,30) ));
		
		//04
		System.out.println(func4.apply( Arrays.asList("홍길동",100,20,300,10.5,true)) );
	
		//05
		System.out.println(func5.apply( Arrays.asList("홍길동",100,20,300,10.5,true)) );
		
		//06
		System.out.println(func6.apply(5));
		
		//07
		System.out.println(func5.apply( Arrays.asList("홍길동",100,20,300,10.5,true)) );
		
		//08
		System.out.println(func5.apply( Arrays.asList("홍길동",100,20,300,10.5,true)) );

		System.out.println("-----");
		//09
		System.out.println(func9.apply(10).apply(20));
		
		System.out.println("-----");
		//11
		System.out.println(func11.apply(10).apply(20).apply(30));

	}

}
