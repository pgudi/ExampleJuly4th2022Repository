package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class FirefoxBrowserOptionsDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();

	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver", ".\\Library\\drivers\\geckodriver.exe");
		/*	ProfilesIni profiles=new ProfilesIni();
			FirefoxProfile ffprofile=profiles.getProfile("sgtesting");
		*/
			
			FirefoxProfile ffprofile=new FirefoxProfile();
			ffprofile.setPreference("browser.startup.homepage", "http://sgtestinginstitute.com/");
			FirefoxOptions options=new FirefoxOptions();
			options.setProfile(ffprofile);
			oBrowser=new FirefoxDriver(options);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
