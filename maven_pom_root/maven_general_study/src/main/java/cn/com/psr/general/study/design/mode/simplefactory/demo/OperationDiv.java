package cn.com.psr.general.study.design.mode.simplefactory.demo;

public class OperationDiv extends Operation{

	@Override
	public double getResult() {
		return getNumberA() / getNumberB();
	}

}
