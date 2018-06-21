package formation;


import java.net.URL;


import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Principal {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        URL url;
        try {
            url = new URL("http://10.130.12.49:9999/formation/compteurs?WSDL");
            QName qname = new QName("http://formation/", "CompteurImplService");
            Service service = Service.create(url, qname);        
            CompteurImpl uc = service.getPort(CompteurImpl.class);
            int compteur = 0;
            
            while (true) {
            	uc.ecrire("catherine", compteur ++);
            	Thread.sleep(200);
            }
        } catch (Exception e) {
         
            e.printStackTrace();
        }     
    }

}