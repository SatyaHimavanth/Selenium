import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Demo1 {
    public String baseUrl = "https://www.google.com/";
    String driverPath = "Z:\\y20cs179\\SOC Automation testing\\Browser\\chromedriver.exe";
    WebDriver driver;
    MessageUtil messageUtil = new MessageUtil("Test method");
    
	@Test
	public void verifyHomepageTitle() {
	     
	    System.out.println("launching chrome browser"); 
	    WebDriver driver = new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver", driverPath);
	    driver.get(baseUrl);
	    String expectedTitle = "Google";
	    String actualTitle = driver.getTitle();
	    Assert.assertEquals(actualTitle, expectedTitle);
	    driver.close();
	}
	
	
	/*
	@BeforeTest
    public void launchBrowser() {
        System.out.println("launching chrome browser"); 
        driver = new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver", driverPath);
        driver.get(baseUrl);
    }

    @Test
    public void verifyHomepageTitle() {
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @AfterTest
    public void terminateBrowser(){
        driver.close();
    }
    */
    
    /*
    @BeforeClass
    public void beforeClass(){
      System.out.println("Before Class method");
    }
    @Test
    public void testMethod(){
      Assert.assertEquals("Test method", messageUtil.printMessage());
    }
    @AfterClass
    public void afterClass() {
    	System.out.println("After Class method");
    }
    */
    
    // run testxg_suite.xml
    
    
    
}