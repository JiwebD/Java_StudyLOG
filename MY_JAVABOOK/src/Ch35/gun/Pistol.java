package Ch35.gun;

import Ch35.unit.Unit;

public class Pistol extends Gun{

	public Pistol(){
		this.maxBullitCnt = 10;
		this.curBullitCnt= 0;
		this.power= 20;
	}

	@Override
	public void fire(Unit unit) {
		if(curBullitCnt==0) {
			System.out.println("총알 : 0 재장전 필요..");
			return ;
		}
		unit.underAttact(this.power);
		curBullitCnt--;
	}

	@Override
	public void reload(int bullit) {
		// TODO Auto-generated method stub
		if(this.maxBullitCnt>curBullitCnt+bullit)
			this.curBullitCnt+=bullit;
		else
			this.curBullitCnt=maxBullitCnt;
	}

}
