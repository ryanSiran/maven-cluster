package cn.com.psr.general.study.design.mode.simplefactory.demo;

/**
 * 
 * <B> Function : </B> Operation <br>
 * <B> Description : </B> 抽象计算类 <br>
 * <B> Company : </B> <br>
 *
 * @author Pan_Siran <br>
 * @data 2016年11月23日 上午8:53:41 <br>
 * @version v1.0
 *
 */
public abstract class Operation {

	private double numberA = 0;
	private double numberB = 0;
	
	public abstract double getResult();

	public double getNumberA() {
		return numberA;
	}

	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}

	public double getNumberB() {
		return numberB;
	}

	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}
	
}
