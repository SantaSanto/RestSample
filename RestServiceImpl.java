package com.rest.sample.service.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.sample.model.Student;
import com.rest.sample.service.RestService;

@Path("/student")
public class RestServiceImpl implements RestService {

	@Override
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Student getStudentById(@PathParam("id") int id) {
		final Student stu = new Student();
		stu.setId(id);
		stu.setName("My Name");
		return stu;
	}

}
