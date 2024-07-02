package selii;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleLocator {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.blazedemo.com");
		driver.get("https://www.blazedemo.com/register");
	}
	@Test
	public void test()
	{
		driver.findElement(By.name("name")).sendKeys("Ammu");
		driver.findElement(By.id("company")).sendKeys("xyz");
		driver.findElement(By.id("email")).sendKeys("ammu@123");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("password_confirmation")).sendKeys("abc123");
		
	}

}
