package cn.com.psr.general.study.design.mode.simplefactory.demo;

/**
 * 
 * <B> Function : </B> OperationFactory <br>
 * <B> Description : </B> 简单工厂类 <br>
 * <B> Company : </B> <br>
 *
 * @author Pan_Siran <br>
 * @data 2016年11月23日 上午8:53:55 <br>
 * @version v1.0
 *
 */
public class OperationFactory {

	public static Operation createOperate(String operate){
		Operation oper = null;
		switch (operate) {
		case "+":
			oper = new OperationAdd();
			break;
		case "-":
			oper = new OperationSub();
			break;
		case "*":
			oper = new OperationMul();
			break;
		case "/":
			oper = new OperationDiv();
			break;
		}
		return oper;
	}
	
}
