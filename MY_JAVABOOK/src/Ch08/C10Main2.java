//package Ch08;
//
////구조짜기
//// 홍길동이 		-			사과장수에게 사과를 구매한다
//// 구매자    		-			판매자
//// 보유금액(속성)				보유금액(속성)
//// 사과개수(속성)				사과개수(속성)
////							개당가격(속성)
//
//// 구매하기(기능)				판매하기(기능)
//// 1)특정사과장수에게 돈을건넨다->
//// (내보유금액에서는 차감)
////							2)돈을 내보유금액에 누적
////							3)사과개수 계산->나의보유사과개수에서차감 -> 사과개수 전달
//// 4)나의보유사과개수에 누적
//
////구매자
//class Buyer {
//	//속성 보유금액, 사과개수
//	private int mymoney;	
//	private int appleCnt;
//	
//	//모든 인자 받는 생성자
//	public Buyer(int mymoney, int appleCnt) {
//		super();	//부모클래스 기본 생성자 호출 현재 extends를 하지않았기에 기본 Object클래스상속중
//		this.mymoney = mymoney;		//전달받은 값을 멤버변수에 저장
//		this.appleCnt = appleCnt;	//전달받은 값을 멤버변수에 저장
//	}
//	
//	//기능
//	//구매하기 = 판매자에게 돈을 지불하고 지불한 금액만큼의 사과 +
//	public void payment(Seller seller, int money) {	//Seller 자료형 객체참조하여 돈낸만큼사과가져오기, 지불금액 money
//		
//		mymoney -= money;//내 전재산에서 지불금액만큼 차감
//		int appCnt = seller.receive(money); //seller.recive함수에 money 전달하고 리턴값(cnt = money/price) 저장.
//		appleCnt += appCnt; //appleCnt + appCnt = 구매자가 보유한 사과개수(멤버변수)에서 구매한 사과개수만큼 더해줘야함.
//		
//	}
//
//	
//	//toString 재정의 하는이유 자바의 모든 클래스는 기본적으로 Object클래스에 상속돼있다.
//	//System.out.prinln(객체);를 하면 기본적으로 Object.toString 매서드를 실행하는데 해쉬값을 리턴한다.
//	//그래서 값을 출력하고 싶으면 toString메서드를 override해서 재정의 해야한다.
//	//toString 재정의
//	@Override
//	public String toString() {
//		return "Buyer [money=" + mymoney + ", count=" + appleCnt + "]";
//	}
//	
//
//
//
//	
//}
//
////판매자
//class Seller{
//	//속성 보유금액, 사과개수, 사과개당 가격
//	private int mymoney;
//	private int appleCnt;
//	private int price;
//	
//	//모든인자 받는 생성자
//	public Seller(int mymoney, int appleCnt, int price) {
//		super();	//부모클래스 기본 생성자 호출 현재 extends를 하지않았기에 기본 Object클래스상속중
//		this.mymoney = mymoney;		//전달받은 값을 멤버변수에 저장
//		this.appleCnt = appleCnt;	//전달받은 값을 멤버변수에 저장
//		this.price = price;			//전달받은 값을 멤버변수에 저장
//	}
//
//
//
//	//기능
//	//판매하기 = 구매자가 지불한 만큼의 money 전재산에 +하기, 구매자가 지불한 money만큼의 사과개수 차감
//	public int receive(int money){	//int money = 구매자가 지불한금액 매개변수
//		
//		mymoney += money;		//mymoney에서 구매자가 지불한 금액만큼 +.
//		int cnt = money/price;	//구매자가 지불한금액/사과개당가격 = 지불한만큼의 사과개수
//		appleCnt -= cnt;//appleCnt - cnt = 판매자가 보유한사과개수(멤버변수)에서 판매한 사과개수만큼 빼서 저장해야함.
//		
//		return cnt; //지불한금액만큼 사과개수 리턴
//	}
//
//
//	//toString
//	@Override
//	public String toString() {
//		return "Seller [money=" + mymoney + ", count=" + appleCnt + ", price=" + price + "]";
//	}
//	
//	
//}
//
//
//public class C10Main2 {
//
//	public static void main(String[] args) {
//		
//		//판매자 참조객체 만들기
//		Seller 사과장수 = new Seller(100000,100,1000);
//		
//		//구매자 참조객체 만들기
//		Buyer 홍길동 = new Buyer(10000,0);
//		Buyer 철수 = new Buyer(20000,0);
//	
//		//buyer.payment(Seller seller, int money)에 인자값 전달.  
//		홍길동.payment(사과장수, 5000);
//		철수.payment(사과장수, 12000);
//		
//		
//		//Buyer,Seller에서 재정의 내용 출력.
//		//Buyer
//		System.out.println(홍길동);
//		System.out.println(철수);
//		//Seller
//		System.out.println(사과장수);
//		
//		
//		
//
//	}
//
//}
