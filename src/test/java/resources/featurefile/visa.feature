@regression
Feature: Visa Test

  Scenario: anAustralianCominToUKForTourism
    Given I am on Homepage
    When I accept all cookie
    And I click on Start Now
    And I select country as Australia
    And I click on Continue button
    And I select reason
    And I click on next button
    Then I should verify Result

    Scenario: aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths
      Given I am on Homepage
      When I accept all cookie
      And I click on Start Now
      And I select country as Chile
      And I click on Continue button
      And I select reason work or business
      And I click on next button
      And I click on duration option
      And I click on next button
      And I select Job type
      And I click on next button
      Then I should verify Result for visa

    Scenario:  aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card
      Given I am on Homepage
      When I accept all cookie
      And I click on Start Now
      And I select country as Colombia
      And I click on Continue button
      And I select reason join partner or family
      And I click on next button
      Then I should verify Result page
