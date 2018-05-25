package formation;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Principal {

   public static void main(String[] args) {
       
       try {
           URL url = new URL("http://localhost:9999/ws/recensement?WSDL");    
           QName qname = new QName("http://formation/", "RecensementImplService");
           Service service = Service.create(url, qname);
           qname = new QName("http://formation/", "RecensementImplPort");
           Recensement r = (Recensement)service.getPort(qname, Recensement.class);
           r.jeMeDeclare("catherine");
       } catch (MalformedURLException e) {
           e.printStackTrace();
       }

   }

}