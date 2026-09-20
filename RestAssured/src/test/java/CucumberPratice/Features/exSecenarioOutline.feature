Feature: Example for sceario outline

  Scenario Outline: Test data

    Given I am on the login page
    When I enter username "<username>"
    And I enter password "<password>"
    Then login result should be "<result>"


    Examples:
    |username  | password   |result|
    |sekhar    | Seekbar@01  | true |
    |Ravi      | Ravi@01    | true |
    |Ram       | ram@01     | False |
