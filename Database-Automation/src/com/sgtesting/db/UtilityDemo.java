package com.sgtesting.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class UtilityDemo {

	public static void main(String[] args) {
		int rowcount=rowCount("select * from dept2");
		System.out.println("# of Records :"+rowcount);

		int coulmncount=columnCount("select * from product");
		System.out.println("# of Column :"+coulmncount);
		
		String data=getColumnData("select dname from dept2");
		System.out.println("Data :"+data);
	}
	
	public static int rowCount(String query)
	{
		int rc=0;
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "tiger");
			
			PreparedStatement stmt=conn.prepareStatement(query);
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
				rc=rc+1;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try
			{
				conn.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return rc;
	}

	public static int columnCount(String query)
	{
		int columnCount=0;
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "tiger");
			
			PreparedStatement stmt=conn.prepareStatement(query);
			ResultSet rs=stmt.executeQuery();
			ResultSetMetaData rsmeta= rs.getMetaData();
			columnCount=rsmeta.getColumnCount();
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try
			{
				conn.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return columnCount;
	}
	
	public static String getColumnData(String query)
	{
		String data=null;
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "tiger");
			
			PreparedStatement stmt=conn.prepareStatement(query);
			ResultSet rs=stmt.executeQuery();
			if(columnCount(query)>1)
			{
				return null;
			}
			if(rowCount(query)>1)
			{
				return null;
			}
			while(rs.next())
			{
				data=rs.getString("DNAME");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try
			{
				conn.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return data;
	}
}
