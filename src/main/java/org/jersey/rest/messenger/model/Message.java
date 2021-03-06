package org.jersey.rest.messenger.model;

import java.util.Date;
import java.util.Hashtable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Message {

	private long id;
	private String message;
	private Date date;
	private String created;
	private Hashtable<Long, Comment> comments;
	
	public Message() {
		//no-arg constructor for XML/JSON conversion
	}
	
	public Message(long id, String message, String created) {
		this.id = id;
		this.message = message;
		this.date = new Date();
		this.created = created;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getCreated() {
		return created;
	}
	
	public void setCreated(String created) {
		this.created = created;
	}
	
	@XmlTransient
	public Hashtable<Long, Comment> getComments() {
		return comments;
	}
	
	public void setComments(Hashtable<Long, Comment> comments) {
		this.comments = comments;
	}

}
