package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;

public class PassengerDetails  extends BaseClass {


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

    //Choose Seats
     @FindBy(xpath=  "/html/body/seats-root/div/div/div/seats-container-root/seats-container-v2/main/div[2]/div[1]/div/div/div/div/div[1]/seat-map/div/div[21]/div/button[1]")
     WebElement seatOne;
     @FindBy(xpath = "/html/body/seats-root/div/div/div/seats-container-root/seats-container-v2/main/div[2]/div[1]/div/div/div/div/div[1]/seat-map/div/div[21]/div/button[2]")
     WebElement seatTwo;
     @FindBy(xpath = "/html/body/seats-root/div/div/div/seats-container-root/seats-container-v2/main/div[2]/div[1]/div/div/div/div/div[1]/seat-map/div/div[21]/div/button[3]")
     WebElement seatThree;

     @FindBy(xpath = "/html/body/seats-root/div/div/div/seats-container-root/seats-container-v2/main/div[2]/div[1]/div/div/div/div/div[2]/div/seats-actions/span/button")
     WebElement nextContinue;
     @FindBy(xpath= "/html/body/seats-root/div/div/div/seats-container-root/seats-container-v2/main/div[2]/div[1]/div/div/div/div/div[1]/seat-map/div/div[21]/div/button[1]")
     WebElement seatOner;

    @FindBy(xpath= "/html/body/seats-root/div/div/div/seats-container-root/seats-container-v2/main/div[2]/div[1]/div/div/div/div/div[1]/seat-map/div/div[21]/div/button[1]")
    WebElement seatTwor;
    @FindBy(xpath= "/html/body/seats-root/div/div/div/seats-container-root/seats-container-v2/main/div[2]/div[1]/div/div/div/div/div[1]/seat-map/div/div[21]/div/button[1]")
    WebElement seatThreer;


    //nextflight
    ///html/body/seats-root/div/div/div/seats-container-root/seats-container-v2/main/div[2]/div[1]/div/div/div/div/div[2]/div/seats-actions/span/button

    //continuue
    ///html/body/seats-root/div/div/div/seats-container-root/seats-container-v2/main/div[2]/div[1]/div/div/div/div/div[2]/div/seats-actions/span/button

    //return
    // *[@id="seat-05A"]/div
    //*[@id="seat-05B"]/div
    //*[@id="seat-05C"]/div

    //continue


    //no thanks
   // /html/body/seats-root/personalization-takeovers/ry-message-renderer[3]/hero-loader-with-data/ng-component/ry-enhanced-takeover-beta-desktop/div/div[3]/div[2]/div[1]/button
  //small bag
    ///html/body/bags-root/bags-booking-container/div/main/div/section[1]/div/bags-cabin-lazy-bag/bags-cabin-bag-section/bags-bag-layout/div/div[3]/div[2]/bags-pax-table-journey-container/div/div/bags-cabin-bag-table-controls-container/bags-cabin-bag-table-controls/div[1]/bags-small-bag-pax-control/div/bags-product-selector/div/div/div[1]/ry-radio-circle-button/label/div
    //continue
    ///html/body/bags-root/bags-booking-container/div/main/div/section[4]/bags-continue-flow-container/bags-continue-flow/button

    //continue
    ///html/body/app-root/ng-component/div/div/div/main/div/button

    //continue
    ///html/body/app-root/ng-component/div/div/div/main/div/ng-component/button

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

}

