package Steps;

import java.io.IOException;

import Pages.LandingPage;
import Pages.PassengerDetails;
import Pages.SelectFlights;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import utils.BaseClass;


public class steps extends BaseClass {

    public static sharedatastep sharedata;
    LandingPage landingPage;
    SelectFlights selectFlights;
    PassengerDetails passengerDetails;



    public steps(sharedatastep sharedata) throws Exception {
        steps.sharedata = sharedata;
    }

    @Before()
    public void setUp() throws IOException {
        initialization();
        landingPage = new LandingPage();
        selectFlights = new SelectFlights();
        passengerDetails = new PassengerDetails();

    }

    @Given("^User navigates to the page \"([^\"]*)\"$")
    public void user_navigates_to_the_page_something(String strArg1) throws Throwable {
        LandingPage.runURL(strArg1);
    }

    @When("^user selects an action on cookie popup \"([^\"]*)\"$")
    public void user_selects_an_action_on_cookie_popup_something(String strArg1) throws Throwable {
        landingPage.selectCookieOption(strArg1);
    }

    @And("^User selects departure \"([^\"]*)\" airport \"([^\"]*)\"$")
    public void user_selects_departure_something_airport_something(String strArg1, String strArg2) throws Throwable {
        landingPage.enterDeparture(strArg1,strArg2);
    }

    @And("^User selects destination \"([^\"]*)\" airport \"([^\"]*)\"$")
    public void user_selects_destination_something_airport_something(String strArg1, String strArg2) throws Throwable {
        landingPage.enterDestination(strArg1,strArg2);
    }

    @And("^selects Depart date \"([^\"]*)\"$")
    public void selects_depart_date_something(String strArg1) throws Throwable {
        landingPage.departDate(strArg1);
    }

    @And("^selects Return date \"([^\"]*)\"$")
    public void selects_return_date_something(String strArg1) throws Throwable {
        landingPage.returnDate(strArg1);
    }

    @And("^User selects  Passengers Two Adults and One Child$")
    public void user_selects_passengers_two_adults_and_one_child() throws Throwable {
        landingPage.selectPassengers();
    }

    @And("^User clicks on Search button$")
    public void user_clicks_on_search_button() throws Throwable {
        landingPage.clickSearch();
    }

    @Then("^User changes the departure date to \"([^\"]*)\"$")
    public void user_changes_the_departure_date_to_something(String strArg1) throws Throwable {
        selectFlights.changeDeparture(strArg1);
    }

    @And("^User selects flight$")
    public void user_selects_flight() throws Throwable {
        selectFlights.availableFlight();
        Thread.sleep(2000);
    }
    @And("^User changes the return date to \"([^\"]*)\"$")
    public void user_changes_the_return_date_to_something(String strArg1) throws Throwable {
        selectFlights.changeReturn();
    }

    @And("^User selects flight2$")
    public void user_selects_flight2() throws Throwable {
        selectFlights.availableFlight2();
        Thread.sleep(2000);
    }

    @Then("^User Selects Tarifa Value$")
    public void user_selects_tarifa_value() throws Throwable {
        selectFlights.tarifaValue();
        Thread.sleep(2000);
    }
    @And("^Click continue$")
    public void click_continue() throws Throwable {
        selectFlights.selectFare();
        Thread.sleep(2000);
    }

    @And("^Continue without login$")
    public void continue_without_login() throws Throwable {
        selectFlights.loginLater();
        Thread.sleep(2000);
    }
    @When("^User selects Title dropdown$")
    public void user_selects_title_dropdown() throws Throwable {
        passengerDetails.mrTitle();
    }

    @Then("^User enters Passenger 1 FirstName as \"([^\"]*)\" and LastName as \"([^\"]*)\"$")
    public void user_enters_passenger_1_firstname_as_something_and_lastname_as_something(String strArg1, String strArg2) throws Throwable {
         passengerDetails.passengerOne(strArg1, strArg2);
    }
    @And("^User selects Title2 dropdown$")
    public void user_selects_title2_dropdown() throws Throwable {
        passengerDetails.mrsTitle();
    }

    @And("^User enters Passenger 2 FirstName as \"([^\"]*)\" and LastName as \"([^\"]*)\"$")
    public void user_enters_passenger_2_firstname_as_something_and_lastname_as_something(String strArg1, String strArg2) throws Throwable {
        passengerDetails.passengerTwo(strArg1, strArg2);
    }
    @And("^User enters Passenger 3 FirstName as \"([^\"]*)\" and LastName as \"([^\"]*)\"$")
    public void user_enters_passenger_3_firstname_as_something_and_lastname_as_something(String strArg1, String strArg2) throws Throwable {
        passengerDetails.passengerThree(strArg1,strArg2);
    }

    @And("^User clicks on Continue button$")
    public void user_clicks_on_continue_button() throws Throwable {
        passengerDetails.continueNext();
        Thread.sleep(10000);
    }

    @Then("^User clicks okay got it button$")
    public void user_clicks_okay_got_it_button() throws Throwable {
        passengerDetails.okayGotit();

    }
    @And("^User selects seat allocation option$")
    public void user_selects_seat_allocation_option() throws Throwable {
        passengerDetails.chooseSeats();
        Thread.sleep(3000);
    }

    @Then("^User clicks Next Continue$")
    public void user_clicks_next_continue() throws Throwable {
        passengerDetails.nextContinue();
        Thread.sleep(3000);
    }

    @And("^User selects seat allocation for return flight$")
    public void user_selects_seat_allocation_for_return_flight() throws Throwable {
        passengerDetails.returnSeats();
        Thread.sleep(3000);
    }

    @Then("^User clicks coninue to next page$")
    public void user_clicks_coninue_to_next_page() throws Throwable {
        passengerDetails.continuePage();
        Thread.sleep(3000);
    }

    @And("^User selects no thanks option$")
    public void user_selects_no_thanks_option() throws Throwable {
        passengerDetails.noThanks();
        Thread.sleep(3000);
    }

    @Then("^User selects Small Bag Option$")
    public void user_selects_small_bag_option() throws Throwable {
        passengerDetails.smallBag();
        Thread.sleep(3000);
    }

    @And("^User clicks continue after choosing bag$")
    public void user_clicks_continue_after_choosing_bag() throws Throwable {
        passengerDetails.continueForward();
        Thread.sleep(3000);
    }

    @And("^User clicks again no Thanks$")
    public void user_clicks_again_no_thanks() throws Throwable {
        passengerDetails.againNothanks();
        Thread.sleep(3000);
    }

    @And("^User clicks continue to final page$")
    public void user_clicks_continue_to_final_page() throws Throwable {
        passengerDetails.finalPage();
        Thread.sleep(3000);
    }

    @Then("^User clicks continue to finish page$")
    public void user_clicks_continue_to_finish_page() throws Throwable {
        passengerDetails.finishPage();

    }
}