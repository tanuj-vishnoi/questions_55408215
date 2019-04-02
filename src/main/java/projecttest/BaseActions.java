package projecttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseActions {
	WebDriver driver;

	public BaseActions(WebDriver driver) {
		this.driver = driver;
	}

	public void launchApplication(String baseUrl) {
		System.out.println("URL:" + baseUrl);
		driver.get(baseUrl);
	}

	public void end_All_The_Browser_session() {
		driver.quit();
	}

}