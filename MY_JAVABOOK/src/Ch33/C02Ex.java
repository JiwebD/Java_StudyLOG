package Ch33;

import java.util.Arrays;
import java.util.stream.Collectors;

@FunctionalInterface
interface Functional{
	Integer execute(int ...args);
}

class Calc implements Functional{
	Functional sum; //합
	Functional sub; //차
	Functional mul; //곱
	Functional div; //나누기
	
	
	@Override
	public Integer execute(int... args) {
		// TODO Auto-generated method stub
		return null;
	}


	Calc (){
		//Functional sum 에 대한 람다식 완성 할 것
//		sum=(args)->{return Arrays.stream(args).reduce(0,(sum,el)->{return sum+el;});};
		sum=(args)->Arrays.stream(args).reduce(0,(sum,el)->sum+el);//간략화
//		sum = (items)->{
//			return Arrays.stream(items).reduce(0, (sum,el)->{return sum+el;});
//		};
		//Functional sub 에 대한 람다식 완성 할 것
		sub=(args)->{
			return Arrays
					.stream(args)
					.boxed()
					.sorted((a,b)->{return b-a;})
					.reduce(0,(sub,el)->{return sub<el?el-sub:sub-el;});
			// reduce 초기값은 0.
			// 누적값(sub)과 현재값(el)을 비교해서:
			// - sub < el 이면 el - sub
			// - 아니면 sub - el
			// 이 값을 누적해 나감.
			};
//		sub = (items)->{
//			return Arrays.stream(items)
//					.boxed()
//					.sorted((a,b)->{return b-a;})
//					.reduce((sub,el)->sub-el)
//					.orElse(0);	
//		};
		//Functional mul 에 대한 람다식 완성 할 것
		mul = (args)->{
			return Arrays.stream(args)
					.reduce(1, (mul,el)->{return mul*el;});
		};
//		mul = (items)->{
//			return Arrays.stream(items)
//					.reduce(1, (mul,el)->{return mul*el;});
//		};
		
		//Functional div 에 대한 람다식 완성 할 것
		div = (args)->{
			return Arrays
					.stream(args)
					.boxed()
					.sorted((a,b)->{return b-a;})
					.reduce(1,(div,el)->{return div<el?el/div:div/el;});
		};

		//조건
		//sum,sub,mul,div 각각에 람다&스트림함수를 적절히 이용해서 기능 구현을 합니다.
		//모든 인자를 받을 수있는 가변인자 처리로 구현합니다.
		//뺄셈, 나눗셈은 큰수에서 작은수로 정렬(sorted)한다음 누적 감산 처리(reduce)를 합니다.
	}






}
public class C02Ex {

	public static void main(String[] args) {
		Calc calc = new Calc();
		System.out.println("합 :"+ calc.sum.execute(10,20,30,40,50,60));
		System.out.println("차 :"+ calc.sub.execute(1,4,2,9));//1,2,4,5
		System.out.println("곱 :"+ calc.mul.execute(10,20,30,40,50,60));
		System.out.println("나눗셈 :"+ calc.div.execute(10,20,30,40,50,60));


	}

}
