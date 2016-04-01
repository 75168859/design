package composite.safe;

import java.util.Enumeration;
import java.util.Vector;

public class Composite implements Component{
	Vector<Component> components = new Vector<Component>();
	@Override
	public void bussines() {
		
	}

	public void add(Component c) {
		components.add(c);
	}

	public void remove(Component c) {
		// TODO Auto-generated method stub
		
	}

	public Enumeration<Component> getEunm() {
		// TODO Auto-generated method stub
		return components.elements();
	}

	public Component getComponent() {
		// TODO Auto-generated method stub
		return this;
	}
	

}
