package org.diva.mucha;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.diva.mucha.services.PersistenceService;
import org.diva.mucha.model.Greeting;

@Path("/")
public class RestEndpoint {
    
    @Inject
    PersistenceService persistenceService;

    @GET
    @Path("hello")
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() {
        Greeting greeting = new Greeting("hello");
        return Response.ok(greeting).build();   
    }
    
    @POST
    @Path("save")
    @Produces(MediaType.APPLICATION_JSON)
    public Response save(@Valid Greeting greeting) {
        Greeting saved = persistenceService.save(greeting);
        return Response.ok(saved).build();
    }
}
