Feature: create a booking


  Scenario: First booking

    Given I have booking request body
    When I send a post request to create booking
    Then the response status should be 200
    And booking firstName should be "Hema"



