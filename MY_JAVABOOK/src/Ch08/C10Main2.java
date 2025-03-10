package Ch08;

// 홍길동이 		-			사과장수에게 사과를 구매한다
// 구매자    		-			판매자
// 보유금액(속성)				보유금액(속성)
// 사과개수(속성)				사과개수(속성)
//							개당가격(속성)

// 구매하기(기능)				판매하기(기능)
// 1)특정사과장수에게 돈을건넨다->
// (내보유금액에서는 차감)
//							2)돈을 내보유금액에 누적
//							3)사과개수 계산->나의보유사과개수에서차감 -> 사과개수 전달
// 4)나의보유사과개수에 누적

//구매자
class buyer {
	//속성 보유금액, 사과개수
	int mymoney;
	int appleCnt;
	
	//모든 인자 받는 생성자
	public buyer(int mymoney, int appleCnt) {
		super();
		this.mymoney = mymoney;
		this.appleCnt = appleCnt;
	}
	
	//기능
	//구매하기 = 판매자에게 돈을 지불하고 지불한 금액만큼의 사과 +
	public void payment(Selery selery, int money) {	//Sellery 자료형 객체참조하여 돈낸만큼사과가져오기, 지불금액 money
		//내 전재산에서 지불금액만큼 차감
		mymoney -= money;
		
		//지불한 만큼의 사과 +
		appleCnt += selery.recive(money); 
		
	}

	//toString 재정의 하는이유 자바의 모든 클래스는 기본적으로 Object클래스에 상속돼있다.
	//System.out.prinln(객체);를 하면 기본적으로 Object.toString 매서드를 실행하는데 해쉬값을 리턴한다.
	//그래서 값을 출력하고 싶으면 toString메서드를 override해서 재정의 해야한다.
	
	//toString 재정의
	@Override
	public String toString() {
		return "buyer [mymoney=" + mymoney + ", appleCnt=" + appleCnt + "]";
	}
	



	
}

//판매자
class Selery{
	//속성 보유금액, 사과개수, 사과개당 가격
	int mymoney;
	int appleCnt;
	int price;
	
	//모든인자 받는 생성자
	public Selery(int mymoney, int appleCnt, int price) {
		super();
		this.mymoney = mymoney;
		this.appleCnt = appleCnt;
		this.price = price;
	}



	//기능
	//판매하기 = 구매자가 지불한 만큼의 money 전재산에 +하기, 구매자가 지불한 money만큼의 사과개수 차감
	public int recive(int money){	//구매자가 지불한금액 매개변수
		mymoney += money;
		appleCnt -= money/price;
		
		return money/price;
	}


	//toString
	@Override
	public String toString() {
		return "Selery [mymoney=" + mymoney + ", appleCnt=" + appleCnt + ", price=" + price + "]";
	}
	
	
}


public class C10Main2 {

	public static void main(String[] args) {
		
		//판매자 참조객체 만들기
		Selery selery = new Selery(10000,100,1000);
		
		//구매자 참조객체
		buyer 홍길동 = new buyer(5000,0);
		buyer 남길동 = new buyer(3000,0);
	
		//buyer.payment(Selery selery, int money)에 selery, 3000 
		홍길동.payment(selery, 3000);
		남길동.payment(selery, 1000);
		
		
		System.out.println(홍길동);System.out.println("--------------");
		System.out.println(남길동);System.out.println("--------------");
		
		System.out.println(selery);
		
		

	}

}
