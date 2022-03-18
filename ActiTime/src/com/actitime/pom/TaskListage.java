package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListage {
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewBtn;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newcustomerOption;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement entercustnametbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custDesctbx;
	
	@FindBy(xpath="(//div[.='- Select Customer -'])[1]")
	private WebElement selcustDD;
	
	@FindBy(xpath="//div[.='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourcmpnyOption;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createcustbtn;
	
	@FindBy(xpath="//div[@class=\"titleEditButtonContainer\"]/div[1]")
	private WebElement createcustname;
	
public TaskListage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
public WebElement getAddnewBtn() {
	return addnewBtn;
}
public WebElement getNewcustomerOption() {
	return newcustomerOption;
}
public WebElement getEntercustnametbx() {
	return entercustnametbx;
}
public WebElement getCustDesctbx() {
	return custDesctbx;
}
public WebElement getSelcustDD() {
	return selcustDD;
}
public WebElement getOurcmpnyOption() {
	return ourcmpnyOption;
}
public WebElement getCreatecustbtn() {
	return createcustbtn;
}
public WebElement getActualcustname() {
	return createcustname;
}
}
