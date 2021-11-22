Feature: Travel quote

  Scenario: Make a travel quote
    Given Im on Ryanair web page
    And I enter departure "London Stansted",arrival "Austria"
    And I choose departure date "06/06/2021",return date "10/30/2021",two adults and one child
    And I press Search button
    And change the departure date "12/06/2021"
    And change the return date "12/12/2021"
    And I choose fligth departure and fligth arrival
    And I select value travel ligth
    And I select continue with Value fare
    And I choose Login later
    And I choose Passenger one Title, name and lastname
    And I choose Passenger two Title, name and lastname
    And I choose Passenger three name and lastname
    And I select continue
    And I close the popup
    And I choose the departure seats and press Next fligth button
    And I choose de arrival seats and press continue
    And I refuse fast track by choosing No thanks option
    And I choose 1 Small Bag only option and press continue
    And I press continue
    And I press continue
    Then I validate the "Plan your whole trip page" title page