package selii;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemopgm {
	//ChromeDriver driver;
	@Before
	public void setup()
	{
		System.out.println("browser open");
	    //driver=new ChromeDriver();
		//driver.get("https://www.google.com");
	}
	@Test
	public void test()
	{
		//driver.getTitle();
		//System.out.println("test activity");
	}
	@After
	public void browserclose()
	{
		System.out.println("browser close");
	}

}
