import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.MainSearchPage;
import pageObjects.TheSearchProcess;
import pageObjects.WikiPage;

import java.util.concurrent.TimeUnit;

public class Main {
    static WebDriver driver;
    public static void main(String[] arg){
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver94.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.google.com/");
            MainSearchPage mainSearchPage = new MainSearchPage(driver);
            mainSearchPage.SearchPage("Java");
            mainSearchPage.ClickButton();
            TheSearchProcess theSearchProcess = new TheSearchProcess(driver);
            theSearchProcess.RequiredPage();
            String setTextToCheck = "oracle.com/java/";
            Assert.assertEquals(setTextToCheck, new WikiPage(driver).ElementSearch());
        } finally {
            driver.quit();
        }
    }
}
