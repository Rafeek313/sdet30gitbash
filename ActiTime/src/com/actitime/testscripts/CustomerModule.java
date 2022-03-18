package com.actitime.testscripts;


import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListage;
@Listeners(com.actitime.generics.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("createcustomer",true);
		String expectedcustomer = f.getExcelData("CreateCustomer",1,2);
		String cust_desc = f.getExcelData("CreateCustomer",1,6);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		//click on tasktab
		e.getTasktab().click();
		TaskListage t=new TaskListage(driver);
		//click on add new button
		t.getAddnewBtn().click();
		t.getNewcustomerOption().click();
		t.getEntercustnametbx().sendKeys(expectedcustomer);
		t.getCustDesctbx().sendKeys(cust_desc);
		t.getSelcustDD().click();
		t.getOurcmpnyOption().click();
		t.getCreatecustbtn().click();
		Thread.sleep(2000);
		String Actualcustomer = t.getActualcustname().getText();
		Assert.assertEquals(Actualcustomer, expectedcustomer);
		Reporter.log("customer successfully created",true);
	
	}
	
	}


