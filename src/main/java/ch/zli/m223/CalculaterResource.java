package ch.zli.m223;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/calculator")
public class CalculaterResource {
    
    @GET
    @Path("/add/{number1}/{number2}")
    public int add(@PathParam("number1") int number1, @PathParam("number2") int number2 ){
        return number1 + number2;
    }
}
