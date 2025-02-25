package com.github.jdussouillez;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "device")
@Path("objects")
public interface DeviceRestClient {

    @GET
    @Path("/{id}")
    @ClientHeaderParam(name = HttpHeaders.ACCEPT_ENCODING, value = "gzip")
    @Produces(MediaType.APPLICATION_JSON)
    Uni<String> get(@PathParam("id") int id);
}
