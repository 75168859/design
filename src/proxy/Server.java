package proxy;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	UserServiceImpl us = new UserServiceImpl();
	public void startServer(){
		try {
			ServerSocket s = new ServerSocket(8080);
			
			while(true){
				Socket socket = s.accept();
				System.out.println("连接上了...");
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				String methodName = ois.readUTF();
				if("login".equals(methodName)){
					String name = ois.readUTF();
					String pass = ois.readUTF();
					boolean result = us.login(name, pass);
					oos.writeBoolean(result);
					oos.flush();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Server().startServer();
	}
}
