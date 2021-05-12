package com.jk.testng_demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Test1_firefox {

	WebDriver driver;
	
	public  void initBrowser() throws MalformedURLException {
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setPlatform(Platform.LINUX);		
		URL url = new URL("http://192.168.99.106:4444/wd/hub");
		driver = new RemoteWebDriver(url,cap);
	
	}
	
	@Test
	public void test1() throws MalformedURLException {
		initBrowser();
		driver.get("http://google.com");
		System.out.println("Title : "+ driver.getTitle());
	}
	
	@Test
	public void test2() {
		driver.findElement(By.xpath("//input[@aria-label='Search' and @name='q']")).sendKeys("Hi Jk Here");
		driver.close();		
		driver.quit();

	}
	
}
