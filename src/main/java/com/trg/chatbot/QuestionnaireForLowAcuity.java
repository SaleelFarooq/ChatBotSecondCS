package com.trg.chatbot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class QuestionnaireForLowAcuity extends Questionnaire{
	public static final String CARDIACOUTPUT="cardiacoutput";
	public static final String MASIMORAINBOW = "masimorainbow";
	
	public QuestionnaireForLowAcuity() {
		mapOfProperties.put("0","type");
		mapOfProperties.put("1","Combination of Parameters");
		mapOfProperties.put("2","touch");
		mapOfProperties.put("3","screensize");
	}
	
	
	
	public List<String> setOptionsForParameters(){
		List<String> optionList=new ArrayList<>();
		optionList.add("Philips SpO2");
		optionList.add("Philips SpO2 , Cardiac output");
		optionList.add("Philips SpO2 , Masimo Rainbow");
		optionList.add("Philips SpO2 , Cardiac Output , Masimo Rainbow");
		return optionList;
	}
	
	public List<Pms> setSuggestionBasedOnParameters(List<Pms> availableProducts,String response) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException{
		List<Pms> result=new ArrayList<>();
		if(response.equals("Philips SpO2")){
			result=availableProducts;
		}
		if(response.equals("Philips SpO2 , Cardiac output")){
			result=Utility.narrowDownSuggestions(availableProducts,CARDIACOUTPUT,"yes");
			result.addAll(Utility.narrowDownSuggestions(availableProducts,CARDIACOUTPUT,"opt"));
		}
		if(response.equals("Philips SpO2 , Masimo Rainbow")){
			result=Utility.narrowDownSuggestions(availableProducts,MASIMORAINBOW,"yes");
			result.addAll(Utility.narrowDownSuggestions(availableProducts,MASIMORAINBOW,"opt"));
		}
		if(response.equals("Philips SpO2 , Cardiac Output , Masimo Rainbow")){
			result=Utility.narrowDownSuggestions(availableProducts,MASIMORAINBOW,"yes");
			result.addAll(Utility.narrowDownSuggestions(availableProducts,MASIMORAINBOW,"opt"));
			result=Utility.narrowDownSuggestions(availableProducts,CARDIACOUTPUT,"yes");
			result.addAll(Utility.narrowDownSuggestions(availableProducts,CARDIACOUTPUT,"opt"));
		}
		return result;
	}
}
