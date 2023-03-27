package Automation;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import dev.failsafe.internal.util.Assert;

public class Amazon 
{
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	System.out.println("hello");
	System.setProperty("webdriver.chrome.driver", "/home/active30/Downloads/chromedriver_linux64 (1)/chromedriver");
    driver=new ChromeDriver();
	driver.manage().window().maximize();
	}
	@Test
	public void test1()
	{
    driver.get("https://www.active.agency/DigitalMarketing");
    }
	
	@Test
	public void mouseovertest() throws InterruptedException
	{
    WebElement ele = driver.findElement(By.xpath("//span[.='Services']"));    
    Thread.sleep(2000);
    Actions act = new Actions(driver);
    act.moveToElement(ele).build().perform();
    
	}
	
	@Test
	
	public void test()
	{
		 boolean img = driver.findElement(By.xpath("/html/body/section/div[2]/div")).isDisplayed();
		 Assert.assertTrue(img);
		 
	}
	                                                    	
}
