package com.demo.manoj;

import java.util.*;
import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResources 
{
	AlienRepositry repo = new AlienRepositry();
	
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_ATOM_XML})
	public List<Alien> getAliens() 
	{

		return repo.getAliens();
	}
	
	@Path("alien/101")
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_ATOM_XML})
	public Alien getAlien() 
	{

		return repo.getAlien(101);
	}
	
	
	
	@POST
	@Path("alien")
	public Alien createAlien(Alien a1) 
	{
		System.out.println(a1);
		repo.create(a1);
		
		return a1;
	}
	
}
