package com.sgtesting.tests;

public class ExecuteAutoITScript {

	public static void main(String[] args) {
		executeScript();
	}
	
	private static void executeScript()
	{
		try
		{
	//		Runtime.getRuntime().exec("H:\\Automation\\AutoIT\\SampleTestScript1.exe");
			Runtime obj=Runtime.getRuntime();
			obj.exec("H:\\Automation\\AutoIT\\SaveContentInTheFile.exe");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
