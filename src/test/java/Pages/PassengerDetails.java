package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;

public class PassengerDetails  extends BaseClass {

    //Passenger Details xpath
    @FindBy(xpath="/html/body/flights-root/div/div/div/div/flights-lazy-content/flights-passengers/pax-app-container/pax-app/ry-spinner/div/div/div[2]/pax-app-form-container/pax-app-form/form/pax-passenger-container[1]/pax-passenger/div/pax-passenger-details-container/pax-passenger-details/pax-passenger-details-form-container/pax-details-form/ry-dropdown/div[2]/button")
    WebElement titleDropdown;

    @FindBy(xpath="/html/body/flights-root/div/div/div/div/flights-lazy-content/flights-passengers/pax-app-container/pax-app/ry-spinner/div/div/div[2]/pax-app-form-container/pax-app-form/form/pax-passenger-container[2]/pax-passenger/div/pax-passenger-details-container/pax-passenger-details/pax-passenger-details-form-container/pax-details-form/ry-dropdown/div[2]/button")
    WebElement title2Dropdown;


    @FindBy(xpath="/html/body/flights-root/div/div/div/div/flights-lazy-content/flights-passengers/pax-app-container/pax-app/ry-spinner/div/div/div[2]/pax-app-form-container/pax-app-form/form/pax-passenger-container[1]/pax-passenger/div/pax-passenger-details-container/pax-passenger-details/pax-passenger-details-form-container/pax-details-form/ry-dropdown/div[2]/div/div/ry-dropdown-item[1]/button/div/div[2]")
    WebElement mrTitle;

    @FindBy(xpath="/html/body/flights-root/div/div/div/div/flights-lazy-content/flights-passengers/pax-app-container/pax-app/ry-spinner/div/div/div[2]/pax-app-form-container/pax-app-form/form/pax-passenger-container[2]/pax-passenger/div/pax-passenger-details-container/pax-passenger-details/pax-passenger-details-form-container/pax-details-form/ry-dropdown/div[2]/div/div/ry-dropdown-item[2]/button/div/div[1]")
    WebElement mrsTitle;

    @FindBy(xpath="//*[@id=\"form.passengers.ADT-0.name\"]")
    WebElement p1FirstName;

    @FindBy(xpath="//*[@id=\"form.passengers.ADT-0.surname\"]")
    WebElement p1LastName;

    @FindBy(xpath="//*[@id=\"form.passengers.ADT-1.name\"]")
    WebElement p2FirstName;

    @FindBy(xpath="//*[@id=\"form.passengers.ADT-1.surname\"]")
    WebElement p2LastName;

    @FindBy(xpath="//*[@id=\"form.passengers.CHD-0.name\"]")
    WebElement p3FirstName;

    @FindBy(xpath="//*[@id=\"form.passengers.CHD-0.surname\"]")
    WebElement p3LastName;

    @FindBy(xpath="/html/body/flights-root/div/div/div/div/flights-lazy-content/ng-component/div/continue-flow-container/continue-flow/div/div/span/button")
    WebElement btnContinue;

    @FindBy(xpath = "//*[@id=\"ry-modal-portal\"]/div/seats-modal/ry-message-dialog/ry-dialog/div/div[2]/div[2]/button")
    WebElement okyContinue;

    //Choose Seats Depart Seats
     @FindBy(xpath=  "/html/body/seats-root/div/div/div/seats-container-root/seats-container-v2/main/div[2]/div[1]/div/div/div/div/div[1]/seat-map/div/div[21]/div/button[1]")
     WebElement seatOne;
     @FindBy(xpath = "/html/body/seats-root/div/div/div/seats-container-root/seats-container-v2/main/div[2]/div[1]/div/div/div/div/div[1]/seat-map/div/div[21]/div/button[2]")
     WebElement seatTwo;
     @FindBy(xpath = "/html/body/seats-root/div/div/div/seats-container-root/seats-container-v2/main/div[2]/div[1]/div/div/div/div/div[1]/seat-map/div/div[21]/div/button[3]")
     WebElement seatThree;
     @FindBy(xpath = "/html/body/seats-root/div/div/div/seats-container-root/seats-container-v2/main/div[2]/div[1]/div/div/div/div/div[2]/div/seats-actions/span/button")
     WebElement nextContinue;

