package pages;

import org.openqa.selenium.By;
import utils.Driver;
import org.openqa.selenium.WebDriver;


public class Page {

    private WebDriver driver = Driver.getDriver();

    public void getUrl(final String url) {
        driver.navigate().to(url);
    }

    public void getWebElement(final String search) throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys(search);
        Thread.sleep(10000);
    }
}


