package projecttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class TestClass {

	@Test
	public void test() {
		WebDriver driver = getChromeDriver();
		Test_Google_Search_Action actions = new Test_Google_Search_Action(driver);
		actions.launchApplication("https://www.google.com/");
		actions.Navigate_search_Page();
	}

	private WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanujkumarvishnoi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		options.addArguments("test-type");
		options.addArguments("--disable-application-cache");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		return new ChromeDriver(cap);
	}

}
