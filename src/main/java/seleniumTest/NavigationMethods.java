package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
	
	ChromeDriver driver;
	 String facebookWindowName;
	 String orangehrmWindowName;
	
	public void openBrowser() throws Exception
	{
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	
	public void enterOragneHrmUsername(String usernameValue) throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(usernameValue);
	System.out.println("Username entered successfully: "+usernameValue);
	Thread.sleep(3000);
	}
	
	
	public void openNewTab()
	{
		driver.switchTo().newWindow(WindowType.TAB);
	}
	
	
	public void openNewURL() throws Exception
	{
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
	}
	
	public void closeBrowser() throws Exception
	{
		driver.close();
		Thread.sleep(5000);
	}
	
	public void enterOrangeHrmPassword() throws Exception
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("admin123");
	Thread.sleep(3000);
	}
	
	
	public void enterFBEmail(String fbmailvalue) throws Exception {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(fbmailvalue);
	Thread.sleep(3000);
	}
	
	public void enterFBPassword(String fbpasswordvalue) throws Exception {
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(fbpasswordvalue);
	Thread.sleep(3000);
	}
	
	
	public void backToFBWindow()
	{
		driver.switchTo().window(facebookWindowName);
	}
	
	public void backToHRMWindow()
	{
		driver.switchTo().window(orangehrmWindowName);
	}
	
	public void navigateMethods() throws Exception
	{
		driver.navigate().back();
		System.out.println("Back");
		Thread.sleep(5000);
		
		driver.navigate().forward();
		System.out.println("Forward");
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		System.out.println("Refresh");
		
	}

	public static void main(String[] args) throws Exception {
		NavigationMethods navigationAction =new NavigationMethods();
		
		navigationAction.openBrowser();
		navigationAction.enterOragneHrmUsername("Admin");
		navigationAction.openNewTab();
		navigationAction.openNewURL();
		navigationAction.enterFBEmail("rishabh@gmail.com");
	
		navigationAction.backToFBWindow();
		navigationAction.enterFBPassword("rishabh@gmail.com");

		navigationAction.backToHRMWindow();
		navigationAction.enterFBPassword("password@123");
		navigationAction.navigateMethods();
		

	}

}
