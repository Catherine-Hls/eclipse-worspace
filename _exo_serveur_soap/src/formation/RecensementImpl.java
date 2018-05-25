package formation;

import javax.jws.WebService;

@WebService
public class RecensementImpl  implements Recensement{

	
    public void jeMeDeclare(String qui) {
        System.out.println(qui);
        
    }
    

}