package seleniumTest;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class HRMLeftPanelWithMethods {
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
	
	//Metod to click on PIM button
	public void handlePIMclick() throws Exception
	{
		  WebElement  pimButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span"));
	        
		  pimButtonWebElement.click();
	        System.out.println("PIM button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	//Method to validate PIM page visibility
	public void validatePIMPageVisibility(String expectedPIMHeaderValue) throws InterruptedException
	{
	         String actualPIMHeaderValue= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
	         System.out.println("Actual header value of Admin is ---->" +actualPIMHeaderValue);
	        if (expectedPIMHeaderValue.equalsIgnoreCase(actualPIMHeaderValue)) 
	        {
			System.out.println(actualPIMHeaderValue+ "PIM Page visible successfully.");	
			} 
	        else 
	        {
			System.out.println(actualPIMHeaderValue+ "PIM Page is not visible successfully.");	
			}
	        Thread.sleep(5000);
	}
	
	//Method to click on Leave button
	public void handleLeaveclick() throws Exception
	{
		  WebElement  leaveButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a/span"));
	        
		  leaveButtonWebElement.click();
	        System.out.println("Leave button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	//Method to validate Leave page visibility
	public void validateLeavePageVisibility(String expectedLeaveHeaderValue) throws InterruptedException
	{
	         String actualLeaveHeaderValue= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
	         System.out.println("Actual header value of Leave  is ---->" +actualLeaveHeaderValue);
	        if (expectedLeaveHeaderValue.equalsIgnoreCase(actualLeaveHeaderValue)) 
	        {
			System.out.println(actualLeaveHeaderValue+ "Leave Page visible successfully.");	
			} 
	        else 
	        {
			System.out.println(actualLeaveHeaderValue+ "Leave Page is not visible successfully.");	
			}
	        Thread.sleep(5000);
	}
	
	//Method to click on Time Button
	public void handleTimeclick() throws Exception
	{
		  WebElement  timeButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a/span"));
	        
		  timeButtonWebElement.click();
	        System.out.println("Time button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	//Method to validate Time page visibility
	public void validateTimePageVisibility(String expectedTimeHeaderValue)
	{
		  String actualTimeHeaderValue=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6[1]")).getText();
		  System.out.println("Actual time header value is----->" +expectedTimeHeaderValue);
	        
	        if (expectedTimeHeaderValue.equalsIgnoreCase(actualTimeHeaderValue)) 
	        {
			System.out.println("Time page is visible successfully.");	
			} 
	        else 
	        {
			System.out.println("Time page is not visible successfully.");	
			}
	}
	
	//Method to click on Recruitment Button
	public void handleRecruitmentclick() throws Exception
	{
		  WebElement  recruitmentButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span"));
	        
		  recruitmentButtonWebElement.click();
	        System.out.println("Recruitment button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	//Method to validate Recruitment page visibility
	public void validateRecruitmentPageVisiblility(String expectedRecruitmentHeaderValue)
	{
		  String actualRecruitmentHeaderValue=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		  System.out.println("The actual value of Recruitment Header is=====>" +actualRecruitmentHeaderValue);
	        
	        if (expectedRecruitmentHeaderValue.equalsIgnoreCase(actualRecruitmentHeaderValue)) 
	        {
			System.out.println("Recruitment page is visible successfully.");	
			} 
	        else 
	        {
			System.out.println("Recruitment page is not visible successfully.");	
			}
	}
	
	//Metho to click on MyInfo button
	public void handleMyInfoclick() throws Exception
	{
		  WebElement  myInfoButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span"));
	        
		  myInfoButtonWebElement.click();
	        System.out.println("My Info button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	//Method to validate MyInfo page visibility
	public void validateMyInfoPageVisiblility(String expectedMyInfoHeaderValue)
	{
		  String actualMyInfoHeaderValue=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/h6")).getText();
		  System.out.println("Actual Header value of MyInfo page is====>" +actualMyInfoHeaderValue);
	        if (expectedMyInfoHeaderValue.equalsIgnoreCase(actualMyInfoHeaderValue)) 
	        {
			System.out.println("MyInfo page is Visible successfully.");	
			} 
	        else 
	        {
			System.out.println("MyInfo page is not Visible successfully.");	
			}
	}
	
	//Method to click on Performance button
	public void handlePerformanceclick() throws Exception
	{
		  WebElement  performanceButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[7]/a/span"));
	        
		  performanceButtonWebElement.click();
	        System.out.println("Performance button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	//Method to validate Performance page visibility
	public void validateMyPerformancePageVisibility(String expectedPerformanceHeaderValue)
	{
		 	String actualPerformanceHeaderValue=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6[1]")).getText();
	        System.out.println("Actual header value of Performance is===>" +actualPerformanceHeaderValue);
	        if (expectedPerformanceHeaderValue.equalsIgnoreCase(actualPerformanceHeaderValue)) 
	        {
			System.out.println("Performance page is visible successfully.");	
			} 
	        else 
	        {
			System.out.println("Performance page is not visible successfully.");	
			}
	}
	
	//Method to click on Directory button
	public void handleDirectoryclick() throws Exception
	{
		  WebElement  directoryButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[9]/a/span"));
	        
		  directoryButtonWebElement.click();
	        System.out.println("Directory button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	//Method to validate Directory page visibility
	public void validateDirectoryPageVisiblility(String expectedDirectoryHeaderValue)
	{
		  String actualDirectoryHeaderValue=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		  System.out.println("Actual Header value of Directory is===>" +actualDirectoryHeaderValue);
	        
	        if (expectedDirectoryHeaderValue.equalsIgnoreCase(actualDirectoryHeaderValue)) 
	        {
			System.out.println("Directory page is visible successfully.");	
			} 
	        else 
	        {
			System.out.println("Directory page is not visible successfully.");	
			}
	}
	
	//Method to click on Maintenance button
	public void handleMaintenanceclick() throws Exception
	{
		  WebElement  maintenanceButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[10]/a/span"));
	        
		  maintenanceButtonWebElement.click();
	        System.out.println("Maintenance button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	//Method to enter Password
	public void enterPassWordForMaintenance(String passwordValue) throws Exception
	{

        WebElement passwordWebElement=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/form/div[3]/div/div[2]/input"));
        passwordWebElement.sendKeys(passwordValue);
        System.out.println("Password entered successfully, Value---->"+passwordValue);	
        Thread.sleep(3000);
	}
	
	//Method to click on Confirm button
	public void clickOnConfirmButton() throws Exception
	{
		  WebElement  confirmButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/form/div[4]/button[2]"));
	        
		  confirmButtonWebElement.click();
	        System.out.println("Confirm button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	//Method to validate Maintenance page visibility
	public void vlidateMaintenancePageVisibility(String expectedMaintenanceHeaderValue)
	{
		  String actualMaintenanceHeaderValue=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6[1]")).getText();
		  System.out.println("Actual Header of Maintenance is===>" +actualMaintenanceHeaderValue);
	        if (expectedMaintenanceHeaderValue.equalsIgnoreCase(actualMaintenanceHeaderValue)) 
	        {
			System.out.println("Maintenance page is visible successfully.");	
			} 
	        else 
	        {
			System.out.println("Maintenance page is not visible successfully.");	
			}
	}
	
	//Method to click on Claim button
	public void handleClaimclick() throws Exception
	{
		  WebElement  claimButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[11]/a/span"));
	        
		  claimButtonWebElement.click();
	        System.out.println("My Info button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	//Method to validate Claim page visibility
	public void validateClaimPageVisiblility(String expectedClaimHeaderValue)
	{
		  String actualClaimHeaderValue=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		  System.out.println("Acutal Header value of claim is===>"+actualClaimHeaderValue);
	        if (expectedClaimHeaderValue.equalsIgnoreCase(actualClaimHeaderValue)) 
	        {
			System.out.println("Claim page is visible successfully.");	
			} 
	        else 
	        {
			System.out.println("Claim page is not visible successfully.");	
			}
	}
	
	//Method to click on Buzz button
	public void handleBuzzclick() throws Exception
	{
		  WebElement  buzzButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[12]/a/span"));
	        
		  buzzButtonWebElement.click();
	        System.out.println("Buzz button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	//Method to validate Buzz page visibility
	public void validateBuzzPageVisibility(String expectedBuzzHeaderValue)
	{
		  String actualBuzzHeaderValue=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		  System.out.println("Actual Header of Buzz is===>"+actualBuzzHeaderValue);
	        if (expectedBuzzHeaderValue.equalsIgnoreCase(actualBuzzHeaderValue)) 
	        {
			System.out.println("Buzz page is visible successfully.");	
			} 
	        else 
	        {
			System.out.println("Buzz page is not visible successfully.");	
			}
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
		HRMLeftPanelWithMethods orangetest = new HRMLeftPanelWithMethods();
		//validation not unsuccessful
		orangetest.launchBrowser();
		orangetest.openUrl();
		orangetest.enterUserName("Admin"); 
		orangetest.enterPassWord("admin123");
		orangetest.clickOnLoginButton();
		orangetest.validateDashboardPageVisibility("Dashboard");
		orangetest.handleAdminclick();
		orangetest.validateAdminPageVisibility("User Management");
		orangetest.handlePIMclick();
		orangetest.validatePIMPageVisibility("PIM");
		orangetest.handleLeaveclick();
		orangetest.validateLeavePageVisibility("Leave");
		orangetest.handleTimeclick();
		orangetest.validateTimePageVisibility("Time");
		orangetest.handleRecruitmentclick();
		orangetest.validateRecruitmentPageVisiblility("Recruitment");
		orangetest.handleMyInfoclick();
		orangetest.validateMyInfoPageVisiblility("Personal Details");
		orangetest.handlePerformanceclick();
		orangetest.validateMyPerformancePageVisibility("Performance");
		orangetest.handleDirectoryclick();
		orangetest.validateDirectoryPageVisiblility("Directory");
		orangetest.handleMaintenanceclick();
		orangetest.enterPassWordForMaintenance("admin123");
		orangetest.clickOnConfirmButton();
		orangetest.vlidateMaintenancePageVisibility("Maintenance");
		orangetest.handleClaimclick();
		orangetest.validateClaimPageVisiblility("Claim");
		orangetest.handleBuzzclick();
		orangetest.validateBuzzPageVisibility("Buzz");
		orangetest.closeBrowser();
	}
}
