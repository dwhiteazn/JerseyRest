package org.jersey.rest.messenger.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.jersey.rest.messenger.database.DatabaseStub;
import org.jersey.rest.messenger.model.Profile;

public class ProfileService {
	private Hashtable<String, Profile> profiles = DatabaseStub.getProfiles();
	
	public ProfileService() {
		profiles.put("profile1", new Profile(1, "profile1", "PRO", "file"));
	}
	
	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile) {
		if (profile.getId() <= 0) {
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile; 
	}
	
	public Profile removeProfile(String profileName) {
		return profiles.remove(profileName);
	}
}
