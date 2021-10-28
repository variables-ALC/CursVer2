package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainSearchPage{
    WebDriver driver;

    public MainSearchPage(WebDriver driver){this.driver = driver;}

    public void SearchPage(String value){
        driver.findElement(By.xpath("//input[@title= 'Поиск']")).sendKeys(value);
    }

    public void ClickButton(){
        driver.findElement(By.xpath("//ul/li[@data-view-type][1]")).click();
    }

}

