package cn.com.psr.general.study.design.mode.state.demo;

public class Work {

	private WorkState current;
	private double hour;
	private boolean finish = false;
	
	public Work() {
		current = new ForenoonState();
	}
	
	public void writeProgram(){
		current.writeProgram(this);
	}

	/**
	 * @return the current
	 */
	public WorkState getCurrent() {
		return current;
	}

	/**
	 * @param current the current to set
	 */
	public void setCurrent(WorkState current) {
		this.current = current;
	}

	/**
	 * @return the hour
	 */
	public double getHour() {
		return hour;
	}

	/**
	 * @param hour the hour to set
	 */
	public void setHour(double hour) {
		this.hour = hour;
	}

	/**
	 * @return the finish
	 */
	public boolean isFinish() {
		return finish;
	}

	/**
	 * @param finish the finish to set
	 */
	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	
}
