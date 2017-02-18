package testermainpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by nkramarenko on 2/18/2017.
 */
public interface PageObj {

    public WebDriver returnDriver();
    public PageObj open(String url);
    public void clickElement(WebElement element);
}
