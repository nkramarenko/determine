package testermainpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by nkramarenko on 2/16/2017.
 */
public class ChapterOne {

    @FindBy(how = How.XPATH, xpath = "//*/div[2]/p[4]/a")
    WebElement homePageLink;

    @FindBy(how=How.ID, id = "divontheleft")
    WebElement assertText;

    WebDriver webDriver;

    public ChapterOne(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebDriver returnDriver() {

        return webDriver;
    }

    public void clickElement(WebElement element) {
        element.click();
    }
}