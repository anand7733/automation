package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class Relativepath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/anandrathore/Downloads/chromedriver/chrome");
        System.out.println(System.getProperty("webdriver.chrome.driver"));
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bankofamerica.com/");
        driver.manage().window().maximize();
        
        boolean  pwdEnabled = driver.findElement(By.xpath("//input[@name='passcode1']")).isEnabled();
        if(pwdEnabled ==true)
        {
        	System.out.println("Pass");
        }
        else {
        	System.out.println("Fail");
        }
       
        //driver.findElement(By.xpath("//input[@id='finCenterLocator']")).sendKeys("finCenterLocator");
        //driver.findElement(By.xpath("//input[@href='https://www.messenger.com/']")).sendKeys("apptScheduler");
        
        
		
		
	}

}
