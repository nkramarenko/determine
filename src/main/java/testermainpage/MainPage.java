package testermainpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by nkramarenko on 2/16/2017.
 */
public class MainPage {

    @FindBy(how = How.XPATH, xpath = "//*/div[2]/ul/li[1]/a")
    WebElement chapterOnelink;

    @FindBy(how = How.XPATH, xpath = "//*/div[2]/p[4]/a")
    WebElement homePageLink;

    @FindBy(how=How.ID, id = "divontheleft")
    WebElement assertText;

    WebDriver webDriver;
    String url;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void close() {
        webDriver.close();
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
