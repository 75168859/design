package proxy;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class UserServicProxy implements UserService {

	@Override
	public boolean login(String name, String pass) {
		try {
			//���ӷ�����
			Socket socket = new Socket("127.0.0.1",8080);
			//���߷�������ʲô
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeUTF("login");
			oos.flush();
			//��Ҫ������������ݷ��͹�ȥ
			oos.writeUTF(name);
			oos.writeUTF(pass);
			oos.flush();
			//����Ӧ����
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			return ois.readBoolean();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

}
