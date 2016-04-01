package validator;

import java.io.IOException;
import java.util.Properties;

public class ValidatorFactory {
	private static Properties prop = new Properties();
	static{
		try {
			prop.load(ValidatorFactory.class.getResourceAsStream("/validator/aa.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Validator getInstance(){
		Validator validator = new Validator();
		Encrty encrty = getEnctry();//new Md5Enctry();
		KeepStore keepStore = getStore();//new MemoryKeepStore();
		validator.setEncrty(encrty);
		validator.setKeepStore(keepStore);
		return validator;
	}
	public static Encrty getEnctry(){
		//return new Md5Enctry();
		try {
			return (Encrty)Class.forName(prop.getProperty("enctry")).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
	}
	public static KeepStore getStore(){
		try {
			return (KeepStore)Class.forName(prop.getProperty("store")).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
	}

}
