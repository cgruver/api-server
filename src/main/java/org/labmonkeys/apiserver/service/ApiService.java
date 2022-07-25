package org.labmonkeys.apiserver.service;

import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Response;

import org.jboss.logging.Logger;
import org.labmonkeys.apiserver.api.ServerApi;
import org.labmonkeys.apiserver.dto.MessageDto;

@ApplicationScoped
public class ApiService implements ServerApi {
    
    final Logger LOG = Logger.getLogger(ApiService.class);

    @Override
    public Response receiveMessage(MessageDto message) {
        
        LOG.info(message);
        MessageDto response = new MessageDto(UUID.randomUUID(), "Hello To You!");
        return(Response.ok(response).build());
    }
}
