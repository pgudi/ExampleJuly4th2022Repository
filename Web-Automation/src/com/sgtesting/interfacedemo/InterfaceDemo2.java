package com.sgtesting.interfacedemo;
interface College1
{
	static void displayBranches(String branches[])
	{
		System.out.println("Branch Names !!!");
		for(int i=0;i<branches.length;i++)
		{
			System.out.println(branches[i]);
		}
	}
	void displayCollegeName(String name);
}

class SLNEngg1 implements College1
{
	public void displayCollegeName(String name)
	{
		System.out.println("Engineering College Name :"+name);
	}
}

public class InterfaceDemo2 {

	public static void main(String[] args) {
		SLNEngg1 obj=new SLNEngg1();
		obj.displayCollegeName("SLN Engineering College");
		String branches[]= {"CSE","EEE","Mech","Civil"};
		College1.displayBranches(branches);
	}

}
