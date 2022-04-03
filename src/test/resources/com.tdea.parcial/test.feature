Feature: Day time informer

  Scenario: Checkboxes
    Given checkboxes test
    When checkboxes click
    Then checkboxes validate

  Scenario: Notification messages
    Given notification messages test
    When click here is clicked
    Then search notification message