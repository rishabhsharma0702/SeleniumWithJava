package seleniumTest;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
	public static void main(String[] args) throws Exception {
		
       ChromeDriver driver=new ChromeDriver();
       
       driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&dsh=S-1306927757%3A1759905284753470&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AfYwgwVdsx43zz6AnQ_7G_zInFbdhfhnDLXVTg6OK5KV_F64Bcx8PsOj2Voc0H2SUFN-nOtozpqWGA&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
       
       driver.manage().window().maximize();
       
       Thread.sleep(5000);
       WebElement usernameWebElement=driver.findElement(By.id("identifierId"));
       usernameWebElement.sendKeys("rishabhsharma.es@gmail.com");  
       WebElement nextbuttonWebElement=driver.findElement(By.id("identifierNext"));
       nextbuttonWebElement.click();
	}
}
