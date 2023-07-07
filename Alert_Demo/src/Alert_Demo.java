import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;	
import org.openqa.selenium.Alert;
import java.util.*;

public class Alert_Demo {
	public static void main(String args[]) {
		
		System.out.println("Hello World");
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","Z:\\y20cs179\\SOC Automation testing\\Browser\\chromedriver.exe");
		
		//driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.get("C:\\Users\\exam2\\eclipse-workspace\\Alert_Demo\\src\\alter_ex.html");
		
	    // Alert  	
        driver.findElement(By.name("cusid")).sendKeys("Satya");					
        driver.findElement(By.name("alert")).click();
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println("Alert text : "+text);
        alert.accept();
        
        //Confirm
        driver.findElement(By.name("confirm")).click();
        String text1 = alert.getText();
        System.out.println("Confirm text : "+text1);
        //Press the Cancel button
        alert.dismiss();
        
        
        //Prompt
        driver.findElement(By.name("prompt")).click();
        String text2 = alert.getText();
        alert.sendKeys("Selenium");
        System.out.println("Prompt text : "+text2);
        alert.accept();
        
        
		  
	}

}