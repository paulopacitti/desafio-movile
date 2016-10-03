package api;

import java.util.Map; 
import java.util.HashMap;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.FormParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.google.gson.Gson;

@Path("/api")
public class APIRest {
	@GET
	@Path("/query/1/{day}")
	@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	public Response BaseAtivaOperadoraDia(@PathParam("day") String dia){
		String objEx = "";
		return Response.status(Status.OK).entity(new Gson().toJson(objEx)).build();
	}
	
	@GET
	@Path("/query/2")
	@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	public Response CancelamentoOperadoraDia(){
		String objEx = "";
		return Response.status(Status.OK).entity(new Gson().toJson(objEx)).build();
	}
	
	@GET
	@Path("/query/3")
	@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	public Response ARPUOperadoraDia(){
		String objEx = "";
		return Response.status(Status.OK).entity(new Gson().toJson(objEx)).build();
	}
}
