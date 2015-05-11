package com.mycompany.sdet.CommonOps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mycompany.sdet.UIPages.CalcAppObjects;
import com.mycompany.sdet.Util.WaitUtil;

public class calcCommonMethods {

	WebDriver driver;
	CalcAppObjects calcAppObjects;

	public calcCommonMethods(WebDriver driver) {
		this.driver = driver;
		calcAppObjects = PageFactory.initElements(driver, CalcAppObjects.class);

	}

	public void clearMethod() {

		calcAppObjects.clearButton.click();
	}

	public void clearHistory() {

		calcAppObjects.history_btn.click();

		WaitUtil.sleep(1500);

		calcAppObjects.clear_history.click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		calcAppObjects.history_btn.click();
	}

	public void sumPositive() {

		calcAppObjects.firstValue.click();

		calcAppObjects.addOperator.click();

		calcAppObjects.secondValue.click();

		calcAppObjects.equalsButton.click();
	}
	
	public void sumFloat() {
		
		calcAppObjects.firstValue.click();
		calcAppObjects.decimal.click();
		calcAppObjects.thirdValue.click();
		
		calcAppObjects.addOperator.click();
		
		calcAppObjects.secondValue.click();
		calcAppObjects.decimal.click();
		calcAppObjects.thirdValue.click();
		calcAppObjects.equalsButton.click();	
		
	}
	
	public void sumNegative() {
		
		calcAppObjects.substractOperator.click();
		calcAppObjects.firstValue.click();
		calcAppObjects.addOperator.click();
		calcAppObjects.substractOperator.click();
		calcAppObjects.secondValue.click();
		calcAppObjects.equalsButton.click();
	}
	
	public void substract(){
		
		calcAppObjects.firstValue.click();

		calcAppObjects.substractOperator.click();

		calcAppObjects.secondValue.click();

		calcAppObjects.equalsButton.click();
	}
	
	public void substractNegative(){
		
		calcAppObjects.substractOperator.click();
		calcAppObjects.firstValue.click();
		calcAppObjects.substractOperator.click();
		calcAppObjects.substractOperator.click();
		calcAppObjects.secondValue.click();
		calcAppObjects.equalsButton.click();
	}
	
	public void multiply(){
		
		calcAppObjects.firstValue.click();

		calcAppObjects.multiplicationOperator.click();

		calcAppObjects.secondValue.click();

		calcAppObjects.equalsButton.click();
		
	}
	
	public void division(){
		
		calcAppObjects.firstValue.click();

		calcAppObjects.divisionOperator.click();

		calcAppObjects.secondValue.click();

		calcAppObjects.equalsButton.click();
		
	}
	
	public void divideByZero(){
		
		calcAppObjects.firstValue.click();
		calcAppObjects.divisionOperator.click();
		calcAppObjects.fourthValue.click();
		calcAppObjects.equalsButton.click();
	}
	
	public void zeroByNumber(){
		
		calcAppObjects.fourthValue.click();
		calcAppObjects.divisionOperator.click();
		calcAppObjects.firstValue.click();
		calcAppObjects.equalsButton.click();
	}
	
	public void bodmasProblem(){
		
		calcAppObjects.firstValue.click();
		calcAppObjects.multiplicationOperator.click();
		calcAppObjects.left_paranthesis.click();
	    calcAppObjects.secondValue.click();
	    calcAppObjects.addOperator.click();
	    calcAppObjects.thirdValue.click();
	    calcAppObjects.right_paranthesis.click();
	    calcAppObjects.equalsButton.click();
		
	}
	
	public void square(){
		
		calcAppObjects.firstValue.click();
		calcAppObjects.square_btn.click();
		calcAppObjects.equalsButton.click();
	}
}
