package seleniumwithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
public class HRMTestNGCrud {
    ChromeDriver driver;

    // -----------------Launch Browser -----------------
    @BeforeClass
    public void launchBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        System.out.println("Browser launched and URL opened successfully");
    }

    // -----------------Test Method using DataProvider -----------------
    @Test(priority = 1,enabled=true, dataProvider = "LoginDataProvider", dataProviderClass = CustomDataProvider.class)
    public void loginTest(String usernameValue, String passwordValue) throws Exception {
        enterUserName(usernameValue);
        enterPassWord(passwordValue);
        clickOnLoginButton();
        validateDashboardPageVisibility("Dashboard");
    }
    
    // ----------------- Add Admin Test using DataProvider -----------------
    @Test(priority = 2,enabled=true, dataProvider = "AddAdminDataProvider", dataProviderClass = CustomDataProvider.class, dependsOnMethods = "loginTest")
    public void addAdminTest(String empName, String empUserName, String password, String confirmpassword) throws Exception {
        navigateToAdminPage();
        clickAddButton();
        selectUserRole();
        enterEmployeeName(empName); // Default existing employee in OrangeHRM
        selectStatus();
        enterUserNameForAdmin(empUserName);
        createPassWord(password);
        confirmPassWord(confirmpassword);
        clickToSaveButton();
        System.out.println("Admin added successfully!");
        //Add Employee Validation 
        SearchEmployeeAndValidate(empUserName);
    }
    
//    // ----------------- Update Admin Test using DataProvider -----------------
//    @Test(priority = 3, enabled=true, dataProvider = "AddAdminDataProvider", dataProviderClass = CustomDataProvider.class, dependsOnMethods = "loginTest")
//    public void updateAdminTest( String searchUserName, String updateempName, String updateAdminUserName) throws Exception {
//        navigateToAdminPage();
//        clickAddButton();
//        selectUserRole();
//        enterEmployeeName(empName); // Default existing employee in OrangeHRM
//        selectStatus();
//        enterUserNameForAdmin(empUserName);
//        createPassWord(password);
//        confirmPassWord(confirmpassword);
//        clickToSaveButton();
//        System.out.println("Admin added successfully!");
//    }


    // -----------------Enter Username -----------------
    public void enterUserName(String usernameValue) throws Exception {
        WebElement usernameWebElement = driver.findElement(By.name("username"));
        usernameWebElement.sendKeys(usernameValue);
        System.out.println("Username entered successfully, Value ---> " + usernameValue);
        Thread.sleep(2000);
    }

    // ----------------- Enter Password -----------------
    public void enterPassWord(String passwordValue) throws Exception {
        WebElement passwordWebElement = driver.findElement(By.name("password"));
        passwordWebElement.sendKeys(passwordValue);
        System.out.println("Password entered successfully, Value ---> " + passwordValue);
        Thread.sleep(2000);
    }

    // ----------------- Click Login Button -----------------
    public void clickOnLoginButton() throws Exception {
        WebElement loginButtonWebElement = driver.findElement(By.tagName("button"));
        loginButtonWebElement.click();
        System.out.println("Login button clicked successfully.");
        Thread.sleep(3000);
    }

    // ----------------- Validate Dashboard -----------------
    public void validateDashboardPageVisibility(String expectedHeaderValue) throws InterruptedException {
        try {
            String actualHeaderValue = driver.findElement(
                By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")
            ).getText();
            System.out.println("Actual header value of Dashboard is ----> " + actualHeaderValue);

            if (expectedHeaderValue.equalsIgnoreCase(actualHeaderValue)) {
                System.out.println( actualHeaderValue + " Page visible successfully.");
            } else {
                System.out.println(actualHeaderValue + " Page not visible successfully.");
            }
        } catch (Exception e) {
            System.out.println("Dashboard not visible - login might have failed.");
        }
        Thread.sleep(6000);
    }

 // Method to click on Admin button
 	public void navigateToAdminPage() throws Exception
 	{
 		  WebElement  adminButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span"));
 	        
 		  adminButtonWebElement.click();
 	        System.out.println("Admin button clicked successfully.");
 	        Thread.sleep(6000);
 	}
 	
 // Method to click on Add button
 	public void clickAddButton() throws Exception
 	{
 		  WebElement  addButtonWebElement= driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
 	        
 		  addButtonWebElement.click();
 	        System.out.println("Add button clicked successfully.");
 	        Thread.sleep(3000);
 	}
 	
	// Method to select user role
 	public void selectUserRole() throws InterruptedException {
    // Step 1: Click the dropdown to open it
    WebElement userdropdown = driver.findElement(By.xpath("//label[text()='User Role']/following::div[@class='oxd-select-text-input'][1]"));
    userdropdown.click();
    Thread.sleep(3000);

    // Step 2: Select the 'Admin' option from the list
    WebElement adminOption = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]"));
    adminOption.click();
    Thread.sleep(3000);
}

