package cn.com.psr.general.study.design.mode.memento.demo;

public class RoleStateMemento {

	private int vit;
	private int atk;
	private int def;
	
	public RoleStateMemento(int vit, int atk, int def){
		this.vit = vit;
		this.atk = atk;
		this.def = def;
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
