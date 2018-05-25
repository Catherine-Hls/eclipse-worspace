package formation;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Principal {

   public static void main(String[] args) {
       
       try {
           URL url = new URL("http://10.130.10.3:9999/ws/recensement?WSDL");    
           QName qname = new QName("http://soap.poec.fr/", "RecensementImplService");
           Service service = Service.create(url, qname);
           qname = new QName("http://soap.poec.fr/", "RecensementImplPort");
           fr.poec.soap.RecensementImpl r = (fr.poec.soap.RecensementImpl)service.getPort(qname, fr.poec.soap.RecensementImpl.class);
           r.jeMeDeclare("nouveau test - kate");
       } catch (MalformedURLException e) {
           e.printStackTrace();
       }

   }

}