package composite;

import java.util.Enumeration;

public interface Component {
	public void bussines();
	public void add(Component c);
	public void remove(Component c);
	Enumeration<Component> getEunm();
	public Component getComponent();
	
}
