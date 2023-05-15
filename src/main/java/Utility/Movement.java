package Utility;


import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Movement {

    public static final Logger log = Logger.getLogger(String.valueOf(Movement.class));
    Driver objectdriver = new Driver();
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    public void startDriver() {
        driver = objectdriver.startDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(200));
        actions = new Actions(driver);
    }

    public void endDriver() {
        objectdriver.closeDriver();
    }

    public void clickFunction(By element) {
        if (elementIsFind(element)) {
            WebElement webElement = driver.findElement(element);
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            webElement.click();
        } else {
            Assert.fail();
        }
    }

    public void sendKeysFunction(By element, String value) {
        if (elementIsFind(element)) {
            WebElement webElement = driver.findElement(element);
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            webElement.sendKeys(value);
        } else {
            Assert.fail();
        }
    }

    public void presEnter(By element) {
        if (elementIsFind(element)) {
            WebElement webElement = driver.findElement(element);
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            webElement.sendKeys(Keys.ENTER);
        } else {
            Assert.fail();
        }

    }

    public void AssertFunction(By element, String expectedText) {
        if (elementIsFind(element)) {
            WebElement webElement = driver.findElement(element);
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            Assert.assertEquals(webElement.getText(), expectedText);
        } else {
            Assert.fail();
        }
    }

    public void selectElementFromDropdown(By element, String text) {
        if (elementIsFind(element)) {
            WebElement webElement = driver.findElement(element);
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            Select slc = new Select(webElement);
            slc.selectByVisibleText(text);
        } else {
            Assert.fail();
        }
    }

    public void scroll() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
    }

    public void scrollByCount(int number) {
        for (int i = 0; i < number; i++) {
            scroll();
        }
    }

    public void isElementExist(By element) {
        try {
            driver.findElement(element);
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        } catch (Exception e) {
            log.info("Element Bulunamadı!");
            Assert.fail();
        }
    }

    public boolean elementIsFind(By element) {
        try {
            driver.findElement(element);
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            return true;
        } catch (Exception e) {
            log.info("Element Bulunamadı!");
            return false;
        }
    }

    public boolean isElementPresentWait(By by) {
        try {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.findElement(by);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            return true;
        } catch (Exception e) {
            log.info("Element bulunamadı");
            Assert.fail();
            return false;
        }
    }

}
