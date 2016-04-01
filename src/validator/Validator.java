package validator;

public class Validator {
	private Encrty encrty;
	private KeepStore keepStore;
	public Validator() {
		// TODO Auto-generated constructor stub
	}
	public void setEncrty(Encrty encrty) {
		this.encrty = encrty;
	}
	public void setKeepStore(KeepStore keepStore) {
		this.keepStore = keepStore;
	}
	
	public Validator(Encrty encrty, KeepStore keepStore) {
		super();
		this.encrty = encrty;
		this.keepStore = keepStore;
	}
	public void save(String name,String pass){
		String nPass = encrty.enctry(pass);
		keepStore.save(name,nPass);
		
	}
	public boolean validate(String name,String pass){
		String nPass = keepStore.getEncrty(name);
		//...
		return false;
	}
	
}
