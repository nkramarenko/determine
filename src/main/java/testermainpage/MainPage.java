package testermainpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by nkramarenko on 2/16/2017.
 */
public class MainPage implements PageObj{

    @FindBy(how = How.XPATH, xpath = "//*/div[2]/ul/li[1]/a")
    WebElement chapterOnelink;

    WebDriver webDriver;

    public MainPage(WebDriver webDriverInput) {
        PageFactory.initElements(webDriverInput, this);
        this.webDriver = webDriverInput;
    }

    public MainPage open(String url) {
        webDriver.get(url);
        return this;
    }

    public WebDriver returnDriver() {
        return webDriver;
    }

    public void clickElement(WebElement element) {
        element.click();
    }
}
