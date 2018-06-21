package exo_android_client;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;


public class Principal {

	public static void main(String[] args) {
		byte [] message = new byte [100];
		
		try {
			Socket s = new Socket ("localhost", 2222);
			InputStream is = s.getInputStream();
			int nb = is.read(message);
			System.out.println(new String (message, 0, nb) );
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
