package com.trg.chatbot;

public class DetailsProviderImpl implements DetailsProvider {
	
	String name;
	String location;
	String beds;
	

	public DetailsProviderImpl(String name, String location, String beds) {
		name = name;
		location = location;
		beds = beds;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getLocation() {
		return location;
	}

	@Override
	public String getNoOfBeds() {
		return beds;
	}

}
