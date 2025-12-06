package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class HRMCrudOperation {
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
	// Method to enter username
	public void enterUserName(String usernameValue) throws Exception
	{
		  WebElement usernameWebElement=driver.findElement(By.name("username"));
	      usernameWebElement.sendKeys(usernameValue);
	      System.out.println("Username entered successfully, Value--->"+usernameValue);
	      Thread.sleep(3000);
	}
	
	// Method to enter password
	public void enterPassWord(String passwordValue) throws Exception
	{

        WebElement passwordWebElement=driver.findElement(By.name("password"));
        passwordWebElement.sendKeys(passwordValue);
        System.out.println("Password entered successfully, Value---->"+passwordValue);	
        Thread.sleep(3000);
	}
	
	// Method to click login button
	public void clickOnLoginButton() throws Exception
	{
		  WebElement  loginButtonWebElement= driver.findElement(By.tagName("button"));
	        
	        loginButtonWebElement.click();
	        System.out.println("Login button clicked successfully.");
	        Thread.sleep(5000);
	}
	
	
	// Method to validate Dashboard page visibility
	public void validateDashboardPageVisibility(String expectedHeaderValue) throws InterruptedException
	{
	         String actualHeaderValue= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
	         System.out.println("Actual header value of Dashboard is ---->" +actualHeaderValue);
	        if (expectedHeaderValue.equalsIgnoreCase(actualHeaderValue)) 
	        {
			System.out.println(actualHeaderValue+ "Dashboard Page visible successfully.");	
			} 
	        else 
	        {
			System.out.println(actualHeaderValue+ "Dashboard Page is not visible successfully.");	
			}
	        Thread.sleep(5000);
	}
	
	// Method to click on Admin button
	public void handleAdminclick() throws Exception
	{
		  WebElement  adminButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span"));
	        
		  adminButtonWebElement.click();
	        System.out.println("Admin button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	//Method to validate Admin page visibility
	public void validateAdminPageVisibility(String expectedHeaderValue) throws InterruptedException
	{
	         String actualAdminHeaderValue= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6[2]")).getText();
	         System.out.println("Actual header value of Admin is ---->" +actualAdminHeaderValue);
	        if (expectedHeaderValue.equalsIgnoreCase(actualAdminHeaderValue)) 
	        {
			System.out.println(actualAdminHeaderValue+ "Admin Page visible successfully.");	
			} 
	        else 
	        {
			System.out.println(actualAdminHeaderValue+ "Admin Page is not visible successfully.");	
			}
	        Thread.sleep(5000);
	}
	
	// Method to click on Add button
	public void clickonAdd() throws Exception
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

// Method to create username
public void createUserName(String usernameValue) throws Exception
{
	  WebElement newusernameWebElement=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input"));
      newusernameWebElement.sendKeys(usernameValue);
      System.out.println("Username entered successfully, Value--->"+usernameValue);
      Thread.sleep(3000);
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
		public void SearchEmployeeAndValidate(String actualUsernameValue) throws Exception
		{
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys(actualUsernameValue);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			 System.out.println("Search button clicked successfully.");
			Thread.sleep(7000);
			String expectedUsernameWebElement= driver.findElement(By.xpath("//div[@class='oxd-table-cell oxd-padding-cell'][2]")).getText();
			if (expectedUsernameWebElement.equalsIgnoreCase(actualUsernameValue))
			{
				System.out.println("Employee is added sucessfully");
			}
			else {
				System.out.println("Employee is not added");
			}
		    Thread.sleep(3000);
		}
		
		// Method to update Employee Details
		public void clickOnUpdate() throws Exception
		{
			  WebElement  updateButtonWebElement= driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-table-cell-action-space'][2]"));
		        
			  updateButtonWebElement.click();
		        System.out.println("Update button clicked successfully.");
		        Thread.sleep(5000);
		}
		
		// Method to select user role
		public void updateUserRole() throws InterruptedException {
		    // Step 1: Click the dropdown to open it
		    WebElement userdropdown = driver.findElement(By.xpath("//div[text()='Admin']"));
		    userdropdown.click();
		    Thread.sleep(3000);

		    // Step 2: Select the 'ESS' option from the list
//		    WebElement SelectEssOption = driver.findElement(By.xpath("//div[text()='ESS']"));
		    WebElement SelectEssOption = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[3]"));
		    SelectEssOption.click();
		    Thread.sleep(3000);
		}
		
		// Method to update Employee name
		public void updateEmployeeName(String EmployeeValue) throws Exception
		{

		    WebElement employeeUpdateWebElement=driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
//		    employeeUpdateWebElement.clear();
		    employeeUpdateWebElement.sendKeys(Keys.CONTROL + "a");
		    employeeUpdateWebElement.sendKeys(Keys.DELETE);
		    employeeUpdateWebElement.sendKeys(EmployeeValue);
		    System.out.println("employee name update successfully, Value---->"+EmployeeValue);	
		    Thread.sleep(5000);
		    //Select 'James Butler' from the suggestion list
		    WebElement suggestion = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div/span"));
		    suggestion.click();
		}
		
		// Method to update status of user
				public void updateUserStatus() throws InterruptedException {
				    // Step 1: Click the dropdown to open it
				    WebElement userStatusdropdown = driver.findElement(By.xpath("//div[text()='Enabled']"));
				    userStatusdropdown.click();
				    Thread.sleep(3000);

				    // Step 2: Select the 'Disabled' option from the list
//				    WebElement SelectDisabledOption = driver.findElement(By.xpath("//div[text()='ESS']"));
				    WebElement SelectDisabledOption = driver.findElement(By.xpath("//div//span[text()='Disabled']"));
				    SelectDisabledOption.click();
				    Thread.sleep(3000);
				}
				
				// Method to update username
				public void updateUserName(String usernameValue) throws Exception
				{
					  WebElement userupdateWebElement=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input"));
					  userupdateWebElement.sendKeys(Keys.CONTROL + "a");
					  userupdateWebElement.sendKeys(Keys.DELETE);
					  userupdateWebElement.sendKeys(usernameValue);
				      System.out.println("Username update successfully, Value--->"+usernameValue);
				      Thread.sleep(3000);
				}
				
				// Method to save updated employee
				public void clickOnSaveButton() throws Exception
				{
					  WebElement  saveButtonWebElement= driver.findElement(By.xpath("//button[@type='submit']"));
				        
					  saveButtonWebElement.click();
				        System.out.println("employee record update successfully");
				        Thread.sleep(7000);
				}
				
				// Method to Verify employee updated successfully
				public void SearchEmployeeAndValidateupdatedEmployee(String actualUsernameValue) throws Exception
				{
					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys(actualUsernameValue);
					driver.findElement(By.xpath("//button[@type='submit']")).click();
					 System.out.println("Search button clicked successfully.");
					Thread.sleep(7000);
					String expectedUsernameWebElement= driver.findElement(By.xpath("//div[@class='oxd-table-cell oxd-padding-cell'][2]")).getText();
					if (expectedUsernameWebElement.equalsIgnoreCase(actualUsernameValue))
					{
						System.out.println("Employee is updated sucessfully");
					}
					else {
						System.out.println("Employee is not updated sucessfully");
					}
				    Thread.sleep(3000);
				}
		
				// Method to search and delete employee
				public void SearchEmployeeAndDeleteFun(String searchForDeleteEmployee) throws Exception {
				    
				    WebElement searchEmployeeWebElement = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input"));

				    searchEmployeeWebElement.sendKeys(Keys.CONTROL + "a");
				    searchEmployeeWebElement.sendKeys(Keys.DELETE);

				    // Type the employee name
				    searchEmployeeWebElement.sendKeys(searchForDeleteEmployee);

				    // Click the search button
				    WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
				    searchButton.click();
				    Thread.sleep(7000);

				    System.out.println("Employee searched successfully: " + searchForDeleteEmployee);
				    
				    driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-table-cell-action-space'][1]")).click();
				    Thread.sleep(7000);
				    driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin'][1]")).click();
				    System.out.println("Employee deleted successfully");
				    Thread.sleep(7000);
				}

				//Method to close Browser
				public void closeBrowser() throws Exception
	{
					Thread.sleep(3000);
					driver.quit();
					System.out.println("Browser closed successfully.");
	}

				//Main method
				public static void main(String[] args) throws Exception {
					HRMCrudOperation orangetest = new HRMCrudOperation();
					//validation not unsuccessful
					orangetest.launchBrowser();
					orangetest.openUrl();
					orangetest.enterUserName("Admin"); 
					orangetest.enterPassWord("admin123");
					orangetest.clickOnLoginButton();
					orangetest.validateDashboardPageVisibility("Dashboard");
					orangetest.handleAdminclick();
					orangetest.validateAdminPageVisibility("User Management");
					System.out.println("***********************************Add Employee**************************");
					orangetest.clickonAdd();
					orangetest.selectUserRole();
					orangetest.enterEmployeeName("Joh");
					orangetest.selectStatus();
					orangetest.createUserName("rishabh123");
					orangetest.createPassWord("ris123456987");
					orangetest.confirmPassWord("ris123456987");
					orangetest.clickToSaveButton();
					System.out.println("***********************************Verify add user function**************************");
					orangetest.SearchEmployeeAndValidate("rishabh123");
					System.out.println("***********************************Update employee**************************");
					orangetest.clickOnUpdate();
					orangetest.updateUserRole();
					orangetest.updateEmployeeName("Rah");
					orangetest.updateUserStatus();
					orangetest.updateUserName("rishabh1234");
					orangetest.clickOnSaveButton();
					System.out.println("***********************************Verify update user function**************************");
					orangetest.SearchEmployeeAndValidateupdatedEmployee("rishabh1234");
					orangetest.SearchEmployeeAndDeleteFun("rishabh1234");
//					orangetest.closeBrowser();
	}
}
