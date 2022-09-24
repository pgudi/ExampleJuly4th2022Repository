package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		displayTitle();
		displayURL();
		displayLinksCount();
	//	enterValueInTextField1();
	//	enterValueInTextField2();
	//	clickOnButtonField1();
	//	clickOnButtonField2();
	//	clickOnCheckBoxField1();
	//	clickOnCheckBoxField2();
	//	clickOnRadioButtonField1();
	//	clickOnRadioButtonField2();
		selectItemFromDropDown();
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
			oBrowser.get("file:///E:/HTML/Sample.html");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void displayTitle()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			String title=(String) js.executeScript("var kk=document.title;return kk");
			System.out.println("Title :"+title);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void displayURL()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			String url=(String) js.executeScript("var kk=document.URL;return kk");
			System.out.println("URL :"+url);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void displayLinksCount()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			long linkscount=(long) js.executeScript("var links=document.getElementsByTagName('A');return links.length;");
			System.out.println("Links Count :"+linkscount);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void enterValueInTextField1()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			js.executeScript("document.getElementById('uid1user1name1').value='DemoUser1';");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void enterValueInTextField2()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			WebElement oEle=oBrowser.findElement(By.xpath("//input[@class='pass1word1']"));
			js.executeScript("arguments[0].value='DemoPassword1';",oEle);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void clickOnButtonField1()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			js.executeScript("document.getElementById('btn1submit1button1').click();");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void clickOnButtonField2()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			WebElement oEle=oBrowser.findElement(By.className("submit1btn1"));
			js.executeScript("arguments[0].click();",oEle);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void clickOnCheckBoxField1()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			js.executeScript("document.getElementById('chk1windows').click();");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void clickOnCheckBoxField2()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			WebElement oEle=oBrowser.findElement(By.name("linus"));
			js.executeScript("arguments[0].click();",oEle);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void clickOnRadioButtonField1()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			js.executeScript("document.getElementById('rad1chrome').click();");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void clickOnRadioButtonField2()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) oBrowser;
			WebElement oEle=oBrowser.findElement(By.name("firefox"));
			js.executeScript("arguments[0].click();",oEle);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void selectItemFromDropDown()
	{
		JavascriptExecutor js=null;
		js=(JavascriptExecutor) oBrowser;
		
		String str="";
		str+="var list=document.getElementById('tools');";
		str+="for(var i=0;i<list.length;i++)";
		str+="{";
		str+="if(list[i].text='Selenium RemoteControl')";
		str+="{";
		str+="list[i].selected='1'";
		str+="}";
		str+="}";
		js.executeScript(str);
	}
}
