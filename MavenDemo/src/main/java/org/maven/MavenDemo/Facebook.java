package org.maven.MavenDemo;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebook {
	WebDriver driver;
	@Given("^User launch the facebook application$")
	public void user_launch_the_facebook_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhamu\\eclipse-workspace\\Balaji\\MavenDemo\\drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}


@When("^User enter the username$")
public void user_enter_the_username(DataTable username) {
  List<Map<String, String>> us = username.asMaps(String.class, String.class);
  driver.findElement(By.id("email")).sendKeys(us.get(2).get("password"));
}

@When("^User enter the password$")
public void user_enter_the_password(DataTable password) {
   List<Map<String, String>> ps = password.asMaps(String.class, String.class);
   driver.findElement(By.id("pass")).sendKeys(ps.get(2).get("password"));
}




	@When("^User click the loginbutton$")
	public void user_click_the_loginbutton() {
		driver.findElement(By.id("loginbutton")).click();
	    	}

	@Then("^User navigate to the current Url$")
	public void user_navigate_to_the_current_Url() {
	    String s = driver.getCurrentUrl();
	    
	    if(s.contains("attempt")) {
	    	System.out.println("true");
	    }
	    else {
	    	System.out.println("false");
	    }
	}

	@Then("^User close the browser$")
	public void user_close_the_browser() {
	    driver.quit();
	}


}
