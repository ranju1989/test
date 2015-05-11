package com.mycompany.sdet.Util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.testng.Reporter;

public class DBQuery {
	
	public static String getOrderIDStatus(String orderNumber) throws Exception
	{
		String query	=	"select count(*) from oms.sale_order where code='"+orderNumber+"'";
		Reporter.log("<br>Query executed : "+query);
		String result	=	executeQueryString(query);
		Reporter.log("<br>Query result : "+result);
		return result;
	}
	
	
	private static String executeQueryString(String query) throws SQLException
	{
		ResultSet resultSet = null;
        String result;
		try {
			Statement statement = DBUtil.connection.createStatement();
			resultSet = statement.executeQuery(query);
		} catch (SQLException e) {
                  e.printStackTrace();
		}
		resultSet.next();
		result	=	resultSet.getString(1);
		return result;
	}
	
	
	private static String executeQueryEmptySet(String query) throws SQLException
	{
		ResultSet resultSet = null;
        String result;
		try {
			
			Statement statement = DBUtil.connection.createStatement();
			resultSet = statement.executeQuery(query);

		} catch (SQLException e) {
                  e.printStackTrace();
		}
		
		
		if (!resultSet.isBeforeFirst() ) {    
			 result="empty";
			} 
		
		else
		{
			resultSet.next();
			result	=	resultSet.getString(1);
		}
		return result;
	}
	
	
	
	private static List<String> executeQueryList(String query) throws Exception {
		List<String> list	=	new ArrayList<String>();
		ResultSet resultSet = null;
		try {
			Statement statement = DBUtil.connection.createStatement();
			resultSet = statement
					.executeQuery(query);

		} catch (SQLException e) {

		}
		while(resultSet.next())
		{
			if(resultSet.getString(1)==null)
	          list.add(resultSet.getString(1));
			else
			list.add(resultSet.getString(1).trim());	
		}
		return list;	
	}
	
	
	
	private static String executeQueryDate(String query) throws SQLException
	{
		ResultSet resultSet = null;
        String result;
		try {
			Statement statement = DBUtil.connection.createStatement();
			resultSet = statement.executeQuery(query);

		} catch (SQLException e) {
                  e.printStackTrace();
		}
		
		resultSet.next();
		if(resultSet.getString(1)==null)

			result	=	"1990-01-13 09:40:00";
		else
		result	=	resultSet.getString(1);
		return result;	
	}

	public static String getClientId() throws SQLException
	{
		
		String query	=	"SELECT VALUE FROM snapdeal_property WHERE  NAME='googleplus.mobile.clientId'";
		
		Reporter.log("<br>Executing Query : "+query);
		String result	=	executeQueryString(query);
		
		Reporter.log("<br>Returning result : " + result);
		return result;
		
	}
	

}
