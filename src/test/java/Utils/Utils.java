package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utils {

    public boolean isDisplayed(WebDriver driver, String xpath){
        boolean value = driver.findElement(By.xpath(xpath)).isDisplayed();
        return value;
    }

    public WebElement getElementByXpath(WebDriver driver, String xpath){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated (By.xpath(xpath)));
        return driver.findElement(By.xpath(xpath));
    }
    public WebDriver getUrl(WebDriver driver){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");
        return driver;
    }
}
