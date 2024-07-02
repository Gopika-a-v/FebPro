package selii;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {
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
		//relative xpath
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("adfghjkl");
	// absalute xpath
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hiu");
	}

}

// ---home work---
//open amazon.in site
//enter the mobiles in the search bar
//click cart 
// click helo sign in
// enter an in valid mail id  click conitude then navigate to back page 
  // driver.navigate().back(); navigate code
//doing xpath
// poseing code  Thread.sleep(1000);
// driver.manage().window().maximize();   window maximizeing code

