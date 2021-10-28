package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TheSearchProcess {
    WebDriver driver;

    private By elementSearchJava = By.xpath("//a[@href='https://www.oracle.com/java/']");


    public TheSearchProcess(WebDriver driver) { this.driver = driver; }

    public void RequiredPage() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='https://ru.wikipedia.org/wiki/Java']/div")).click();
    }

}

