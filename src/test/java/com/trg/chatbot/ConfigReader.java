package com.trg.chatbot;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConfigReader {
	 ConfigMapper configMapper;
	 Map<String, String> defaults = Stream.of(new String[][] {
         { "displayFormat", "2x4" },
         { "brightness", "medium" },
         { "orientation", "landscape"}
 }).collect(Collectors.toMap(data -> data[0], data -> data[1]));
	 
	 
	 String getParameterValue(String parameterName)
	    {
	        String parameterValue = defaults.get(parameterName);
	        if(configMapper.containsKey(parameterName)) {
	            parameterValue = (String) configMapper.get(parameterName);
	        }
	        return parameterValue;
	    }


	public ConfigReader(ConfigMapper configMap) {
		configMapper=configMap;
	}

}
