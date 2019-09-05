package com.trg.chatbot;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {
	String expected="";
	User user = new User();
    String actual;

	@Test
	public void positiveTestForDecidingOnLowAcuity() {
		expected="low";
		actual=user.decideAcuity("Mumbai",120);
		Assert.assertEquals(expected, actual);
		actual=user.decideAcuity("mumbai",120);
		Assert.assertEquals(expected, actual);
		actual=user.decideAcuity("Bombay",120);
		Assert.assertEquals(expected, actual);
		actual=user.decideAcuity("Bombay",200);
		Assert.assertEquals(expected, actual);
		actual=user.decideAcuity("Calicut",120);
		Assert.assertEquals(expected, actual);
		actual=user.decideAcuity("Goa",220);
		Assert.assertEquals(expected, actual);
		actual=user.decideAcuity("",120);
		Assert.assertEquals(expected, actual);
		actual=user.decideAcuity("",300);
		Assert.assertEquals(expected, actual);
		actual=user.decideAcuity(null,120);
		Assert.assertEquals(expected, actual);
		actual=user.decideAcuity("Bombay",0);
		Assert.assertEquals(expected, actual);
		actual=user.decideAcuity("Bombay",-3);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void positiveTestForDecidingHighAcuity() {
		expected="high";
		actual=user.decideAcuity("Mumbai",201);
		Assert.assertEquals(expected, actual);
		actual=user.decideAcuity("Mumbai",220);
		Assert.assertEquals(expected, actual);
		actual=user.decideAcuity("mumbai",220);
		Assert.assertEquals(expected, actual);
		actual=user.decideAcuity("Pune",320);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testForGetDetails() {
		expected="high";
		actual=user.decideAcuity("Mumbai",201);
		Assert.assertEquals(expected, actual);
		actual=user.decideAcuity("Mumbai",220);
		Assert.assertEquals(expected, actual);
		actual=user.decideAcuity("mumbai",220);
		Assert.assertEquals(expected, actual);
		actual=user.decideAcuity("Pune",320);
		Assert.assertEquals(expected, actual);
	}
   
}
