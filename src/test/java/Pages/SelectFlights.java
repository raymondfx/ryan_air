package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;

import java.util.List;

public class SelectFlights extends BaseClass {

    @FindBy(xpath = "/html/body/flights-root/div/div/div/div/flights-lazy-content/flights-summary-container/flights-summary/div/div[2]/journey-container/journey/div/div[2]/div/carousel-container/carousel/div/ul/li[3]/carousel-item/button/div[1]/div[1]/span[1]")
    WebElement returnDate;

    @FindBy(xpath = "/html/body/flights-root/div/div/div/div/flights-lazy-content/flights-summary-container/flights-summary/div/div[2]/journey-container/journey/flight-list/div/flight-card/div/div/div[1]/div/flight-info/div[2]")
    WebElement selectFlight;

    @FindBy(xpath = "//span[contains(text(),'Continue for')]")
    WebElement tarifaValue;

    @FindBy(xpath = "//*[@id=\"ry-modal-portal\"]/div/fare-upgrade-container/fare-upgrade-component/ry-dialog/div/div/div[3]/button[2]")
    WebElement selectFare;

    @FindBy(xpath = "/html/body/flights-root/div/div/div/div/flights-lazy-content/flights-passengers/pax-app-container/pax-app/ry-spinner/ry-login-touchpoint-container/ry-login-touchpoint/div/button/div/span")
    WebElement loginLater;

    public SelectFlights() {
        PageFactory.initElements(driver, this);
    }

    public void changeDeparture(String  strArg1) throws InterruptedException {
        Thread.sleep(2000);
        WebElement slider = driver.findElement(By.xpath("//button[@aria-label='Search next dates']"));
        //List<WebElement> changeDeparture = driver.findElements(By.xpath("//button[@data-ref ='"+strArg1+"']"));
        slider.click();
        Thread.sleep(2000);
        if(driver.findElements(By.xpath("//button[@data-ref ='"+strArg1+"']")).size()>0){
            driver.findElements(By.xpath("//button[@data-ref ='"+strArg1+"']")).get(0).click();
        }
        else {
            changeDeparture(strArg1);
        }

    }
    public void availableFlight() throws InterruptedException {
        //availableFlight.click();
        divContainsText("Flight no.").click();
        Thread.sleep(2000);

    }

    public void changeReturn(){

        returnDate.click();
    }

    public void availableFlight2(){

        selectFlight.click();
    }

    public  void tarifaValue(){
        tarifaValue.click();
    }

    public void selectFare(){
        selectFare.click();
    }
    public void loginLater(){
        loginLater.click();

    }

}
