package com.sgtesting.tests;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImportTasksDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		importTasks();
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
	
	private static void login()
	{
		try
		{		
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyOutWindow()
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
	
	private static void importTasks()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add New Task']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Import tasks from CSV']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("dropzoneClickableArea")).click();
			Thread.sleep(2000);
			String filename="E:\\EXAMPLE\\Sample.csv";
			copyFilePath(filename);
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void copyFilePath(String filename)
	{
		StringSelection stringselection=new StringSelection(filename);
	//	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		Clipboard clipboard=toolkit.getSystemClipboard();
		clipboard.setContents(stringselection, null);
	}
}