     //Chooses Return Seats
     @FindBy(xpath= "/html/body/seats-root/div/div/div/seats-container-root/seats-container-v2/main/div[2]/div[1]/div/div/div/div/div[1]/seat-map/div/div[21]/div/button[1]")
     WebElement seatOner;
    @FindBy(xpath= "/html/body/seats-root/div/div/div/seats-container-root/seats-container-v2/main/div[2]/div[1]/div/div/div/div/div[1]/seat-map/div/div[21]/div/button[2]")
    WebElement seatTwor;
    @FindBy(xpath= "/html/body/seats-root/div/div/div/seats-container-root/seats-container-v2/main/div[2]/div[1]/div/div/div/div/div[1]/seat-map/div/div[21]/div/button[3]")
    WebElement seatThreer;

    //Continue to Luggage
    @FindBy(xpath = "/html/body/seats-root/div/div/div/seats-container-root/seats-container-v2/main/div[2]/div[1]/div/div/div/div/div[2]/div/seats-actions/span/button")
    WebElement continuePage;
    @FindBy(xpath = "/html/body/seats-root/personalization-takeovers/ry-message-renderer[3]/hero-loader-with-data/ng-component/ry-enhanced-takeover-beta-desktop/div/div[3]/div[2]/div[1]/button")
    WebElement noThankyou;

    @FindBy(xpath="//label[@class='ry-radio-circle-button__label']")
    WebElement smallBag;

    //Continue to finish Page
    @FindBy(xpath = "/html/body/bags-root/bags-booking-container/div/main/div/section[4]/bags-continue-flow-container/bags-continue-flow/button")
    WebElement continueForward;
    @FindBy(xpath = "/html/body/bags-root/bags-booking-container/div/bags-enhanced-takeovers/ry-message-renderer[1]/hero-loader-with-data/ng-component/ry-enhanced-takeover-desktop/div/div[3]/button[2]")
    WebElement againNothanks;

    @FindBy(xpath="//button[contains(text(),'Continue')]")
    WebElement followingPage;
    @FindBy(xpath="//button[contains(text(),'Continue')]")
    WebElement finishPage;
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement finalPage;


    //Passenger Details
    public PassengerDetails() {
        PageFactory.initElements(driver, this);
    }
    public void mrTitle(){
        titleDropdown.click();
        mrTitle.click();
    }

    public void passengerOne(String strArg1,String strArg2){
        p1FirstName.click();
        p1FirstName.sendKeys(strArg1);
        p1LastName.click();
        p1LastName.sendKeys(strArg2);
    }
    public void mrsTitle(){
        title2Dropdown.click();
        mrsTitle.click();
    }
    public void passengerTwo(String strArg1,String strArg2){
        p2FirstName.click();
        p2FirstName.sendKeys(strArg1);
        p2LastName.click();
        p2LastName.sendKeys(strArg2);
    }

    public void passengerThree(String strArg1, String strArg2){
        p3FirstName.click();
        p3FirstName.sendKeys(strArg1);
        p3LastName.click();
        p3LastName.sendKeys(strArg2);
    }

    public void continueNext(){
        btnContinue.click();
    }
    public void okayGotit(){
        okyContinue.click();
    }
    public void chooseSeats(){
        seatOne.click();
        seatTwo.click();
        seatThree.click();
    }

    public  void nextContinue(){
        nextContinue.click();
    }
    public void returnSeats(){
        seatOner.click();
        seatTwor.click();
        seatThreer.click();
    }

    public void continuePage(){
       continuePage.click();
    }

    public void noThanks(){
        noThankyou.click();
    }

    public  void smallBag(){

        smallBag.click();
    }

    public void continueForward(){
      continueForward.click();
    }

    public  void againNothanks(){
        againNothanks.click();
    }

    public  void followingPage() { followingPage.click();}

    public  void finalPage(){
        finalPage.click();
    }

    public  void finishPage(){
        finishPage.click();
    }

}

