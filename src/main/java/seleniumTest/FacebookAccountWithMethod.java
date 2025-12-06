package seleniumTest;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAccountWithMethod {
	ChromeDriver driver;
	
	public void openFbBrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	public void launchUrl() throws InterruptedException {
		driver.get("https://www.facebook.com/");  
		
		Thread.sleep(3000);
		System.out.println("Lauch url successfully");
	}
	public void clickOnCreateNewAccount() throws InterruptedException {
	     driver.findElement(By.linkText("Create new account")).click();
	     
	     Thread.sleep(1000);
	     System.out.println("clicked on Create New Accoun");
	}

	public void enterFirstName(String firstNameValue) {
		driver.findElement(By.name("firstname")).sendKeys(firstNameValue);
		System.out.println("Entered First name, Value--->"+firstNameValue);
	}
	
	public void enterLastName(String lastNameValue) {
		driver.findElement(By.name("lastname")).sendKeys(lastNameValue);
		System.out.println("Entered Last name , Value--->"+lastNameValue);
	}
	
	public void day() throws Exception {
		driver.findElement(By.id("day")).sendKeys("07");
		System.out.println("day entered");
		Thread.sleep(5000);
	}
			
	public void month() throws Exception {
		driver.findElement(By.id("month")).sendKeys("February");
		System.out.println("month entered");
		Thread.sleep(5000);
	}
				
	public void year() throws Exception {
		driver.findElement(By.id("year")).sendKeys("1988");
		System.out.println("year entered");
		Thread.sleep(5000);
	}
		
	public void selectGender() {
		driver.findElement(By.cssSelector("input[name=\"sex\"][value=\"1\"]")).click();
	}
	
	public void enterEmail(String emailValue) {
	driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys(emailValue);;
	}
	
	public void enterPassword(String passwordValue) {
	driver.findElement(By.id("password_step_input")).sendKeys(passwordValue);
	}
	
	public void pressSignup() {
	driver.findElement(By.cssSelector("button[name=\"websubmit\"]")).click();
	}
	
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	public static void main(String[] args) throws Exception {
		FacebookAccountWithMethod fbaccount = new FacebookAccountWithMethod();
		fbaccount.openFbBrowser();
		fbaccount.launchUrl();
		fbaccount.clickOnCreateNewAccount();
		fbaccount.enterFirstName("Rishabh");
		fbaccount.enterLastName("Sharma");
		fbaccount.day();
		fbaccount.month();
		fbaccount.year();
		fbaccount.selectGender();
		fbaccount.enterEmail("rishabhsharma@gmail.com");
		fbaccount.enterPassword("Mypassword@12345");
		fbaccount.pressSignup();
		fbaccount.closeBrowser();
		}
	}
