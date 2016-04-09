package wildfly.swarm.ajp;

import org.joda.time.DateTime;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class MyResource {

  @GET
  public String get() {
    return "Houdy at" + new DateTime();
  }

}
