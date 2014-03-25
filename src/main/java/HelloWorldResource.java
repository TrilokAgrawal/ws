import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/helloworld")
public class HelloWorldResource {
	
	@GET
	@Produces(value = {"text/html", "pdf"})
	public String getMessage() {
		return "hello world";
	}
	
	@POST
	@Consumes(value = "text/html")
	public void postMessage(String message) {
		
	}

}
