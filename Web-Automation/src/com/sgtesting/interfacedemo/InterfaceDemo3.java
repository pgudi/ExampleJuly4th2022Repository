package com.sgtesting.interfacedemo;
interface Demo1
{
	default void display()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}

interface Demo2
{
	default void display()
	{
		for(int i=10;i<=20;i++)
		{
			System.out.println(i);
		}
	}
}

class Sample implements Demo1,Demo2
{
	public void display()
	{
		for(int i=40;i<=60;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
public class InterfaceDemo3 {
	public static void main(String[] args) {
		Sample obj=new Sample();
		obj.display();

	}

}
