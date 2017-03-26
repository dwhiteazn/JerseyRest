package org.jersey.rest.messenger.resources;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jersey.rest.messenger.model.Message;
import org.jersey.rest.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {

	private MessageService messageService = new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}

	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long messageId) {
		return messageService.getMessage(messageId);
	}
	
	@GET
	@Path("/{messageId1}/and/{messageId2}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessage(@PathParam("messageId1") long messageId1,
									@PathParam("messageId2") long messageId2) {
		List<Message> msgList = new ArrayList<>();
		msgList.add(messageService.getMessage(messageId1));
		msgList.add(messageService.getMessage(messageId2));
		return msgList;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message) {
		return messageService.addMessage(message);
	}
	
	@PUT
	@Path("/{messageId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("messageId") long messageId,
														 Message message) {
		message.setId(messageId);
		return messageService.updateMessage(message);
	}
	
	@PUT
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deletMessage(@PathParam("messageId") long messageId) {
		messageService.removeMessage(messageId);
	}
}
