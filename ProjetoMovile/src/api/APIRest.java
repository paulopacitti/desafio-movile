package api;

import java.util.Map;
import java.util.ArrayList;
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
import DBOs.Daily;
import DAOs.Dailies;

import com.google.gson.Gson;

@Path("/api")
public class APIRest {
	@GET
	@Path("/query/1/{day}")
	@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	public Response BaseAtivaOperadoraDia(@PathParam("day") String dia){
		try {
			ArrayList resultantes = Dailies.getByDateOrderByCarrier(dia);
			return Response.status(Status.OK).entity(new Gson().toJson(resultantes)).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return Response.status(Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GET
	@Path("/query/2")
	@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	public Response CancelamentoOperadoraDia(){
		try {
			ArrayList resultantes = Dailies.getCancelationsByType();
			return Response.status(Status.OK).entity(new Gson().toJson(resultantes)).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return Response.status(Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	/*@GET
	@Path("/query/3")
	@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
	public Response ARPUOperadoraDia(){
		try {
			ArrayList resultantes = Dailies.getCancelationsByType();
			return Response.status(Status.OK).entity(new Gson().toJson(resultantes)).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return Response.status(Status.INTERNAL_SERVER_ERROR).build();
		}
	}*/
}
