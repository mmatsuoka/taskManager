/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biz.solidc.taskmanager.rest;

import biz.solidc.taskmanager.model.Task;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.DELETE;

/**
 * REST Web Service
 *
 * @author masayasu
 */
public class TaskResource {

	private String id;

	/**
	 * Creates a new instance of TaskResource
	 */
	private TaskResource(String id) {
		this.id = id;
	}

	/**
	 * Get instance of the TaskResource
	 */
	public static TaskResource getInstance(String id) {
		// The user may use some kind of persistence mechanism
		// to store and restore instances of TaskResource class.
		return new TaskResource(id);
	}

	/**
	 * Retrieves representation of an instance of biz.solidc.taskmanager.rest.TaskResource
	 * @return an instance of biz.solidc.taskmanager.model.Task
	 */
	@GET
        @Produces("application/json")
	public Task getJson() {
		//TODO return proper representation object
		throw new UnsupportedOperationException();
	}

	/**
	 * PUT method for updating or creating an instance of TaskResource
	 * @param content representation for the resource
	 * @return an HTTP response with content of the updated or created resource.
	 */
	@PUT
        @Consumes("application/json")
	public void putJson(Task content) {
	}

	/**
	 * DELETE method for resource TaskResource
	 */
	@DELETE
	public void delete() {
	}
}
