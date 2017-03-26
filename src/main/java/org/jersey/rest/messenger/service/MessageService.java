package org.jersey.rest.messenger.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.jersey.rest.messenger.database.DatabaseStub;
import org.jersey.rest.messenger.model.Message;

public class MessageService {

	private Hashtable<Long, Message> messages = DatabaseStub.getMessages(); 
	
	public MessageService() {
		messages.put(1L, new Message(1, "Hi 1", "user1"));
		messages.put(2L, new Message(2, "Hi 2", "user2"));
	}
			
	public List<Message> getAllMessages() {
		return new ArrayList(messages.values());
	}
	
	public Message getMessage(long id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if(message.getId() <= 0){
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id) {
		return messages.remove(id);
	}
}
