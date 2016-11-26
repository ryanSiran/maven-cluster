package cn.com.psr.general.study.design.mode.state.demo;

public class NoonState extends WorkState{

	@Override
	public void writeProgram(Work w) {
		if(w.getHour() < 13){
			System.out.println("当前时间：" + w.getHour() + "点 饿了，午饭；犯困，午休。");
		}else {
			w.setCurrent(new AfternoonState());
			w.writeProgram();
		}
	}

}
