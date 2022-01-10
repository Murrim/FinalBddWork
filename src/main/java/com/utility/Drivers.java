package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers {
	public static void main(String[] args) {
		openBrowser("chrome");
	}
	public static  WebDriver openBrowser(String browser) {
		  WebDriver dr=null;
		if(System.getProperty("os.name").toLowerCase().contains("windows")) {          
			
		if(browser.toUpperCase().equals("CHROME")) {  //TOuppercase then CHROME should be upper then users can pass any case
			System.setProperty("webdriver.chrome.driver","C:\\Users\\arjuf\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			dr=new ChromeDriver();
			
			
		}else if(browser.toLowerCase().equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\arjuf\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			dr=new FirefoxDriver();
		
			
		}else if(browser.equals("microsoftedge")) {
			System.setProperty("webdriver.edge.driver","C:\\Users\\arjuf\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			dr= new EdgeDriver();
			//dr.get("https://www.facebook.com");
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		}else {
			System.out.println("===========The test is running on "+System.getProperty("os.name")+"==========");	                                                                                  //there is a method from system class getproperty
			                                                                                    
			if(browser.toLowerCase().equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/mac/chromedriver");  //for mac users
			    dr=new ChromeDriver();
			
			
		}else {
			
			
			System.out.println("============why you bothering me Mr mac users=======ha ha");
			
		}
			
			
			
		}
		}return dr;
	}
}
