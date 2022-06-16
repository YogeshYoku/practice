Feature: Verifying Address Details

  Scenario Outline: By Creating Address
    Given User add headers
    And User add request body "<firstName>","<lastName>","<PhoneNo">,"<apartmentName>","<state>","<city>","<country>","<zipcode>","<address"> and "<addressType">
    And User send "POST" request for AddAddress endpoint
    Then User Should verify the status code is 200
    And User Should verify the message as "Address added successfully"
    And User Should get the address id and saved

    Examples: 
      | firstName   | lastName    | phoneNo    | apartmentName | state | city | country | zipcode | address   | addressType |
      | Yogeshkumar | Adhikesavan | 8939691801 | Akshaya       |    23 | 1000 |     101 |  600001 | Sowcarpet | Home        |

  Scenario Outline: By Updating Address
    Given User add headers
    And User add request body "<firstName>","<lastName>","<PhoneNo">,"<apartmentName>","<state>","<city>","<country>","<zipcode>","<address"> and "<addressType">
    And User add request body address_id
    And User send "PUT" request for UpdateAddress endpoint
    Then User Should verify the status code is 200
    And User Should verify the response body message as "Address updated successfully"

    Examples: 
      | firstName   | lastName    | phoneNo    | apartmentName | state | city | country | zipcode | address   | addressType |
      | Yogeshkumar | Adhikesavan | 8939691801 | Amirtha       |    23 | 1000 |     101 |  600001 | Sowcarpet | Home        |

  Scenario Outline: To Get Address
    Given User add headers
    And User send "GET" request for GetAddress endpoint
    Then User Should verify the status code is 200
    And User Should verify the response body message as "OK"

  Scenario Outline: To Delete Address
    Given User add headers
    And User add request body address_id
    And User send "DELETE" request for DeleteAddress endpoint
    Then User Should verify the status code is 200
    And User Should verify the message as Address deleted successfully
