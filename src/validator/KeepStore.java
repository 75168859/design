package validator;

public interface KeepStore {
	public void save(String name,String pass);
	public String getEncrty(String name);
}
