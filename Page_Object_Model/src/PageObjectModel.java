import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
public class PageObjectModel {
	
	  @Test
	public void testLogin() {
	    // fill login data on sign-in page
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "Z:\\y20cs179\\SOC Automation testing\\Browser\\chromedriver.exe");
		driver.get("Z:\\y20cs179\\SOC Automation testing\\login_page.html");
	    driver.findElement(By.name("user_name")).sendKeys("username");
	    driver.findElement(By.name("password")).sendKeys("password");
	    driver.findElement(By.name("sign_in")).click();

	    // verify h1 tag is "Hello userName" after login
	    driver.findElement(By.tagName("h1")).isDisplayed();
	    String text = driver.findElement(By.tagName("h1")).getText();
	    if(text=="Hello User"){
	    	System.out.println("New page Opened");
	    }
	}
}
*/

/***
 * Tests login feature
 */
public class PageObjectModel {

  @Test
  public void testLogin() {
	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "Z:\\y20cs179\\SOC Automation testing\\Browser\\chromedriver.exe");	
    SignInPage signInPage = new SignInPage(driver);
    HomePage homePage = signInPage.loginValidUser("username", "password");
    assertThat(homePage.getMessageText(), is("Hello User"));
  }
}
