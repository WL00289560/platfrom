package platfrom.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("totalhello")
public class HellowView {
	@Path("hello")
	@GET
	@Produces("text/plain")
	public String hello() {
		return "Hellow User!";
	}
}
