package cn.com.psr.general.study.design.mode.state.demo;

public class Context {

	private State state;

	public Context(State state) {
		this.state = state;
	}
	
	public void request(){
		state.handle(this);
	}
	
	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(State state) {
		this.state = state;
		System.out.println("当前状态:" + state.getClass().getName());
	}
	
	
	
	
	
}
