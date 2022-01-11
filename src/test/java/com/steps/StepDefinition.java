package com.steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.utility.Drivers;

import io.cucumber.java.en.*;

public class StepDefinition {
	WebDriver dr;
	
	@Given("open chrome browser")
	public void open_chrome_browser() {
		dr=Drivers.openBrowser("chrome");
	
	  
	}
	@When("we navigate the osa home page")
	public void we_navigate_the_osa_home_page() {
	dr.get("https://www.osaconsultingtech.com");  
	}
    String actualTitle;
    String expectedTitle="OSA Consulting Tech Corp || Best Available Resources For Software Industry";
	@Then("we have to verify the title")
	public void we_have_to_verify_the_title() {
	actualTitle=dr.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	System.out.println(actualTitle);
	}

	@And("we have to close the Browser")
	public void we_have_to_close_the_Browser() {
	 dr.close();  ;
	}
}
