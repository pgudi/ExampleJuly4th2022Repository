package com.sgtesting.actitime.stepdefinitions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
public class ForLoopDemo {
	public static Logger log=LogManager.getLogger(ForLoopDemo.class);
	@Test(priority=1)
	public void showNumbers()
	{
		log.info("For Loop has started here !!!");
		for(int i=20;i<=40;i++)
		{
			log.info("The Generated Number is :"+i);
		}
		log.info("For Loop has ended here !!!");
	}

}
