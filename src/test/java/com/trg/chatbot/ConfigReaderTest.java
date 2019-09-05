package com.trg.chatbot;


import org.junit.Assert;
import org.junit.Test;


public class ConfigReaderTest {

	@Test
	public void test1() {
		String expected="4x4";
		ConfigReader configReader=new ConfigReader(new ConfigReaderImpl(true,"4x4"));
		String actual = configReader.getParameterValue("displayFormat");
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		String expected="2x4";
		ConfigReader configReader=new ConfigReader(new ConfigReaderImpl(false,null));
		String actual = configReader.getParameterValue("displayFormat");
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test3() {
		String expected="2x4";
		ConfigReader configReader=new ConfigReader(new ConfigReaderImpl(false,"Whatever"));
		String actual = configReader.getParameterValue("displayFormat");
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test4() {
		String expected="medium";
		ConfigReader configReader=new ConfigReader(new ConfigReaderImpl(false,null));
		String actual = configReader.getParameterValue("brightness");
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test5() {
		String expected="medium";
		ConfigReader configReader=new ConfigReader(new ConfigReaderImpl(true,"medium"));
		String actual = configReader.getParameterValue("brightness");
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test6() {
		String expected="medium";
		ConfigReader configReader=new ConfigReader(new ConfigReaderImpl(true,null));
		String actual = configReader.getParameterValue("brightness");
		Assert.assertEquals(expected, actual);
	}
}
