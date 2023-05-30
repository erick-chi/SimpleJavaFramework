package Abstracts;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class Common extends BaseTest {
    public WebElement waitForElement(By locator, int timeoutSeconds, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public <T extends By> WebElement findElement(T locator) {
        return driver.findElement(locator);
    }

    public <T extends By> List<WebElement> findElements(T locator) {
        return driver.findElements(locator);
    }

    public WebElement findElement(By locator, int timeoutSeconds) {
        return waitForElement(locator, timeoutSeconds, driver);
    }


    public static void Sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
