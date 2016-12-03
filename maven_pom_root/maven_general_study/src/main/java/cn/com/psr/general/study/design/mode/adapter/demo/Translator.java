package cn.com.psr.general.study.design.mode.adapter.demo;

public class Translator extends Player{

	private ForeignCenter fc;
	
	public Translator(String name) {
		super(name);
		fc = new ForeignCenter(name);
	}

	@Override
	public void attack() {
		fc.jingong();
	}

	@Override
	public void defense() {
		fc.fangshou();
	}

}
