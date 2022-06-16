Feature: Verifying Login Details

  Scenario: Get User logtoken from login endpoint
    Given User add header
    And User add basic authentication for login
    And User send "POST" request for login endpoint
    Then User verify the status code is 200
    And User should get the logtoken saved and verify the response body message as "Login successfully"
    #And User verify the response body message as "Login successfully"
