package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacrbookXpath {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "/Users/anandrathore/Desktop/chromedriver_mac64/chromedriver");
	        System.out.println(System.getProperty("webdriver.chrome.driver"));
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://en-gb.facebook.com/reg/");
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.xpath( "/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input")).sendKeys("Anand");
	        Thread.sleep(1000);

	       
	        driver.findElement(By.xpath( "/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input")).sendKeys("Rathore");
	        Thread.sleep(1000);
	        
	        driver.findElement(By.xpath( "/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input")).sendKeys("1245");
	        Thread.sleep(1000);
	        
	        driver.findElement(By.xpath( "/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input")).sendKeys("Anand@123");
	        Thread.sleep(1000);
	        
	    
	        
	        WebElement date = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input"));
			WebElement month = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]"));
			WebElement year = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]"));
			
			
			date.sendKeys("21");
			Thread.sleep(2000);
			month.sendKeys("Dec");
			Thread.sleep(2000);
			year.sendKeys("2000");
			Thread.sleep(2000);
	       // driver.close(); 

	}

}
