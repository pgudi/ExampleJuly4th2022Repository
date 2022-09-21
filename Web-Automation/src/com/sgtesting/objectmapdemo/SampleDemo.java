package com.sgtesting.objectmapdemo;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class SampleDemo {

	public static void main(String[] args) {
		
		Properties prop=System.getProperties();
		Set set=prop.entrySet();
		Iterator ite=set.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
		
		

	}

}
