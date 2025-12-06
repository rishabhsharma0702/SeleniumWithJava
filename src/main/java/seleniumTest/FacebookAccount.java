package seleniumTest;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAccount {
	public static void main(String[] args) throws Exception {
		
       ChromeDriver driver=new ChromeDriver();
       
       driver.get("https://www.facebook.com/");
       
       driver.manage().window().maximize();
       
       Thread.sleep(2000);
       WebElement CreateAccountButtonWebElement=driver.findElement(By.cssSelector("[data-testid='open-registration-form-button']"));
       CreateAccountButtonWebElement.click();
       WebElement FirstNameWebElement = driver.findElement(By.cssSelector("input[name='firstname']"));
       FirstNameWebElement.sendKeys("Rishabh");
       WebElement LastNameWebElement = driver.findElement(By.cssSelector("input[name='lastname']"));
       LastNameWebElement.sendKeys("Sharma");
       WebElement EmailWebElement = driver.findElement(By.cssSelector("input[name='reg_email__']"));
       EmailWebElement.sendKeys("rishabhsharma.es@gmail.com");
       WebElement PasswordWebElement = driver.findElement(By.id("password_step_input"));
       PasswordWebElement.sendKeys("Mypassword@12345");
       WebElement SelectGenderWebElement = driver.findElement(By.cssSelector("input[name=\"sex\"][value=\"1\"]"));
       SelectGenderWebElement.click();
       WebElement SignupWebElement = driver.findElement(By.cssSelector("button[name=\"websubmit\"]"));
       SignupWebElement.click();
	}
}
