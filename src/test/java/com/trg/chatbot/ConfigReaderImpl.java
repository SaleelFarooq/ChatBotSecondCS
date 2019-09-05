package com.trg.chatbot;

public class ConfigReaderImpl implements ConfigMapper {
	
	private boolean keyIsPresent;
	private String keytoReturn;
	
	

	ConfigReaderImpl(boolean keyPresence,String keyReturn) {
		keyIsPresent=keyPresence;
		keytoReturn=keyReturn;
	}

	@Override
	public String get(String parametername) {
		return keytoReturn;
	}

	@Override
	public boolean containsKey(String parametername) {
		return keyIsPresent;
	}

}
