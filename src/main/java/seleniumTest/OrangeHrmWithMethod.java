package seleniumTest;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class OrangeHrmWithMethod {
	ChromeDriver driver;
	
	//Launch Browser
	public void launchBrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	// Open get url
	public void openUrl() throws InterruptedException 
	{
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
	Thread.sleep(3000);
	System.out.println("open url successfully");
}
	public void enterUserName(String usernameValue) throws Exception
	{
		  WebElement usernameWebElement=driver.findElement(By.name("username"));
	      usernameWebElement.sendKeys(usernameValue);
	      System.out.println("Username entered successfully, Value--->"+usernameValue);
	      Thread.sleep(3000);
	}
	
	public void enterPassWord(String passwordValue) throws Exception
	{

        WebElement passwordWebElement=driver.findElement(By.name("password"));
        passwordWebElement.sendKeys(passwordValue);
        System.out.println("Password entered successfully, Value---->"+passwordValue);	
        Thread.sleep(3000);
	}
	
	public void clickOnLoginButton() throws Exception
	{
		  WebElement  loginButtonWebElement= driver.findElement(By.tagName("button"));
	        
	        loginButtonWebElement.click();
	        System.out.println("Login button clicked successfully.");
	        Thread.sleep(5000);
	}
	
	public void validateHomePage()
	{
		  String actualCurrentHOMEPageURL=driver.getCurrentUrl();
	        
	        String expectedHomePageURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	        if (expectedHomePageURL.equalsIgnoreCase(actualCurrentHOMEPageURL)) 
	        {
			System.out.println("User login successfully.");	
			} 
	        else 
	        {
				System.out.println("User not login successfully.");	
			}
	}
	
	public void closeBrowser() throws Exception
	{
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Browser closed successfully.");
	}

	public static void main(String[] args) throws Exception {
		OrangeHrmWithMethod orange = new OrangeHrmWithMethod();
		//validation not unsuccessful
		orange.launchBrowser();
		orange.openUrl();
		orange.enterUserName("admins"); 
		orange.enterPassWord("admins");
		orange.clickOnLoginButton();
		orange.validateHomePage();
		orange.closeBrowser();
		
		//validation not successful
		orange.launchBrowser();
		orange.openUrl();
		orange.enterUserName("Admin");  
		orange.enterPassWord("admin123");
		orange.clickOnLoginButton(); 
		orange.validateHomePage();
		orange.closeBrowser();

	}
}
