package com.sgtesting.propertiesdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
	//	writeContent();
		readContent();
	}
	
	private static void writeContent()
	{
		FileOutputStream fout=null;
		Properties prop=null;
		try
		{
			fout=new FileOutputStream("E:\\EXAMPLE\\Test.properties");
			prop=new Properties();
			prop.setProperty("user", "admin");
			prop.setProperty("password", "manager");
			prop.setProperty("pin", "1995");
			prop.store(fout, "It is for Testing purpose");
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try
			{
				fout.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	private static void readContent()
	{
		FileInputStream fin=null;
		Properties prop=null;
		try
		{
			fin=new FileInputStream("E:\\EXAMPLE\\Test.properties");
			prop=new Properties();
			prop.load(fin);
			
			String val1=prop.getProperty("user");
			System.out.println(val1);
			String val2=prop.getProperty("password");
			System.out.println(val2);
			String val3=prop.getProperty("pin");
			System.out.println(val3);
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try
			{
				fin.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
