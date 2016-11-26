package cn.com.psr.general.study.design.mode.state.demo;

public class AfternoonState extends WorkState{

	@Override
	public void writeProgram(Work w) {
		if(w.getHour() < 17){
			System.out.println("当前时间：" + w.getHour() + "点 下午状态还不错，继续努力");
		}else {
			w.setCurrent(new EveningState());
			w.writeProgram();
		}
	}

}
