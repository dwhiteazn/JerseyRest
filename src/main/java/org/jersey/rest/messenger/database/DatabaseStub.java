package org.jersey.rest.messenger.database;

import java.util.Hashtable;
import org.jersey.rest.messenger.model.Message;
import org.jersey.rest.messenger.model.Profile;

public class DatabaseStub {

	private static Hashtable<Long, Message> messages = new Hashtable<>();
	private static Hashtable<String, Profile> profiles = new Hashtable<>();


	public static Hashtable<Long, Message> getMessages() {
		return messages;
	}

	public static Hashtable<String, Profile> getProfiles() {
		return profiles;
	}
}
