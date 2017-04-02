package org.jersey.rest.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class CommentResource {
	
	@GET
	public String getComment() {
		return "subresource ex";
	}
	
	@GET
	@Path("/{commentId}")
	public String getCommentWithIds(@PathParam("messageId") long messageId,
									@PathParam("commentId") long commentId) {
		return commentId + " : " + messageId;
	}
	

}
