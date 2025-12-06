package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeNavigation {
	
	ChromeDriver driver;
	  String fbWindowName;
	  String hrmWindowName;
	
	public void openBrowser() throws Exception
	{
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	
	public void enterFBEmail(String emailValue) throws Exception
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys(emailValue);
	System.out.println("Email entered successfully: "+emailValue);
	Thread.sleep(3000);
	}
	
	
	public void openNewTab()
	{
		driver.switchTo().newWindow(WindowType.TAB);
	}
	
	
	public void openNewURL() throws Exception
	{
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(7000);
	}
	
	public void closeBrowser() throws Exception
	{
		//driver.quit();
		driver.close();
		Thread.sleep(5000);
	}
	
	public void getFBWindowName()
	{
	  fbWindowName=	driver.getWindowHandle();
	  System.out.println("FB Window name----->"+fbWindowName);
	}
	
	
	public void getHRMWindowName()
	{
	  hrmWindowName=	driver.getWindowHandle();
	  System.out.println("HRM Window name----->"+hrmWindowName);
	}
	
	
	
	
	public void enterFBPassword() throws Exception
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("FB PASSWORD");
	Thread.sleep(3000);
	}
	
	
	public void enterUsername() throws Exception {
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	Thread.sleep(3000);
	}
	
	public void enterPassword() throws Exception {
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	Thread.sleep(3000);
	}
	
	
	public void backToFBWindow()
	{
		driver.switchTo().window(fbWindowName);
	}
	
	public void backToHRMWindow()
	{
		driver.switchTo().window(hrmWindowName);
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
		PracticeNavigation navigationCMD =new PracticeNavigation();
		
		navigationCMD.openBrowser();
		navigationCMD.enterFBEmail("MAP Quality Solutions");
		navigationCMD.getFBWindowName();
		navigationCMD.openNewTab();
		navigationCMD.openNewURL();
		navigationCMD.getHRMWindowName();
		navigationCMD.enterUsername();
	
		//navigationCMD.closeBrowser();
		navigationCMD.backToFBWindow();
		navigationCMD.enterFBPassword();
	//	navigationCMD.closeBrowser();
		navigationCMD.backToHRMWindow();
		navigationCMD.enterPassword();
		navigationCMD.navigateMethods();
		

	}

}
