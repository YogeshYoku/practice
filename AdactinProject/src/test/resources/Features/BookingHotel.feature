Feature: Verifying AdactinHotelApp Details

  Scenario Outline: By Select allFields
    #Given User Should Launch Browser
    #When User is on the Login Page
    And User Must Verify "Hello YogeshYoku!"
    And User Search"<location>","<hotels>","<roomType>","<noOfRooms>","<checkIn>","<checkOut>","<adultPerRoom>" and "<childPerRoom>"
    And User have to Verify "Select Hotel"
    And Select Hotel
    And User Should be Verify "Book A Hotel"
    And User Should book hotel "<firstName>","<lastName>","<billingAddress>" and payment
      | Credit Card No   | Credit Card Type | Select Month | Select Year | Cvv |
      | 5454656545456565 | American Visa    | December     |        2022 | 546 |
      | 5454656545456565 | American Visa    | December     |        2022 | 547 |
      | 5454656545456565 | American Visa    | December     |        2022 | 548 |
    Then User Should Verify "Booking Confirmation"

    Examples: 
      | location | hotels      | roomType | noOfRooms | checkIn    | check  Out | adultPerRoom | childPerRoom | firstName   | lastName    | billingAddress |
      | Sydney   | Hotel Creek | Standard | 2 - Two   | 25/05/2022 | 25/05/2022 | 2 - Two      | 1 - One      | Yogeshkumar | Adhikesavan | chennai        |

  @enter
  Scenario Outline: Without enter any fields click book
    #Given User Should Launch Browser
    #When User is on the Login Page
    And User Must Verify "Hello YogeshYoku!"
    And User Search"<location>","<hotels>","<roomType>","<noOfRooms>","<checkIn>","<checkOut>","<adultPerRoom>" and "<childPerRoom>"
    And User have to Verify "Select Hotel"
    And Select Hotel
    And User Should be Verify "Book A Hotel"
    And User Should Click book
    Then User Should Verify "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | location | hotels      | roomType | noOfRooms | checkIn    | check  Out | adultPerRoom | childPerRoom | firstName   | lastName    | billingAddress |
      | Sydney   | Hotel Creek | Standard | 2 - Two   | 25/05/2022 | 25/05/2022 | 2 - Two      | 1 - One      | Yogeshkumar | Adhikesavan | chennai        |
