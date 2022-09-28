package com.sgtesting.programs;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		try
		{
			fout=new FileOutputStream("H:\\EXAMPLE\\Employee.ser");
			out= new ObjectOutputStream(fout);
			Employee obj=new Employee();
			out.writeObject(obj);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				out.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		

	}

}
