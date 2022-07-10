package org.labmonkeys.apiserver.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.labmonkeys.apiserver.dto.MessageDto;

@Path("/api-test")
public interface ServerApi {

    @POST
    @Path("/message")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response receiveMessage(MessageDto message);

}
