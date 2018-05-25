package formation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;


@Path("/bonjour")
public class Bonjour {
	/*@GET
	@Path("/")
	Response ditBonjour() {
		String message = "Bonjour � tous";
		return Response.status(200).entity(message).build();
	}*/

	@GET
	@Path("/{aqui}")
	public Response ditBonjour2(@PathParam("aqui") String aqui) {
		String message = "Bonjour � toi" + aqui;
		return Response.status(200).entity(message).build();
	}
}
