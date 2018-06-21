package formation;

import javax.xml.ws.Endpoint;

public class Principal {

	public static void main(String[] args) {
		
		 Endpoint.publish("http://localhost:9999/ws/compteurs", new CompteurImpl());

	}

}