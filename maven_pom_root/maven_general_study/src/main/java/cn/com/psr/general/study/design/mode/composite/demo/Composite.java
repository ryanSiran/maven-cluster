package cn.com.psr.general.study.design.mode.composite.demo;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{

	private List<Component> children = new ArrayList<>();
	
	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		for(int i = depth; i > 0; i--){
			System.out.print("-");
		}
		System.out.println(" " + name);
		for(Component component : children){
			component.display(depth + 2);
		}
	}

}
