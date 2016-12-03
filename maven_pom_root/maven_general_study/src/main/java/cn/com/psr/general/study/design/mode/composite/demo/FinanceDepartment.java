package cn.com.psr.general.study.design.mode.composite.demo;

public class FinanceDepartment extends Company{

	public FinanceDepartment(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {
	}

	@Override
	public void remove(Company c) {
	}

	@Override
	public void display(int depth) {
		for(int i = depth; i > 0; i--){
			System.out.print("-");
		}
		System.out.println(" " + name);
	}

	@Override
	public void lineOfDuty() {
		System.out.println(name + " 公司财务收支管理");
	}

}
