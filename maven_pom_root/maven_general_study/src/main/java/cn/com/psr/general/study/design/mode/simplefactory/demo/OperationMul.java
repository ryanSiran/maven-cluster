package cn.com.psr.general.study.design.mode.simplefactory.demo;

public class OperationMul extends Operation{

	@Override
	public double getResult() {
		return getNumberA() * getNumberB();
	}

}
