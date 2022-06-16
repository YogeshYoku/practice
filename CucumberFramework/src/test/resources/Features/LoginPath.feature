Feature: Verifying AdactinHotelApp Details

  Scenario Outline: Verifying Adactin Login with Valid Credentials
    Given User is on the Login page
    When User Should Enter "<userName>","<password>"
    And User Should Click Login button
    And User Should Search "<location>",
    "<hotels>","<roomType>","<noOfRooms>","<adultsPerRoom>","<childPerRoom>"
    And User Should Click Search button
    And User Should Select Hotel
    And User Should Click continue button
    And User Should Enter Details "<firstName>","<lastName>","<address>","<ccNo>","<ccType>","<expMonth>","<expYear>","<cvv>"
    And User Should Click Booknow button
    And User Should Print the OrderNo
    Then User Should Verify Success Message

    Examples: 
      | userName   | password | location    | hotels         | roomType | noOfRooms | adultsPerRoom | childPerRoom | firstName   | lastName    | address | ccNo             | ccType           | expMonth | expYear | cvv |
      | YogeshYoku | PR9Z29   | Sydney      | Hotel Creek    | Standard | 1 - one   | 1 - one       | 0 - None     | YogeshKumar | Adhikesavan | Chennai | 4545545465655656 | American Express | December |    2022 | 256 |
      | YogeshYoku | PR9Z29   | Melbourne   | Hotel Sunshine | Standard | 1 - one   | 1 - one       | 0 - None     | YogeshKumar | Adhikesavan | Chennai | 4545545465655656 | American Express | December |    2022 | 256 |
      | YogeshYoku | PR9Z29   | Brisbane    | Hotel Hervey   | Standard | 1 - one   | 1 - one       | 0 - None     | YogeshKumar | Adhikesavan | Chennai | 4545545465655656 | American Express | December |    2022 | 256 |
      | YogeshYoku | PR9Z29   | Adelaide    | Hotel Cornice  | Standard | 1 - one   | 1 - one       | 0 - None     | YogeshKumar | Adhikesavan | Chennai | 4545545465655656 | American Express | December |    2022 | 256 |
      | YogeshYoku | PR9Z29   | London      | Hotel Creek    | Standard | 1 - one   | 1 - one       | 0 - None     | YogeshKumar | Adhikesavan | Chennai | 4545545465655656 | American Express | December |    2022 | 256 |
      | YogeshYoku | PR9Z29   | New York    | Hotel Sunshine | Standard | 1 - one   | 1 - one       |  0 - None     | YogeshKumar | Adhikesavan | Chennai | 4545545465655656 | American Express | December |    2022 | 256 |
      | YogeshYoku | PR9Z29   | Paris       | Hotel Cornice  | Standard | 1 - one   | 1 - one       | 0 - None     | YogeshKumar | Adhikesavan | Chennai | 4545545465655656 | American Express | December |    2022 | 256 |
      | YogeshYoku | PR9Z29   | Los Angeles | Hotel Hervey   | Standard | 1 - one   | 1 - one       | 0 - None     | YogeshKumar | Adhikesavan | Chennai | 4545545465655656 | American Express | December |    2022 | 256 |
      | YogeshYoku | PR9Z29   | Sydney      | Hotel Creek    | Standard | 1 - one   | 1 - one       | 0 - None     | YogeshKumar | Adhikesavan | Chennai | 4545545465655656 | American Express | December |    2022 | 256 |
      | YogeshYoku | PR9Z29   | Sydney      | Hotel Sunshine | Standard | 1 - one   | 1 - one       | 0 - None     | YogeshKumar | Adhikesavan | Chennai | 4545545465655656 | American Express | December |    2022 | 256 |
