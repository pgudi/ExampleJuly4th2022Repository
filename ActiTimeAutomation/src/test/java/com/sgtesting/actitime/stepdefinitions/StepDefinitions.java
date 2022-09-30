package com.sgtesting.actitime.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class StepDefinitions {
	public static WebDriver oBrowser=null;
	/*
	 * Created By:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 */
	@Given("^I launch chrome Browser$")
	public void I_launch_chrome_Browser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
