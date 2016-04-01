package proxy;

public class UserServiceImpl implements UserService{

	@Override
	public boolean login(String name, String pass) {
		if("aaa".equals(name)&&"123".equals(pass))
			return true;
		return false;
	}

}
