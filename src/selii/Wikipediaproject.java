package selii;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class Wikipediaproject {
	
	    WebDriver driver;

	    @Before
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.get("https://www.wikipedia.org/");
	    }

	    @Test
	    public void testSearchArticle() {
	        // Locate the search bar and enter a query
	        WebElement searchBar = driver.findElement(By.id("searchInput"));
	        searchBar.sendKeys("Selenium (software)");
	        searchBar.submit();

	        // Verify the search results
	        WebElement heading = driver.findElement(By.id("firstHeading"));
	        assertTrue(heading.getText().contains("Selenium (software)"));
	    }

	    @After
	    public void tearDown() {
	        driver.quit();
	    }
	    @Test
	    public void testArticleContent() {
	        // Search for the article as in the previous test
	        WebElement searchBar = driver.findElement(By.id("searchInput"));
	        searchBar.sendKeys("Selenium (software)");
	        searchBar.submit();

	        // Verify the presence of the expected headings
	        WebElement historyHeading = driver.findElement(By.id("History"));
	        assertTrue(historyHeading.isDisplayed());
	    }
	    @Test
	    public void testLanguageSelection() {
	        // Select Franicais from the language options
	        WebElement FranicaisLink = driver.findElement(By.id("js-link-box-fr"));
	        FranicaisLink.click();

	        // Verify the page is displayed in Franicais
	        WebElement mainPage = driver.findElement(By.id("Article_labellisé_du_jour"));
	        assertTrue(mainPage.isDisplayed());
	    }

	 }


	


	
