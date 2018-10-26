package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Offline_Website_Login_Testcases {
	
	WebDriver driver;

	 @BeforeSuite
	  public void openBrowser() {
		 //Open Browser with Offline website URL
		 driver=new FirefoxDriver();
		 driver.get("D:\\Java Selenium by JBK\\Softwares\\Selenium Software\\Offline Website\\index.html");
	  }
//TC 1
  @Test
  public void Verify_Offline_Website_LoginURL() {
	  //Get actual URL
	  String actualURL = driver.getCurrentUrl();
	  //Give expected URL
	  String expectedUrl= "file:///D:/Java%20Selenium%20by%20JBK/Softwares/Selenium%20Software/Offline%20Website/index.html";
	 Assert.assertEquals(actualURL, expectedUrl);
	 System.out.println("TC1: Verify_Offline_Website_LoginURL -- Pass ");
	 System.out.println("--------");
  }
  
  //TC2
  @Test
  public void Verify_Successful_Login() {
	  driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("kiran@gmail.com");
	  driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("123456");
	  driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button")).click();
	  String actual_dashboard_URL = driver.getCurrentUrl();
	  String expected_dashboard_URL = "file:///D:/Java%20Selenium%20by%20JBK/Softwares/Selenium%20Software/Offline%20Website/pages/examples/dashboard.html";
	  Assert.assertEquals(actual_dashboard_URL, expected_dashboard_URL);
	  System.out.println("TC2 : Verify_Successful_Login -- Pass");
	  System.out.println("--------");
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

 

  @AfterSuite
  public void tearDown() {
	  // close browser
  driver.close();
  
  }
  

}
