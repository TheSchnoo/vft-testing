import static org.assertj.core.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestVftWebsite {

	private WebDriver driver;

	@Before
	public void setup() throws Exception {
		driver = new ChromeDriver();
	}

	@Test
	public void testHomepage() throws Exception {
		driver.get("https://foodietours.ca/");
		assertThat(driver.getTitle())
				.isEqualTo("Vancouver Foodie Tours | Tourist Attraction In Downtown Vancouver, BC");
		assertThat(((ChromeDriver) driver).findElementByClassName("home-carousel-item")
				.getAttribute("style").contains("image-homepage-promo-sample.jpg"))
				.isTrue();
		assertThat(((ChromeDriver) driver).findElementByClassName("tripadvisorpromoimg")
				.getAttribute("src").contains("icon-tripadvisor-shadow.png"))
				.isTrue();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}


//	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//
//		// And now use this to visit Google
//		driver.get("https://foodietours.ca/");
//
//		// Find the text input element by its name
//		WebElement element = driver.findElement(By.name("q"));

		// Print a Log In message to the screen
//		System.out.println("Successfully opened the website www.Store.Demoqa.com");
//
//		//Wait for 5 Sec
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		// Close the driver
//		driver.quit();

//		// Enter something to search for
//		element.sendKeys("Cheese!");
//
//		// Now submit the form. WebDriver will find the form for us from the element
//		element.submit();
//
//		// Check the title of the page
//		System.out.println("Page title is: " + driver.getTitle());

//		driver.quit();
}