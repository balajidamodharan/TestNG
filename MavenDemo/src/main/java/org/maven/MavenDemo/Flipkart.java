package org.maven.MavenDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhamu\\eclipse-workspace\\Balaji\\MavenDemo\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	driver.findElement(By.name("q")).sendKeys("iphone 7");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	String pwind = driver.getWindowHandle();
	System.out.println(pwind);
	Set<String> allwind = driver.getWindowHandles();
	System.out.println(allwind);
	for (String cwind : allwind) {
		if(!((pwind.equals(cwind)))){
			driver.switchTo().window(cwind);
		}
	}
	Actions a=new Actions(driver);
	Thread.sleep(3000);
	WebElement phone = driver.findElement(By.xpath("//div[text()='Apple iPhone 7 (Rose Gold, 128 GB)']"));
a.moveToElement(phone).perform();
phone.click();
WebElement add = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
a.moveToElement(add).perform();
add.click();
String text = driver.findElement(By.xpath("(//div[@class='hJYgKM'])[3]")).getText();
System.out.println(text);
}
}
