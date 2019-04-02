package projecttest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test_Google_Search_Action  extends BaseActions {


    @FindBy(css = "input[name='q']")
    private WebElement inputBox_TextField;

    public Test_Google_Search_Action(WebDriver driver) {
       super(driver);
       PageFactory.initElements(driver, this);
     }

    public void Navigate_search_Page() {
        inputBox_TextField.sendKeys("ting");
        inputBox_TextField.sendKeys(Keys.ENTER);
     }
}
