package com.sde;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class TC_Login {
	
	WebDriver driver;
	
  @Test
  public void login_Test() 
  {
	//  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe"); 
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	  
	  driver.findElement(By.id("txtUsername")).sendKeys("Admint");
	  driver.findElement(By.id("txtPassword")).sendKeys("admint1234");
	  driver.findElement(By.id("btnLogin")).click();
	  
	  Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	  
	  driver.close();
  }
}
