package pages;

import org.openqa.selenium.By;
import utils.Driver;
import org.openqa.selenium.WebDriver;


public class Page {

    private WebDriver driver = Driver.getDriver();

    public void getUrl(final String url) {
        driver.navigate().to(url);
    }

    public void searchbarWebsite(final String search) throws InterruptedException {
        driver.findElement(By.id("siteSearch-input")).sendKeys(search);
    }

    public void searchWebsite() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("siteSearch-item-0")).click();
    }

    public void pickSamsungCheckbox() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Samsung']")).click();
        Thread.sleep(2000);
    }
}




