package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpBrowsersDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		handlePopupBrowsers();
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
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void handlePopupBrowsers()
	{
		try
		{
			WebElement oLink=oBrowser.findElement(By.linkText("actiTIME Inc."));
			System.out.println("Before Click on Link, # of Popups :"+popupCount());
			oLink.click();
			Thread.sleep(2000);
			System.out.println("After Click on Link, # of Popups :"+popupCount());
			Thread.sleep(2000);
			if(popupCount()>0)
			{
				popupBrowsers();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static int popupCount()
	{
		int count=0;
		count=oBrowser.getWindowHandles().size()-1;
		return count;
	}
	
	private static void popupBrowsers()
	{
		try
		{
			String parentBrowser=oBrowser.getWindowHandle();
			System.out.println("Parent Browser :"+parentBrowser);
			Object[] childbrowsers=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<childbrowsers.length;i++)
			{
				String childbrowser=childbrowsers[i].toString();
				System.out.println("Child Browser :"+childbrowser);
				
				oBrowser.switchTo().window(childbrowser);
				Thread.sleep(2000);
				String title=oBrowser.getTitle();
				System.out.println("Title of Child Browser :"+title);
				Thread.sleep(2000);
				oBrowser.findElement(By.linkText("Try Free")).click();
				Thread.sleep(2000);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
