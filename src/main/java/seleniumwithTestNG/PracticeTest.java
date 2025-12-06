package seleniumwithTestNG;
	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.AfterClass;

	public class PracticeTest {
	  @Test
	  public void testcase1() {
		  System.out.println("testone");
	  }
	  
	  @Test
	  public void testcase2() {
		  System.out.println("testtwo");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("@BeforeMethod");
	  }

	  @AfterMethod
	  public void afterMethod() {
		    
		  System.out.println("@AfterMethod");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("@BeforeClass");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("@AfterClass");
	  }

	}


}
