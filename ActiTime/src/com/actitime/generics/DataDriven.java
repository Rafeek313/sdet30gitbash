package com.actitime.generics;

import java.io.FileInputStream;
import java.io.IOException;

public class DataDriven {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pwd = f.getPropertyData("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
		
	}

}
