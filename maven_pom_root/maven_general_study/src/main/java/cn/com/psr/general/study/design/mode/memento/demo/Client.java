package cn.com.psr.general.study.design.mode.memento.demo;

public class Client {

	public static void main(String[] args) {
		
		GameRole atm = new GameRole();
		atm.getInitState();
		atm.stateDisplay();
		
		// 保存进度
		RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
		stateAdmin.setMemento(atm.saveState());
		
		atm.fight();
		atm.stateDisplay();
		
		// 读取进度
		atm.recoveryState(stateAdmin.getMemento());
		atm.stateDisplay();
		
	}
	
}
