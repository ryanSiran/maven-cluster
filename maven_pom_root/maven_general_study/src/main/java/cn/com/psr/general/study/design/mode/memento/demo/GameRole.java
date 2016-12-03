package cn.com.psr.general.study.design.mode.memento.demo;

public class GameRole {

	// 生命力
	private int vit;
	// 攻击力
	private int atk;
	// 防御力
	private int def;
	
	public void stateDisplay(){
		System.out.println("角色当前状态：");
		System.out.println("体力：" + vit);
		System.out.println("攻击力：" + atk);
		System.out.println("防御力：" + def);
		System.out.println();
	}
	
	public void getInitState(){
		this.vit = 100;
		this.atk = 100;
		this.def = 100;
	}
	
	public void fight(){
		this.vit = 0;
		this.atk = 0;
		this.def = 0;
	}
	
	public RoleStateMemento saveState(){
		return new RoleStateMemento(vit, atk, def);
	}
	
	public void recoveryState(RoleStateMemento memento){
		this.vit = memento.getVit();
		this.atk = memento.getAtk();
		this.def = memento.getDef();
	}
	
	/**
	 * @return the vit
	 */
	public int getVit() {
		return vit;
	}
	/**
	 * @param vit the vit to set
	 */
	public void setVit(int vit) {
		this.vit = vit;
	}
	/**
	 * @return the atk
	 */
	public int getAtk() {
		return atk;
	}
	/**
	 * @param atk the atk to set
	 */
	public void setAtk(int atk) {
		this.atk = atk;
	}
	/**
	 * @return the def
	 */
	public int getDef() {
		return def;
	}
	/**
	 * @param def the def to set
	 */
	public void setDef(int def) {
		this.def = def;
	}
	
}
