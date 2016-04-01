package proxy;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class UserServicProxy implements UserService {

	@Override
	public boolean login(String name, String pass) {
		try {
			//连接服务器
			Socket socket = new Socket("127.0.0.1",8080);
			//告诉服务器做什么
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeUTF("login");
			oos.flush();
			//把要做的事情的数据发送过去
			oos.writeUTF(name);
			oos.writeUTF(pass);
			oos.flush();
			//读响应数据
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			return ois.readBoolean();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

}
