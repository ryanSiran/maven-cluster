package cn.com.psr.general.study.design.mode.simplefactory.demo;

public class OperationAdd extends Operation{

	@Override
	public double getResult() {
		return getNumberA() + getNumberB();
	}

}
