package selii;

import org.openqa.selenium.chrome.ChromeDriver;

public class Googledemo {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	    String actualtitle=driver.getTitle();    //title verification 
		String expect="Google";
		if(actualtitle.equals(expect))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		String actualcontent=driver.getPageSource();  //page source verification
		if(actualcontent.contains("Gmail"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.close();   // closed only present opening windows
		//driver.quit(); closed opening all  multiple windows 

	}

}
