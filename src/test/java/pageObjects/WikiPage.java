package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WikiPage {
    WebDriver driver;

    private By elementSearchJava = By.xpath("//a[@href='https://www.oracle.com/java/']");


    public WikiPage(WebDriver driver) { this.driver = driver; }


    public String ElementSearch(){
        return driver.findElement(elementSearchJava).getText();
    }
}

