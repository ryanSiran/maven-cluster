package cn.com.psr.general.study.design.mode.state.demo;

public class EveningState extends WorkState{

	@Override
	public void writeProgram(Work w) {
		if(w.isFinish()){
			w.setCurrent(new RestState());
			w.writeProgram();
		}else {
			if(w.getHour() < 21){
				System.out.println("当前时间：" + w.getHour() + "点 加班哦，疲劳之极");
			}else {
				w.setCurrent(new SleepingState());
				w.writeProgram();
			}
		}
	}

}
