package decorator;

public abstract class Decorator extends Component{
	protected Component component;
	public Decorator(Component c){
		this.component = c;
	}
	@Override
	public void bussiness() {
		component.bussiness();
	}
}