// Method to enter Employee name
 	public void enterEmployeeName(String EmployeeValue) throws Exception
{

    WebElement employeeWebElement=driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
    employeeWebElement.sendKeys(EmployeeValue);
    System.out.println("employee name entered successfully, Value---->"+EmployeeValue);	
    Thread.sleep(5000);
    //Select 'James Butler' from the suggestion list
    WebElement suggestion = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div/span"));
    suggestion.click();
}
    
    // ----------------- Select Status -----------------
//Method to select status
 	public void selectStatus() throws InterruptedException {
  // Step 1: Click the dropdown to open it
  WebElement statusdropdown = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));
  statusdropdown.click();
  Thread.sleep(3000);

  // Step 2: Select the 'Enabled' option from the list
  WebElement enabledOption = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]/span"));
  enabledOption.click();
  Thread.sleep(3000);
}
    
 // ----------------- Enter Username for Admin -----------------
    public void enterUserNameForAdmin(String username) throws Exception {
        WebElement usernameInput = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
        usernameInput.sendKeys(username);
        Thread.sleep(2000);
        System.out.println("Admin username entered successfully: " + username);
    }
    
  //Method to create password
  	public void createPassWord(String passwordValue) throws Exception
  	{

       WebElement newpasswordWebElement=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input"));
       newpasswordWebElement.sendKeys(passwordValue);
       System.out.println("Password entered successfully, Value---->"+passwordValue);	
       Thread.sleep(3000);
  	}
  	
  		//Method for confirm password
  		public void confirmPassWord(String passwordValue) throws Exception
  		{

  	     WebElement confirmpasswordWebElement=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input"));
  	     confirmpasswordWebElement.sendKeys(passwordValue);
  	     System.out.println("Confirm Password entered successfully, Value---->"+passwordValue);	
  	     Thread.sleep(3000);
  		}
  		
  		// Method to click on Save button
  		public void clickToSaveButton() throws Exception
  		{
  			  WebElement  saveButtonWebElement= driver.findElement(By.xpath("//button[@type='submit']"));
  		        
  			  saveButtonWebElement.click();
  		        System.out.println("Save button clicked successfully.");
  		        Thread.sleep(7000);
  		}
  		
  	// Method to Verify employee add successfully
  		public void SearchEmployeeAndValidate(String actualUsernameValue) throws Exception {
  		    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys(actualUsernameValue);
  		    driver.findElement(By.xpath("//button[@type='submit']")).click();
  		    System.out.println("Search button clicked successfully.");
  		    Thread.sleep(5000);

  		    String expectedUsername = driver.findElement(By.xpath("//div[@class='oxd-table-cell oxd-padding-cell'][2]")).getText();

  		    Assert.assertEquals(expectedUsername, actualUsernameValue, "Employee not added correctly!");
  		    System.out.println("Employee added successfully: " + actualUsernameValue);
  		}

    
    // ----------------- Close Browser -----------------
    @AfterClass
    public void closeBrowser() throws Exception {
        Thread.sleep(2000);
        driver.quit();
        System.out.println("Browser closed successfully.\n-----------------------------------");
    }
}
