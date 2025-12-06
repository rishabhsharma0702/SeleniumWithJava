package seleniumwithTestNG;

import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class CrudInTestNG {
	
	ChromeDriver driver;
	
  @Test(description = "Verify the login functionality with valid credentials")
  
//entering user name and password **********************************************
       public void verifyOrangeHrmLoginFuncWithValidCredential() throws InterruptedException {
	   
       WebElement username = driver.findElement(By.name("username"));
	   username.sendKeys("Admin");    // give hard core value
	   Reporter.log("Succesfully entered Username, Value:- Admin", true);
	   // System.out.println("Successfully entered User name");
	   Thread.sleep(3000);
	   
	   WebElement password = driver.findElement(By.name("password"));
	   password.sendKeys("admin123");    // give hard core value
	   Reporter.log("Succesfully entered Password, Value:- admin123", false);
	   Thread.sleep(3000);   
  }
	   
// click on login button ***********************************************************
     public void clickOnLoginButton() throws InterruptedException {
         driver.findElement(By.xpath("//button[@type='button'or@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
         Reporter.log("Succesfully clicked on login button.",true);
    Thread.sleep(2000);
     }
    
  @BeforeMethod
     public void beforeMethod() throws InterruptedException {
	  driver = new ChromeDriver();      // launch browser 
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  // open app
	  driver.manage().window().maximize();     // maximize window
	  Thread.sleep(5000);
	  System.out.println("Browser opened, maximize window succesfully");
	 }

 @AfterMethod
     public void afterMethod() throws InterruptedException{
	  Thread.sleep(3000);
	  driver.quit();
 }

}

