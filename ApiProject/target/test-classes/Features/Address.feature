Feature: Verifying Address Details

  Scenario: Get User logtoken from login endpoint
    Given User add header
    And User add basic authentication for login
    And User send "POST" request for login endpoint
    And User verify the status code is 200

  #Then User should get the logtoken saved and verify the response body message as "Login successfully"
  Scenario Outline: By Creating Address
    Given User add headers
    And User add request body "<firstName>","<lastName>","<PhoneNo>","<apartmentName>","<state>","<city>","<country>","<zipcode>","<address>" and "<addressType>"
    And User send "POST" request for AddAddress endpoint
    Then User Should verify the status code is 200
    And User Should verify the message as "Address added successfully"

    # And User Should get the address id and saved
    Examples: 
      | firstName   | lastName    | phoneNo    | apartmentName | state | city | country | zipcode | address   | addressType |
      | Yogeshkumar | Adhikesavan | 8939691801 | Akshaya       |    23 | 1000 |     101 |  600001 | Sowcarpet | Home        |
