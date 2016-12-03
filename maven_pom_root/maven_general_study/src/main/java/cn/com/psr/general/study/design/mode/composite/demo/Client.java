package cn.com.psr.general.study.design.mode.composite.demo;

public class Client {

	public static void main(String[] args) {
		
		ConcreteCompany root = new ConcreteCompany("惠州总公司");
		root.add(new HRDepartment("总公司人力资源部"));
		root.add(new FinanceDepartment("总公司财务部"));
		
		ConcreteCompany compHN = new ConcreteCompany("华南分公司");
		compHN.add(new HRDepartment("华南分公司人力资源部"));
		compHN.add(new FinanceDepartment("华南分公司财务部"));
		root.add(compHN);
		
		ConcreteCompany compA = new ConcreteCompany("南京办事处");
		compA.add(new HRDepartment("南京办事处人力资源部"));
		compA.add(new FinanceDepartment("南京办事处财务部"));
		compHN.add(compA);
		
		ConcreteCompany compB = new ConcreteCompany("杭州办事处");
		compB.add(new HRDepartment("杭州办事处人力资源部"));
		compB.add(new FinanceDepartment("杭州办事处财务部"));
		compHN.add(compB);
	
		root.display(1);
	}
	
	/*public static void main(String[] args) {
		
		Composite root = new Composite("root");
		root.add(new Leaf("A"));
		root.add(new Leaf("B"));
		
		Composite compX = new Composite("Composite X");
		compX.add(new Leaf("XA"));
		compX.add(new Leaf("XB"));
		
		root.add(compX);
		
		Composite compY = new Composite("Composite Y");
		compY.add(new Leaf("YA"));
		compY.add(new Leaf("YB"));
		
		root.add(compY);
		
		root.display(1);
		
	}*/
	
}
