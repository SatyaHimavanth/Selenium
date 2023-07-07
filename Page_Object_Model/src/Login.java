import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * Tests login feature
 */
public class Login {

  public void testLogin() {
	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "Z:\\y20cs179\\SOC Automation testing\\Browser\\chromedriver.exe");	
	    
    // fill login data on sign-in page
    driver.findElement(By.name("user_name")).sendKeys("userName");
    driver.findElement(By.name("password")).sendKeys("my supersecret password");
    driver.findElement(By.name("sign-in")).click();
    
    // verify h1 tag is "Hello userName" after login
    driver.findElement(By.tagName("h1")).isDisplayed();
    assertThat(driver.findElement(By.tagName("h1")).getText(), is("Hello userName"));
  }
}
