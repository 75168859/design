package composite;

import java.util.Enumeration;

public class Leaf implements Component{

	@Override
	public void bussines() {
	}

	@Override
	public void add(Component c) {
	}
	@Override
	public void remove(Component c) {
	}

	@Override
	public Enumeration<Component> getEunm() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Component getComponent() {
		// TODO Auto-generated method stub
		return this;
	}

}
