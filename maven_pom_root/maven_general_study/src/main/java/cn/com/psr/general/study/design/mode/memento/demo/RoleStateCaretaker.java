package cn.com.psr.general.study.design.mode.memento.demo;

public class RoleStateCaretaker {

	private RoleStateMemento memento;

	/**
	 * @return the memento
	 */
	public RoleStateMemento getMemento() {
		return memento;
	}

	/**
	 * @param memento the memento to set
	 */
	public void setMemento(RoleStateMemento memento) {
		this.memento = memento;
	}
	
}
