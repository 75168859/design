package composite;

import java.util.Enumeration;
import java.util.Vector;

public class Composite implements Component{
	Vector<Component> components = new Vector<Component>();
	@Override
	public void bussines() {
		
	}

	@Override
	public void add(Component c) {
		components.add(c);
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Enumeration<Component> getEunm() {
		// TODO Auto-generated method stub
		return components.elements();
	}

	@Override
	public Component getComponent() {
		// TODO Auto-generated method stub
		return this;
	}
	

}
