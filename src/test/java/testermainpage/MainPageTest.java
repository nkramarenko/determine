package testermainpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webdriver.CustomWait;
import webdriver.DriverTemplate;
import static org.testng.Assert.*;

/**
 * Created by nkramarenko on 2/16/2017.
 */
public class MainPageTest {

    MainPage page;
    private String url = "http://book.theautomatedtester.co.uk/";
    CustomWait wait = new CustomWait();
    WebDriver chromeDriver = DriverTemplate.chromeDriver();
    String stringToCompare = "Assert that this text is on the page";
    @BeforeClass
    public void beforeClass() {
        page = PageFactory.initElements(chromeDriver, MainPage.class);
    }

    @Test
    public void testOpen() throws Exception {

        //opening page
        page.open(url);
        //waiting for element to sure page is loaded
        wait.simpleWaitByXpath(page.returnDriver(), "//*/div[1]");
        //displaying page to user
        wait.timeWait();
        //clicking on Chapter One link
        page.clickElement(page.chapterOnelink);
        //waiting for element to sure page is loaded
        wait.simpleWaitByXpath(page.returnDriver(), "//*[@id='divontheleft']");
        //verifying presence of the text
        assertEquals(page.assertText.getText(), stringToCompare);
        //displaying page to user
        wait.timeWait();
        //clicking on Home page link
        page.clickElement(page.homePageLink);
        //displaying page to user
        wait.timeWait();
    }

    @AfterClass
    public void afterMethod() {
        chromeDriver.quit();
    }
}