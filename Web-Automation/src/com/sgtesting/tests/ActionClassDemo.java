package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		closeOption();
		mouseActions();
	}
	
	private static void launchBrowser()
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
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://www.flipkart.com/");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeOption()
	{
		try
		{
			oBrowser.findElement(By.xpath("//button[text()='✕']")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void mouseActions()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Electronics']")).click();
			Thread.sleep(3000);
			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='Electronics']"));
			Actions oMouse=new Actions(oBrowser);
			oMouse.moveToElement(oEle).build().perform();
			Thread.sleep(3000);
			oBrowser.findElement(By.linkText("Power Banks")).click();
			Thread.sleep(3000);
			WebElement filter=oBrowser.findElement(By.xpath("//span[text()='Filters']"));
			oMouse.contextClick(filter).build().perform();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
