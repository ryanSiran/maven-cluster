package cn.com.psr.general.study.design.mode.observer.demo;

public class Client {

	public static void main(String[] args) {
		Boss husanhan = new Boss();
		StockObserver tongshi1 = new StockObserver("同事1", husanhan);
		NBAObserver tongshi2 = new NBAObserver("同事2", husanhan);
		StockObserver tongshi3 = new StockObserver("同事3", husanhan);
		
		husanhan.attach(tongshi1);
		husanhan.attach(tongshi2);
		husanhan.attach(tongshi3);
		
		husanhan.detach(tongshi3);
		
		husanhan.setSubjectState("我胡三汉回来啦！");
		
		husanhan.toNotify();
		
		System.out.println(" ------------------ ");
		System.out.println(" 代理类的 ");
		
		Secretary lala = new Secretary();

		LOLObserver tongshi4 = new LOLObserver("同事4");
		MusicObserver tongshi5 = new MusicObserver("同事5");
		
		lala.setUpdate(tongshi4, "closeLOLMarket");
		lala.setUpdate(tongshi5, "closeMusicMarket");
		
		lala.setSubjectState("前台来啦");
		
		lala.toNotify();
	}
	
}
