package com.vm.explore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vm.model.Event;

@Path("/event")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EventResource {

    private Set<Event> events = Collections.synchronizedSet(new HashSet<>());

    public EventResource() {
        events.add(new Event("Login", "User Logged In"));
        events.add(new Event("Logout", "User Logged Out"));
    }

    @GET
    public Set<Event> list() {
        return events;
    }

    @POST
    public Set<Event> add(Event fruit) {
        events.add(fruit);
        return events;
    }

    @DELETE
    public Set<Event> delete(Event fruit) {
        events.remove(fruit);
        return events;
    }
}