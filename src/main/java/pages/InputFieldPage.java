package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputFieldPage extends Page{

    private final String url = "http://demo.seleniumeasy.com/basic-first-form-demo.html";
    private final By closeButton = By.id("at-cv-lightbox-close");

    private final By sum1Field = By.id("sum1");

    private final By sum2Field = By.id("sum2");

    private final By getTotalButton = By.xpath("//*[@id=\"gettotal\"]//button");

    private final By value = By.id("displayvalue");

    public InputFieldPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    @Step("Navigate to the page")
    public void navigate() {
        driver.navigate().to(url);
    }

    @Step("Close the popup window")
    public void closePopUp() {
        driver.findElement(closeButton).click();
    }

    @Step("Try to add the two values")
    public void addNumbers(String a, String b) {
        driver.findElement(sum1Field).sendKeys(a);
        driver.findElement(sum2Field).sendKeys(b);
        driver.findElement(getTotalButton).click();
    }

    @Step("Get the value")
    public String value() {
        return driver.findElement(value).getText();
    }

}
