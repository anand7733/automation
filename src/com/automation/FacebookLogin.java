package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/anandrathore/Downloads/chromedriver/chrome");
        System.out.println(System.getProperty("webdriver.chrome.driver"));
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Displayed validation
        boolean emailAval = driver.findElement(By.id("email")).isDisplayed();
        System.out.println("Is Email field displayed? " + emailAval);
        boolean pwdAval = driver.findElement(By.id("pass")).isDisplayed();
        System.out.println("Is Password field displayed? " + pwdAval);

        boolean loginAval = driver.findElement(By.name("login")).isDisplayed();
        System.out.println("Is Login button displayed? " + loginAval);
        
      //  boolean buttonAval = driver.findElement(By.id("o_0_0_ow")).isDisplayed();
       // System.out.println("Is Login button displayed? " + buttonAval);
        

        // Enabled validation
        boolean pwdEnabled = driver.findElement(By.id("pass")).isEnabled();
        System.out.println("Is Password field enabled? " + (pwdEnabled ? "Yes" : "No"));

        boolean loginEnabled = driver.findElement(By.name("login")).isEnabled();
        System.out.println("Is Login button enabled? " + (loginEnabled ? "Yes" : "No"));

        // Title of Application
        String appTitle = driver.getTitle();
        System.out.println("Title is: " + appTitle);
        
        String appURL=driver.getCurrentUrl();
        System.out.println("URL is:"+appURL);
        
        
        WebElement date = driver.findElement(By.name("birthday_day"));
		WebElement month = driver.findElement(By.name("birthday_month"));
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		
		date.sendKeys("21");
		
		month.sendKeys("Dec");
		
		year.sendKeys("2000");
        

        
		
		driver.close(); 
        
    }
}
