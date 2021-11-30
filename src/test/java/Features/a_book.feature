Feature: Book Flight

  @book-positive
  Scenario: User can book flight successfully
    Given User navigates to the page "https://www.ryanair.com/gb/en/trip/flights/select?adults=2&teens=0&children=1&infants=0&dateOut=2021-12-01&dateIn=2021-12-11&isConnectedFlight=false&isReturn=true&discount=0&promoCode=&originIata=LIS&destinationIata=BVA&tpAdults=2&tpTeens=0&tpChildren=1&tpInfants=0&tpStartDate=2021-12-01&tpEndDate=2021-12-11&tpDiscount=0&tpPromoCode=&tpOriginIata=LIS&tpDestinationIata=BVA"
   Given User navigates to the page "https://www.ryanair.com/gb/en"
    When user selects an action on cookie popup "I agree"
    And User selects departure "Portugal" airport "Lisbon"
    And User selects destination "France" airport "Paris Beauvais"
    And selects Depart date "2021-12-06"
    And selects Return date "2021-12-12"
    And User selects  Passengers Two Adults and One Child
    And User clicks on Search button
    Given User navigates to the page "https://www.ryanair.com/gb/en/trip/flights/select?adults=2&teens=0&children=1&infants=0&dateOut=2021-12-01&dateIn=2021-12-11&isConnectedFlight=false&isReturn=true&discount=0&promoCode=&originIata=LIS&destinationIata=BVA&tpAdults=2&tpTeens=0&tpChildren=1&tpInfants=0&tpStartDate=2021-12-01&tpEndDate=2021-12-11&tpDiscount=0&tpPromoCode=&tpOriginIata=LIS&tpDestinationIata=BVA"
    Then User changes the departure date to "2022-02-06"
    And User selects flight
    And User changes the return date to "2022-02-16"
    And User selects flight2
 #   And Change Return date to "2022-02-12"
#    And User selects dates
#    And User selects available flight
    Then User Selects Tarifa Value
    And Click continue
    And Continue without login

    When User selects Title dropdown
    Then User enters Passenger 1 FirstName as "Sónia" and LastName as "Pereira"
    And User selects Title2 dropdown
    And User enters Passenger 2 FirstName as "Diogo" and LastName as "Bettencourt"
    And User enters Passenger 3 FirstName as "Inês" and LastName as "Marçal"
    And User clicks on Continue button
    Then User clicks okay got it button
    And User selects seat allocation option
    Then User clicks Next Continue
    And User selects seat allocation for return flight
    Then User clicks coninue to next page
    And User selects no thanks option
    Then User selects Small Bag Option
    And User clicks continue after choosing bag
    And User clicksks continue in the following page
    And User clicks continue to final page
 #   Then User clicks continue to finish page
#    And User selects extra options and continue
#    And User clicks on View Basket icon
#    And User clicks on Checkout button



