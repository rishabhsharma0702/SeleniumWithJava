package seleniumwithTestNG;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class CrudOperationTestNG {
	ChromeDriver driver;
  @Test(description = "Verify the login functionality with valid cred", priority = 1)
  public void verifyHrmLoginWithValidCred() throws Exception {
	  
	  WebElement usernameWebElement=driver.findElement(By.name("username"));
      usernameWebElement.sendKeys("Admin");
      Reporter.log("Username entered successfully", true);
      Thread.sleep(5000);
      WebElement passwordWebElement=driver.findElement(By.name("password"));
      passwordWebElement.sendKeys("admin123");
      Reporter.log("Password entered successfully", true);	
      Thread.sleep(5000);
      WebElement  loginButtonWebElement= driver.findElement(By.tagName("button"));
      
      loginButtonWebElement.click();
      Reporter.log("Login button clicked successfully.", true);
      Thread.sleep(5000);
      
      String actualCurrentHOMEPageURL=driver.getCurrentUrl();
      
      String expectedHomePageURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
      if (expectedHomePageURL.equalsIgnoreCase(actualCurrentHOMEPageURL)) {
    	  Reporter.log("User login successfully.", true);	
		} else {
			Reporter.log("User not login successfully.", true);	
		}
	  
  }
  
   
  @Test(description = "Verify the login functionality with valid cred, priority", priority= 2)
  public void verifyHrmLoginWithInValidCred() throws Exception {
	  
	  WebElement usernameWebElement=driver.findElement(By.name("username"));
      usernameWebElement.sendKeys("axcvbn");
      Reporter.log("Username entered successfully, Value--->axcvbn", true);
    //  System.out.println("Username entered successfully, Value--->Admin");
      Thread.sleep(5000);
      WebElement passwordWebElement=driver.findElement(By.name("password"));
      passwordWebElement.sendKeys("svbnm");
      Reporter.log("Password entered successfully, Value---->svbnm", true);	
      Thread.sleep(5000);
      WebElement  loginButtonWebElement= driver.findElement(By.tagName("button"));
      
      loginButtonWebElement.click();
      Reporter.log("Login button clicked successfully.", true);
      Thread.sleep(5000);
      
     
	  
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("*******************************Test Start**************************************");
  }

  @AfterMethod
  public void afterMethod() throws Exception
  {
	  Thread.sleep(5000);
   System.out.println("***********************Test case end***********************************");
   driver.navigate().refresh();
   Thread.sleep(5000);
  }
  
  
  @BeforeClass
  public void launchingBrowser() throws Exception {
	  driver=new ChromeDriver();
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      driver.manage().window().maximize(); 
      Thread.sleep(5000);
      System.out.println("Browser opened successfully.");
  }

  @AfterClass
  public void closingBrowser() throws Exception {
	  Thread.sleep(5000);
	  driver.quit();
  }

}

