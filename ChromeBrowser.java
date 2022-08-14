package Selenium;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.google.co.in//");
driver.findElement(By.name("q")).sendKeys("youtube"+Keys.ENTER);

	} 
 
}
