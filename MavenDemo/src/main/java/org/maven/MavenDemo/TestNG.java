package org.maven.MavenDemo;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class TestNG {
	WebDriver driver;
	@Parameters({"browser","un","pw"})
	@Test
public void test1(String bro,String un,String pw) {
		if(bro.equals("cb")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhamu\\eclipse-workspace\\Balaji\\MavenDemo\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dhamu\\eclipse-workspace\\Balaji\\MavenDemo\\drivers\\geckodriver.exe");
			driver=new ChromeDriver();

		}
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("balaji");
	driver.findElement(By.id("pass")).sendKeys("bala");
	driver.findElement(By.id("loginbutton")).click();
	driver.quit();
}
	
}
  
//By using Tests

/*<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite" parallel="tests" thread-count="3">
  <test name="c">
    <classes>
      <class name="org.maven.MavenDemo.TestNG"/>
    </classes>
  </test> <!-- Test -->
  <test name="cb">
    <classes>
      <class name="org.maven.MavenDemo.TestNG"/>
    </classes>
  </test> <!-- Test -->
  <test name="cbr">
    <classes>
      <class name="org.maven.MavenDemo.TestNG"/>
    </classes>
  </test> <!-- Test -->
  </suite> <!-- Suite -->
*/


//Multiple Methods

/*@Test
public void test1() {
System.out.println("Launch");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhamu\\eclipse-workspace\\Balaji\\MavenDemo\\drivers\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("balaji");
driver.findElement(By.id("pass")).sendKeys("bala");
driver.findElement(By.id("loginbutton")).click();
driver.quit();
}
@Test
public void test2() {
System.out.println("Launch");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhamu\\eclipse-workspace\\Balaji\\MavenDemo\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("balaji");
driver.findElement(By.id("pass")).sendKeys("bala");
driver.findElement(By.id("loginbutton")).click();
driver.quit();
}*/

//Optional

/*@Test
public void test1(@Optional("b")String us,String ps) {
	System.out.println("Launch");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhamu\\eclipse-workspace\\Balaji\\MavenDemo\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys(us);
	driver.findElement(By.id("pass")).sendKeys(ps);
	driver.findElement(By.id("loginbutton")).click();
	driver.quit();
}*/


//Running the Particular Test multiple times

/*public class TestNG {
WebDriver driver;
@Test(invocationCount = 3)
public void test1() {
System.out.println("Launch");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhamu\\eclipse-workspace\\Balaji\\MavenDemo\\drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("balaji");
driver.findElement(By.id("pass")).sendKeys("bala");
driver.findElement(By.id("loginbutton")).click();
driver.quit();
}
}*/