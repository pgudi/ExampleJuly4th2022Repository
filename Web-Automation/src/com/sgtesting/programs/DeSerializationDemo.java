package com.sgtesting.programs;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String[] args) 
	{
		FileInputStream fin=null;
		ObjectInputStream in=null;
		try
		{
			fin=new FileInputStream("H:\\EXAMPLE\\Employee.ser");
			in=new ObjectInputStream(fin);
			
			Employee obj=(Employee) in.readObject();
			obj.setFirstName("Santosh");
			obj.setCityName("Bangalore");
			obj.setAddress("7th Main RPC Layout");
			obj.setPincode(560040);
			
			System.out.println(obj.getFirstName());
			System.out.println(obj.getCityName());
			System.out.println(obj.getAddress());
			System.out.println(obj.getPincode());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
