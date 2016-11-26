package cn.com.psr.general.study.design.mode.state.demo;

public class ConcreteStateA extends State{

	@Override
	public void handle(Context context) {
		context.setState(new ConcreteStateB());
	}

}
