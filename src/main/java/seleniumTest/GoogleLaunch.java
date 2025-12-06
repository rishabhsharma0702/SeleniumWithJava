package seleniumTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleLaunch {
	public static void main(String[] args) throws Exception {
       ChromeDriver driver=new ChromeDriver();
       
       driver.get("https://www.google.com/");
       
       
       driver.manage().window().maximize();
       
       Thread.sleep(5000);
       
       String titleValue=   driver.getTitle();
       
       System.out.println("Current page title:--->"+titleValue);
       
       driver.quit();

	}

}
