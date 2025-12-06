package seleniumTest;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class HRMLeftPanelFun {
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
	
	public void ValidateDashboardPage() throws InterruptedException
	{
		  String actualCurrentDashboardPageURL=driver.getCurrentUrl();
	        
	        String expectedDashboardPageURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	        if (expectedDashboardPageURL.equalsIgnoreCase(actualCurrentDashboardPageURL)) 
	        {
			System.out.println("Dashboard page is open successfully.");	
			} 
	        else 
	        {
			System.out.println("Dashboard page is not open successfully.");	
			}
	        Thread.sleep(5000);
	}
	
	public void handleAdminclick() throws Exception
	{
		  WebElement  AdminButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span"));
	        
		  AdminButtonWebElement.click();
	        System.out.println("Admin button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	public void ValidateAdminPage()
	{
		  String actualCurrentAdminPageURL=driver.getCurrentUrl();
	        
	        String expectedAdminPageURL="https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
	        if (expectedAdminPageURL.equalsIgnoreCase(actualCurrentAdminPageURL)) 
	        {
			System.out.println("Admin page is open successfully.");	
			} 
	        else 
	        {
			System.out.println("Admin page is not open successfully.");	
			}
	}
	
	public void handlePIMclick() throws Exception
	{
		  WebElement  PIMButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span"));
	        
		  PIMButtonWebElement.click();
	        System.out.println("PIM button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	public void ValidatePIMPage()
	{
		  String actualCurrentPIMPageURL=driver.getCurrentUrl();
	        
	        String expectedPIMPageURL="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
	        if (expectedPIMPageURL.equalsIgnoreCase(actualCurrentPIMPageURL)) 
	        {
			System.out.println("PIM page is open successfully.");	
			} 
	        else 
	        {
			System.out.println("PIM page is not open successfully.");	
			}
	}
	
	public void handleLeaveclick() throws Exception
	{
		  WebElement  LeaveButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a/span"));
	        
		  LeaveButtonWebElement.click();
	        System.out.println("Leave button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	public void ValidateLeavePage()
	{
		  String actualCurrentLeavePageURL=driver.getCurrentUrl();
	        
	        String expectedLeavePageURL="https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList";
	        if (expectedLeavePageURL.equalsIgnoreCase(actualCurrentLeavePageURL)) 
	        {
			System.out.println("Leave page is open successfully.");	
			} 
	        else 
	        {
			System.out.println("Leave page is not open successfully.");	
			}
	}
	public void handleTimeclick() throws Exception
	{
		  WebElement  TimeButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a/span"));
	        
		  TimeButtonWebElement.click();
	        System.out.println("Time button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	public void ValidateTimePage()
	{
		  String actualCurrentTimePageURL=driver.getCurrentUrl();
	        
	        String expectedTimePageURL="https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet";
	        if (expectedTimePageURL.equalsIgnoreCase(actualCurrentTimePageURL)) 
	        {
			System.out.println("Ime page is open successfully.");	
			} 
	        else 
	        {
			System.out.println("Time page is not open successfully.");	
			}
	}
	
	public void handleRecruitmentclick() throws Exception
	{
		  WebElement  RecruitmentButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span"));
	        
		  RecruitmentButtonWebElement.click();
	        System.out.println("Recruitment button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	public void ValidateRecruitmentPage()
	{
		  String actualCurrentRecruitmentPageURL=driver.getCurrentUrl();
	        
	        String expectedRecruitmentPageURL="https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates";
	        if (expectedRecruitmentPageURL.equalsIgnoreCase(actualCurrentRecruitmentPageURL)) 
	        {
			System.out.println("Recruitment page is open successfully.");	
			} 
	        else 
	        {
			System.out.println("Recruitment page is not open successfully.");	
			}
	}
	
	public void handleMyInfoclick() throws Exception
	{
		  WebElement  MyInfoButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span"));
	        
		  MyInfoButtonWebElement.click();
	        System.out.println("My Info button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	public void ValidateMyInfoPage()
	{
		  String actualCurrentMyInfoPageURL=driver.getCurrentUrl();
	        
	        String expectedMyInfoPageURL="https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates";
	        if (expectedMyInfoPageURL.equalsIgnoreCase(actualCurrentMyInfoPageURL)) 
	        {
			System.out.println("MyInfo page is open successfully.");	
			} 
	        else 
	        {
			System.out.println("MyInfo page is not open successfully.");	
			}
	}
	
	public void handlePerformanceclick() throws Exception
	{
		  WebElement  PerformanceButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[7]/a/span"));
	        
		  PerformanceButtonWebElement.click();
	        System.out.println("Performance button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	public void ValidateMyPerformancePage()
	{
		  String actualCurrentPerformancePageURL=driver.getCurrentUrl();
	        
	        String expectedPerformancePageURL="https://opensource-demo.orangehrmlive.com/web/index.php/performance/searchEvaluatePerformanceReview";
	        if (expectedPerformancePageURL.equalsIgnoreCase(actualCurrentPerformancePageURL)) 
	        {
			System.out.println("Performance page is open successfully.");	
			} 
	        else 
	        {
			System.out.println("Performance page is not open successfully.");	
			}
	}
	
	public void handleDirectoryclick() throws Exception
	{
		  WebElement  DirectoryButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[9]/a/span"));
	        
		  DirectoryButtonWebElement.click();
	        System.out.println("Directory button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	public void ValidateDirectoryPage()
	{
		  String actualCurrentDirectoryPageURL=driver.getCurrentUrl();
	        
	        String expectedDirectoryPageURL="https://opensource-demo.orangehrmlive.com/web/index.php/directory/viewDirectory";
	        if (expectedDirectoryPageURL.equalsIgnoreCase(actualCurrentDirectoryPageURL)) 
	        {
			System.out.println("Directory page is open successfully.");	
			} 
	        else 
	        {
			System.out.println("Directory page is not open successfully.");	
			}
	}
	
	public void handleMaintenanceclick() throws Exception
	{
		  WebElement  MaintenanceButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[10]/a/span"));
	        
		  MaintenanceButtonWebElement.click();
	        System.out.println("Maintenance button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	public void enterPassWordForMaintenance(String passwordValue) throws Exception
	{

        WebElement passwordWebElement=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/form/div[3]/div/div[2]/input"));
        passwordWebElement.sendKeys(passwordValue);
        System.out.println("Password entered successfully, Value---->"+passwordValue);	
        Thread.sleep(3000);
	}
	
	public void ClickOnConfirmButton() throws Exception
	{
		  WebElement  ConfirmButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/form/div[4]/button[2]"));
	        
		  ConfirmButtonWebElement.click();
	        System.out.println("Confirm button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	public void ValidateMaintenancePage()
	{
		  String actualCurrentMaintenancePageURL=driver.getCurrentUrl();
	        
	        String expectedMaintenancePageURL="https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates";
	        if (expectedMaintenancePageURL.equalsIgnoreCase(actualCurrentMaintenancePageURL)) 
	        {
			System.out.println("Maintenance page is open successfully.");	
			} 
	        else 
	        {
			System.out.println("Maintenance page is not open successfully.");	
			}
	}
	
	public void handleClaimclick() throws Exception
	{
		  WebElement  ClaimButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[11]/a/span"));
	        
		  ClaimButtonWebElement.click();
	        System.out.println("My Info button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	public void ValidateClaimPage()
	{
		  String actualCurrentClaimPageURL=driver.getCurrentUrl();
	        
	        String expectedClaimPageURL="https://opensource-demo.orangehrmlive.com/web/index.php/claim/viewAssignClaim";
	        if (expectedClaimPageURL.equalsIgnoreCase(actualCurrentClaimPageURL)) 
	        {
			System.out.println("Claim page is open successfully.");	
			} 
	        else 
	        {
			System.out.println("Claim page is not open successfully.");	
			}
	}
	
	public void handleBuzzclick() throws Exception
	{
		  WebElement  BuzzButtonWebElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[12]/a/span"));
	        
		  BuzzButtonWebElement.click();
	        System.out.println("Buzz button clicked successfully.");
	        Thread.sleep(3000);
	}
	
	public void ValidateBuzzPage()
	{
		  String actualCurrentBuzzPageURL=driver.getCurrentUrl();
	        
	        String expectedBuzzPageURL="https://opensource-demo.orangehrmlive.com/web/index.php/buzz/viewBuzz";
	        if (expectedBuzzPageURL.equalsIgnoreCase(actualCurrentBuzzPageURL)) 
	        {
			System.out.println("Buzz page is open successfully.");	
			} 
	        else 
	        {
			System.out.println("Buzz page is not open successfully.");	
			}
	}
	
	public void closeBrowser() throws Exception
	{
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Browser closed successfully.");
	}

	
	public static void main(String[] args) throws Exception {
		HRMLeftPanelFun orangetest = new HRMLeftPanelFun();
		//validation not unsuccessful
		orangetest.launchBrowser();
		orangetest.openUrl();
		orangetest.enterUserName("Admin"); 
		orangetest.enterPassWord("admin123");
		orangetest.clickOnLoginButton();
		orangetest.ValidateDashboardPage();
		orangetest.handleAdminclick();
		orangetest.ValidateAdminPage();
		orangetest.handlePIMclick();
		orangetest.ValidatePIMPage();
		orangetest.handleLeaveclick();
		orangetest.ValidateLeavePage();
		orangetest.handleTimeclick();
		orangetest.ValidateTimePage();
		orangetest.handleRecruitmentclick();
		orangetest.ValidateRecruitmentPage();
		orangetest.handleMyInfoclick();
		orangetest.ValidateMyInfoPage();
		orangetest.handlePerformanceclick();
		orangetest.ValidateMyPerformancePage();
		orangetest.handleDirectoryclick();
		orangetest.ValidateDirectoryPage();
		orangetest.handleMaintenanceclick();
		orangetest.enterPassWordForMaintenance("admin123");
		orangetest.ClickOnConfirmButton();
		orangetest.ValidateMaintenancePage();
		orangetest.handleClaimclick();
		orangetest.ValidateClaimPage();
		orangetest.handleBuzzclick();
		orangetest.ValidateBuzzPage();
		orangetest.closeBrowser();
	}
}
