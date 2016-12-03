package cn.com.psr.general.study.design.mode.composite.demo;

public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		System.out.println("leaf不需要添加");
	}

	@Override
	public void remove(Component c) {
		System.out.println("leaf不需要删除");
	}

	@Override
	public void display(int depth) {
		for(int i = depth; i > 0; i--){
			System.out.print("-");
		}
		System.out.println(" " + name);
	}

}
