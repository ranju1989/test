package com.mycompany.sdet.Suite.Calculator;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mycompany.sdet.CommonOps.calcCommonMethods;
import com.mycompany.sdet.TestBase.BaseTest;
import com.mycompany.sdet.UIPages.CalcAppObjects;
import com.mycompany.sdet.Util.WaitUtil;

public class CalcApplication extends BaseTest {

	CalcAppObjects calcAppObjects;
	calcCommonMethods calcMethods;
	String resultValue;

	@BeforeClass(alwaysRun = true)
	public void beforeClass() throws NumberFormatException, Exception {
		calcAppObjects = PageFactory.initElements(driver, CalcAppObjects.class);
		calcMethods = PageFactory.initElements(driver, calcCommonMethods.class);
	}

	@Test(priority = 1)
	public void sumOperation() throws Exception {

		driver.get(config.getConfig("CalcAppUrl"));// get is used for opening
													// and url

		driver.manage().window().maximize();

		calcMethods.clearMethod();
		calcMethods.clearHistory();

		WaitUtil.sleep(500);

		calcMethods.sumPositive();

		WaitUtil.sleep(500);

		resultValue = calcAppObjects.result.getAttribute("title");

		System.out.println("Result Value is:" + resultValue);

		if (resultValue.equals(config.getConfig("positiveSum")))

			Reporter.log("Sum Operation is correct");
		else

			Assert.fail("Calculator Sum Operation is not working");

	}

	@Test(priority = 2)
	public void substractOperation() throws Exception {

		calcMethods.clearMethod();

		calcMethods.clearHistory();

		WaitUtil.sleep(500);

		calcMethods.substract();

		WaitUtil.sleep(500);

		resultValue = calcAppObjects.result.getAttribute("title");

		System.out.println("Result Value is:" + resultValue);

		if (resultValue.equals(config.getConfig("substractValue")))

			Reporter.log("Substract Operation is correct");
		else

			Assert.fail("Calculator Substract Operation is not working");

	}

	@Test(priority = 3)
	public void multiplyOperation() throws Exception {

		calcMethods.clearMethod();

		calcMethods.clearHistory();

		WaitUtil.sleep(500);

		calcMethods.multiply();

		WaitUtil.sleep(500);

		resultValue = calcAppObjects.result.getAttribute("title");

		System.out.println("Result Value is:" + resultValue);

		if (resultValue.equals(config.getConfig("multiplyValue")))

			Reporter.log("Multiply Operation is correct");
		else

			Assert.fail("Calculator Multiply Operation is not working");

	}

	@Test(priority = 4)
	public void divisionOperation() throws Exception {

		calcMethods.clearMethod();

		calcMethods.clearHistory();

		WaitUtil.sleep(500);

		calcMethods.division();

		WaitUtil.sleep(500);

		resultValue = calcAppObjects.result.getAttribute("title");

		System.out.println("Result Value is:" + resultValue);

		if (resultValue.equals(config.getConfig("divisionValue")))

			Reporter.log("Division Operation is correct");
		else

			Assert.fail("Calculator Division Operation is not working");

	}
	
	@Test(priority = 5)
	public void floatOperation() throws Exception {

		calcMethods.clearMethod();

		calcMethods.clearHistory();

		WaitUtil.sleep(500);

		calcMethods.sumFloat();

		WaitUtil.sleep(500);

		resultValue = calcAppObjects.result.getAttribute("title");

		System.out.println("Result Value is:" + resultValue);

		if (resultValue.equals(config.getConfig("floatSum")))

			Reporter.log("Float Operation is correct");
		else

			Assert.fail("Calculator Float Operation is not working");

	}
	
	@Test(priority = 6)
	public void negativeOperation() throws Exception {

		calcMethods.clearMethod();

		calcMethods.clearHistory();

		WaitUtil.sleep(500);

		calcMethods.sumNegative();

		WaitUtil.sleep(500);

		resultValue = calcAppObjects.result.getAttribute("title");

		System.out.println("Result Value is:" + resultValue);

		if (resultValue.equals(config.getConfig("negativeSum")))

			Reporter.log("Negative Operation is correct");
		else

			Assert.fail("Calculator Negative Operation is not working");

	}
	
	@Test(priority=7)
	public void divideByZeroOperation() throws Exception {
		
		calcMethods.clearMethod();

		calcMethods.clearHistory();

		WaitUtil.sleep(500);

		calcMethods.divideByZero();

		WaitUtil.sleep(500);

		resultValue = calcAppObjects.result.getAttribute("title");

		System.out.println("Result Value is:" + resultValue);

		if (resultValue.equals(config.getConfig("byZeroValue")))

			Reporter.log("Divide By Zero Operation is correct");
		else

			Assert.fail("Calculator Divide By Zero Operation is not working");
	}
	
	@Test(priority=8)
	public void ZeroByNumberOperation() throws Exception {
		
		calcMethods.clearMethod();

		calcMethods.clearHistory();

		WaitUtil.sleep(500);

		calcMethods.zeroByNumber();

		WaitUtil.sleep(500);

		resultValue = calcAppObjects.result.getAttribute("title");

		System.out.println("Result Value is:" + resultValue);

		if (resultValue.equals(config.getConfig("byNumberValue")))

			Reporter.log("Zero Divide By Number Operation is correct");
		else

			Assert.fail("Calculator Zero Divide By Number Operation is not working");
	}
	
	@Test(priority=9)
	public void substractNegativeOperation() throws Exception {
		
		calcMethods.clearMethod();

		calcMethods.clearHistory();

		WaitUtil.sleep(500);

		calcMethods.substractNegative();

		WaitUtil.sleep(500);

		resultValue = calcAppObjects.result.getAttribute("title");

		System.out.println("Result Value is:" + resultValue);

		if (resultValue.equals(config.getConfig("substractNegativeValue")))

			Reporter.log("Negative Value Substraction Operation is correct");
		else

			Assert.fail("Calculator Negative Value Substraction Operation is not working");
	}
	
	@Test(priority=10)
	public void bodmasOperation() throws Exception {
		
		calcMethods.clearMethod();

		calcMethods.clearHistory();

		WaitUtil.sleep(500);

		calcMethods.bodmasProblem();

		WaitUtil.sleep(500);

		resultValue = calcAppObjects.result.getAttribute("title");

		System.out.println("Result Value is:" + resultValue);

		if (resultValue.equals(config.getConfig("bodmasValue")))

			Reporter.log("BODMAS Operation is correct");
		else

			Assert.fail("Calculator BODMAS Operation is not working");
	}
	
	@Test(priority=11)
	public void squareOperation() throws Exception {
		
		calcMethods.clearMethod();

		calcMethods.clearHistory();

		WaitUtil.sleep(500);

		calcMethods.square();

		WaitUtil.sleep(500);

		resultValue = calcAppObjects.result.getAttribute("title");

		System.out.println("Result Value is:" + resultValue);

		if (resultValue.equals(config.getConfig("squareValue")))

			Reporter.log("Square Operation is correct");
		else

			Assert.fail("Calculator Square Operation is not working");
	}
	
	

}
