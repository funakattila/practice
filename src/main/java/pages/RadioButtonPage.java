package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage extends Page{

    private final String url = "http://demo.seleniumeasy.com/basic-radiobutton-demo.html";
    private final By firstMaleButton = By.xpath("//input[@value=\"Male\" and @name=\"optradio\"]");
    private final By firstCheckButton = By.id("buttoncheck");
    private final By firstValue = By.className("radiobutton");

    private final By secondMaleButton = By.xpath("//input[@value=\"Male\" and @name=\"gender\"]");
    private final By ageButton = By.xpath("//input[@value=\"5 - 15\" and @name=\"ageGroup\"]");
    private final By secondCheckButton = By.xpath("//*[@onclick=\"getValues();\"]");
    private final By secondValue = By.className("groupradiobutton");



    public RadioButtonPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void navigate() {
        driver.navigate().to(url);
    }

    public void firstCheckMaleBtn() {
        driver.findElement(firstMaleButton).click();
    }

    public void firstCheckBtn() {
        driver.findElement(firstCheckButton).click();
    }

    public String getFirstResult() {
        return driver.findElement(firstValue).getText();
    }

    public void checkGender() {
        driver.findElement(secondMaleButton).click();
    }

    public void checkAge() {
        driver.findElement(ageButton).click();
    }

    public void secondCheckButton() {
        driver.findElement(secondCheckButton).click();
    }

    public String getSecondResult() {
        return driver.findElement(secondValue).getText();
    }


}
