package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownList {

	public static void main(String[] args) throws Exception 
	{
	        System.setProperty("webdriver.chrome.driver", "/Users/anandrathore/Desktop/chromedriver_mac64/chromedriver");
	        System.out.println(System.getProperty("webdriver.chrome.driver"));
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        WebElement first=driver.findElement(By.className("col-lg-3"));
	        Thread.sleep(1000);
	        WebElement animal =driver.findElement(By.id("animals"));
	        Thread.sleep(1000);
	        
	        Select obj1=new Select(first);
	        obj1.selectByVisibleText("Google");
	        Thread.sleep(1000);
	        
	        Select obj2=new Select(first);
	        obj2.selectByValue("Apple");
	        Thread.sleep(1000);
	        
	        Select obj3=new Select(first);
	        obj3.selectByVisibleText("Yahoo");
	        Thread.sleep(1000);
	        
	        Select obj4=new Select(animal);
	        obj4.selectByValue("cat");
	        Thread.sleep(1000);
	        
	        Select obj5=new Select(animal);
	        obj5.selectByIndex(2);
	        Thread.sleep(1000);
	        
	        Select obj6=new Select(animal);
	        obj6.selectByVisibleText("Avatar");
	        Thread.sleep(1000);
	        
	        driver.get("https://chercher.tech/python/install-selenium-python");
	        Thread.sleep(1000);
	    	
	    
	        driver.close(); 
	}

}
