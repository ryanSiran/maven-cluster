package cn.com.psr.general.study.design.mode.state.demo;

public class SleepingState extends WorkState{

	@Override
	public void writeProgram(Work w) {
		System.out.println("当前时间：" + w.getHour() + "点 不行了，睡着了。");
	}

}
