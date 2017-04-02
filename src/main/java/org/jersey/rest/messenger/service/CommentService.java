package org.jersey.rest.messenger.service;

import java.util.Hashtable;

import org.jersey.rest.messenger.database.DatabaseStub;
import org.jersey.rest.messenger.model.Message;
import org.jersey.rest.messenger.model.Comment;

public class CommentService {
	private Hashtable<Long, Message> messages = DatabaseStub.getMessages();
	
	public List<Comment> getAllComments(long messageId) {
		Hashtable<Long, Comment> comments = messages.get(messageId).getComments();
	}
}
