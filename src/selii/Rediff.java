package selii;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test() 
	{
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("ajikm");
		driver.findElement(By.xpath("//table@[id='tb1crtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("abc123");
		driver.findElement(By.xpath("//table[@id='tb1crtac']/tbody/tr[7]/td[3]/input[2]")).click();
	}
		
}
