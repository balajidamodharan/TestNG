package org.maven.MavenDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhamu\\eclipse-workspace\\Balaji\\MavenDemo\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://seleniumpractise.blogspot.com/");
WebElement tools_dropdown = driver.findElement(By.id("tools"));

Select tools=new Select(tools_dropdown);

List actuallist=new ArrayList();

List<WebElement> toolslist = tools.getOptions();
for (WebElement mytools : toolslist) {
	String data = mytools.getText();
	actuallist.add(data);
}
List temp=new ArrayList();
temp.addAll(actuallist);

Collections.sort(temp);

if(actuallist==temp) {
	System.out.println("equal");
}
else {
	System.out.println("not equal");
}

}
}
