package org.diva.mucha;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.diva.mucha.model.Greeting;

@Path("api")
public class RestEndpoint {

    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() {
        Greeting greeting = new Greeting("hello example");
        return Response.ok(greeting).build();
        
    }
}
