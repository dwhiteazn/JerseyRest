package org.jersey.rest.messenger.model;

import java.util.Date;

public class Comment {
	private long id;
	private String comment;
	private Date date;
	private String created;
	
	public Comment() {
		//no-arg constructor for XML/JSON conversion
	}
	
	public Comment(long id, String comment, String created) {
		this.id = id;
		this.comment = comment;
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
		return comment;
	}
	
	public void setMessage(String comment) {
		this.comment = comment;
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
}
