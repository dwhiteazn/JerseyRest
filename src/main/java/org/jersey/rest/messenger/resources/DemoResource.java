package org.jersey.rest.messenger.resources;

import javax.ws.rs.Path;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/demo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class DemoResource {
	
	/*
	 * Matrix param : http://localhost:8080/messenger/webapi/demo/anno;param=val
	 * Header param : type:{headerParamName} value:{value} in header
	 * Cookie param : add to header type:Cookie value:{value} 
	 */
	@GET
	@Path("anno")
	public String getParamsUsingAnnoimport (@MatrixParam("param") String matrixParam,
										    @HeaderParam("customHeaderParam") String headerParam,
										    @CookieParam("cookieName") String cookieParam) {
		return matrixParam + ";" + headerParam + ";" + cookieParam;
	}
	
	@GET
	@Path("context")
	public String getParamsUsingContext(@Context UriInfo uriInfo, @Context HttpHeaders headers) {
		String path = uriInfo.getAbsolutePath().toString();
		String cookies = headers.getCookies().toString();
		return path + cookies;
	}
}
