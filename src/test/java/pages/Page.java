package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;


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
        Thread.sleep(1000);
    }

    public void recommendedFridge() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[data-testid ='add-to-basket-button']")).click();
        Thread.sleep(1000);
    }

    public void shoppingBasket() throws InterruptedException {
        String shoppingBasketUrl = driver.getCurrentUrl();
        Assert.assertEquals(shoppingBasketUrl, "https://checkout.ao.com/shoppingbasket.aspx" );
        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("[data-tag-bundle ='Complete']")).click();
        driver.findElement(By.cssSelector("[data-tag-action ='continue']")).click();

    }
}




