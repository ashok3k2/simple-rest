package com.myntra.simplerest.service;

import com.myntra.simplerest.model.SubjectOfCare;
import com.myntra.simplerest.model.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by ashok.maurya on 01/07/17.
 */
@Path("/user")
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public interface SubjectOfCareService {

    @GET
    @Path("/{id}")
    SubjectOfCare get(@PathParam("id") Integer id);
}
