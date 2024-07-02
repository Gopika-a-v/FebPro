package selii;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblocator {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test()
	{
		driver.findElement(By.id("email")).sendKeys("abc@123");
		driver.findElement(By.id("pass")).sendKeys("Ab123");
		driver.findElement(By.name("login")).click();
	}
	
}

