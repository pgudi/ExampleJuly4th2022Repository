package com.sgtesting.actitime.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

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
	
	/*
	 * Created By:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 */
	@And("^I navigate url of the Application$")
	public void I_navigate_url_of_the_Application()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * Created By:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 */
	@When("^I enter valid username in username field$")
	public void I_enter_valid_username_in_username_field()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * Created By:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 */
	@And("^I enter valid password in password field$")
	public void I_enter_valid_password_in_password_field()
	{
		try
		{
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/*
	 * Created By:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 */
	@And("^I click on login button$")
	public void I_click_on_login_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * Created By:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 */
	@Then("^I find the home page$")
	public void I_find_the_home_page()
	{
		try
		{
			String expected="Enter Time-Track";
			String actual=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * Created By:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 */
	@And("^I minimize flyout window$")
	public void I_minimize_flyout_window()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
		
	/*
	 * Created By:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 */
	@When("^I click on Logout link$")
	public void I_click_on_Logout_link()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * Created By:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 */
	@Then("^I find the login page$")
	public void I_find_the_login_page()
	{
		try
		{
			String expected="actiTIME - Login";
			String actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * Created By:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 */
	@And("^I close the application$")
	public void I_close_the_application()
	{
		try
		{
			oBrowser.quit();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * Created By:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 */
	@Given("^I launch Oracle Database$")
	public void I_launch_Oracle_Database()
	{
		try
		{
			System.out.println("I launch Oracle Database !!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * Created By:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 */
	@Given("^I connect to Oracle Database$")
	public void I_connect_to_Oracle_Database()
	{
		try
		{
			System.out.println("I connect to Oracle Database !!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
