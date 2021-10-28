import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.MainSearchPage;
import pageObjects.TheSearchProcess;
import pageObjects.WikiPage;

import java.util.concurrent.TimeUnit;

public class VerificationOfTheSignatureOnTheSite {
    private static WebDriver driver;

    @Before
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver94.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void Close(){
        if ( driver != null )
            driver.quit();
    }

    @Test
    public void TestSite() throws InterruptedException {
        driver.get("https://www.google.com/");
        MainSearchPage mainSearchPage = new MainSearchPage(driver);
        mainSearchPage.SearchPage("Java");
        mainSearchPage.ClickButton();
        TheSearchProcess theSearchProcess = new TheSearchProcess(driver);
        theSearchProcess.RequiredPage();
        String setTextToCheck = "oracle.com/java/";
        Assert.assertEquals(setTextToCheck, new WikiPage(driver).ElementSearch());
    }
}

