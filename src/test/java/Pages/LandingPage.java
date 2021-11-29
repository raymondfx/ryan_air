package Pages;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseClass;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class LandingPage extends BaseClass {
    //
    @FindBy(xpath = "//*[@id=\"input-button__departure\"]")
    WebElement departure;

    @FindBy(id = "input-button__destination")
    WebElement destination;

    @FindBy(xpath = "//div[@data-id='']")
    WebElement departDate;

    @FindBy(xpath="//div[contains(text(),'Choose date')]")
    WebElement dateField;

    @FindBy(xpath="//*[@id=\"ry-tooltip-8\"]/div[2]/hp-app-controls-tooltips/fsw-controls-tooltips-container/fsw-controls-tooltips/fsw-passengers-container/fsw-passengers/fsw-passengers-picker-container/fsw-passengers-picker/ry-counter[1]/div[2]/div[3]")
    WebElement addAdult;

    @FindBy(xpath="//*[@id=\"ry-tooltip-8\"]/div[2]/hp-app-controls-tooltips/fsw-controls-tooltips-container/fsw-controls-tooltips/fsw-passengers-container/fsw-passengers/fsw-passengers-picker-container/fsw-passengers-picker/ry-counter[3]/div[2]/div[3]")
    WebElement addChild;

    @FindBy(xpath="/html/body/hp-app-root/hp-home-container/hp-home/hp-search-widget-container/hp-search-widget/div/hp-flight-search-widget-container/fsw-flight-search-widget-container/fsw-flight-search-widget/div/div/div/button")
    WebElement searchButton;


    WebDriverWait wait = new WebDriverWait(driver, 10);
    //Initializing the Page Objects:
    public LandingPage() {
        PageFactory.initElements(driver, this);
    }

    //Actions:
    public static void runURL(String url){
        driver.get(url);
    }

    public static void selectCookieOption(String strArg1) {
        buttonContainsText(strArg1).click();
    }

    public void enterDeparture(String strArg1, String strArg2) throws InterruptedException {
        departure.click();
        spanContainsText(strArg1).click();
        spanContainsText(strArg2).click();
    }

    public void enterDestination(String strArg1, String strArg2){
        destination.click();
        spanContainsText(strArg1).click();
        spanContainsText(strArg2).click();
    }

    public void departDate(String strArg1) throws InterruptedException {
        //WebElement departureDate = driver.findElement(By.xpath("//div[@data-id='"+strArg1+"']"));
        dateField.click();
        Thread.sleep(2000);
        //WebElement departureDate = driver.findElement(By.xpath("//div[@data-id='2021-11-06']"));
        WebElement departureDate = driver.findElement(By.xpath("//div[@data-id='"+strArg1+"']"));
        departureDate.click();
    }
    public void returnDate(String strArg1) throws InterruptedException {
        //WebElement departureDate = driver.findElement(By.xpath("//div[@data-id='"+strArg1+"']"));
        dateField.click();
        Thread.sleep(2000);
        //WebElement departureDate = driver.findElement(By.xpath("//div[@data-id='2021-11-06']"));
        WebElement returnDate = driver.findElement(By.xpath("//div[@data-id='"+strArg1+"']"));
        returnDate.click();
    }

    public void selectPassengers() throws InterruptedException {
        Thread.sleep(2000);
        addAdult.click();
        addChild.click();
    }

    public void clickSearch() {
        searchButton.click();

    }

}
