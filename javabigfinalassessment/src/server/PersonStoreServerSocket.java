package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class PersonStoreServerSocket {
	DataReader store;

	public void start() {
		try {
			ServerSocket serverSocket = new ServerSocket(8000);
			Socket socket = serverSocket.accept();
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			while (true) {
				if (ois.read() > -1) {
					// CSVDataReader reader = new
					// CSVDataReader("C:/persons.csv");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
