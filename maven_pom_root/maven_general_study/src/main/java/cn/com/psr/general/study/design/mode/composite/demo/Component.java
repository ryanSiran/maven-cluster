package cn.com.psr.general.study.design.mode.composite.demo;

public abstract class Component {

	protected String name;
	
	public Component(String name) {
		this.name = name;
	}
	
	public abstract void add(Component c);
	public abstract void remove(Component c);
	public abstract void display(int depth);
	
}
