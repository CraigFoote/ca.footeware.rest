/**
 * 
 */
package ca.footeware.rest.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author <a href="http://Footeware.ca">Footeware.ca</a>
 */
@Path("/hello")
public class HelloWorld
{
	/**
	 * @return {@link String}
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public static String hello()
	{
		return "Hello World!";
	}
}
