package com.mycompany.sdet.UIPages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalcAppObjects {

	WebDriver driver;

	public CalcAppObjects(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id="Btn6")
	public WebElement firstValue;
	
	@FindBy(id="Btn3")
	public WebElement secondValue;
	
	@FindBy(id="Btn2")
	public WebElement thirdValue;
	
	@FindBy(id="Btn0")
	public WebElement fourthValue;
	
	@FindBy(id="BtnPlus")
	public WebElement addOperator;
	
	@FindBy(id="BtnMinus")
	public WebElement substractOperator;
	
	@FindBy(id="BtnMult")
	public WebElement multiplicationOperator;
	
	@FindBy(id="BtnDiv")
	public WebElement divisionOperator;
	
	@FindBy(id="BtnDot")
	public WebElement decimal;
	
	@FindBy(id="BtnClear")
	public WebElement clearButton;
	
	@FindBy(id="BtnCalc")
	public WebElement equalsButton;
	
	@FindBy(xpath="//p[@class='r']")
	public WebElement result;
	
	@FindBy(xpath="//div[@id='hist']//button[@class='btn dropdown-toggle pull-right']")
	public WebElement history_btn;
	
	@FindBy(xpath="//a[@id='clearhistory']")
	public WebElement clear_history;
	
	@FindBy(id="BtnParanL")
	public WebElement left_paranthesis;
	
	@FindBy(id="BtnParanR")
	public WebElement right_paranthesis;
	
	@FindBy(id="BtnPow2")
	public WebElement square_btn;
	
	
	
}
