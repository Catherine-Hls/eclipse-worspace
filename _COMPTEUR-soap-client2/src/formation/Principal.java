package formation;


import java.net.URL;


import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Principal {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        URL url;
        try {
            url = new URL("http://localhost:9999/ws/compteurs?WSDL");
            QName qname = new QName("http://formation/", "CompteurImplService");
            Service service = Service.create(url, qname);        
            CompteurImpl r = service.getPort(CompteurImpl.class);
            r.ecrire("catherine", 2000);
        } catch (Exception e) {
         
            e.printStackTrace();
        }    
    }

}