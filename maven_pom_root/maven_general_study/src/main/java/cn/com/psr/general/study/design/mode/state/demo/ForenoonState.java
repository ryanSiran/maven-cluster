package cn.com.psr.general.study.design.mode.state.demo;

public class ForenoonState extends WorkState{

	@Override
	public void writeProgram(Work w) {
		if(w.getHour() < 12){
			System.out.println("当前时间：" + w.getHour() + "点 上午工作，精神百倍");
		}else {
			w.setCurrent(new NoonState());
			w.writeProgram();
		}
	}

}
