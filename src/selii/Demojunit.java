package selii;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demojunit {
	ChromeDriver driver;
	@Before
	public void setup()
	{
	    driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void test()
	{
		driver.getTitle();
	}

}
