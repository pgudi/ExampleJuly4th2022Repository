package com.sgtesting.actitime.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void connectDB()
	{
		System.out.println("Connect to Oracle Database successfully!!!!");
	}
	
	@After
	public void disConnectDB()
	{
		System.out.println("DisConnect to Oracle Database successfully!!!!");
	}

}
