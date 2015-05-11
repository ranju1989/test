package com.mycompany.sdet.Util;

import org.codehaus.jackson.map.ObjectMapper;

import com.mycompany.sdet.CommonOps.CommonOperations;
import com.mycompany.sdet.CommonOps.Navigate;
import com.mycompany.sdet.CommonOps.OnFailure;
import com.mycompany.sdet.CommonOps.WebDriverOperations;

public class Setup {

	public static ObjectMapper objectMapper = new ObjectMapper();
	public static JSONUtil jsonUtil = new JSONUtil();
	public static BrowserUtil browserUtil = new BrowserUtil();
	public static DBUtil dbUtil = new DBUtil();
	public static EmailUtil emailUtil = new EmailUtil();
	public static ExcelUtil excelUtil = new ExcelUtil();
	public static FileUtil fileUtil = new FileUtil();
	public static RetryAnalyzer retryAnalyzer = new RetryAnalyzer();
	public static TestListener testListener = new TestListener();
	public static WaitUtil waitUtil = new WaitUtil();
	public static WebDriverOperations webDriverOps = new WebDriverOperations();
	public static Navigate navigate=new Navigate();
	public static CommonOperations commonops = new CommonOperations();
	public static OnFailure onFailure = new OnFailure();
	public static SendEmail sendEmail = new SendEmail();
	public static DBQuery dbquery=new DBQuery();
	public static APIConfiguration apiConfiguration = new APIConfiguration();
}
