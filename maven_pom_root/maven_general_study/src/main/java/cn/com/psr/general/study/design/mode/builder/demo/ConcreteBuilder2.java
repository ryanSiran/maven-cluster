package cn.com.psr.general.study.design.mode.builder.demo;

public class ConcreteBuilder2 extends Builder{

	private Product product = new Product();
	
	@Override
	public void buildPartA() {
		product.Add("部件X");
	}

	@Override
	public void buildPartB() {
		product.Add("部件Y");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
