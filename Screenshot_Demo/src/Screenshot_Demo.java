import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import java.io.*;
import org.openqa.selenium.*;

public class Screenshot_Demo {

	public static void main(String[] args)throws IOException {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "Z:\\y20cs179\\SOC Automation testing\\Browser\\chromedriver.exe");
		driver.get("https://www.google.com/");
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./image.png"));
	}
}