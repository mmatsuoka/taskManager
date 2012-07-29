/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biz.solidc.taskmanager.rest;

import biz.solidc.taskmanager.model.Task;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author masayasu
 */
@Path("/task")
public class TasksResource {

	@Context
	private UriInfo context;

	/**
	 * Creates a new instance of TasksResource
	 */
	public TasksResource() {
	}

	/**
	 * Retrieves representation of an instance of biz.solidc.taskmanager.rest.TasksResource
	 * @return an instance of java.util.List
	 */
	@GET
        @Produces("application/json")
	public List getJson() {
		//TODO return proper representation object
		throw new UnsupportedOperationException();
	}

	/**
	 * POST method for creating an instance of TaskResource
	 * @param content representation for the new resource
	 * @return an HTTP response with content of the created resource
	 */
	@POST
        @Consumes("application/json")
        @Produces("application/json")
	public Response postJson(Task content) {
		//TODO
		return Response.created(context.getAbsolutePath()).build();
	}

	/**
	 * Sub-resource locator method for {id}
	 */
	@Path("{id}")
	public TaskResource getTaskResource(@PathParam("id") String id) {
		return TaskResource.getInstance(id);
	}
}
