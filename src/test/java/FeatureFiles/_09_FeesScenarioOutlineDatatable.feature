Feature: Fees multiple values functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Fee Functionality and Delete
    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput       | <name>     |
      | codeInput       | <code>     |
      | integrationCode | <inCode>   |
      | priorityCode    | <priority> |

    And Click on the Element in Dialog
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed
    And User delete the Element from Dialog
      | <name> |

    Then Success message should be displayed
    Examples:
      | name     | code | inCode    | priority |
      | abdulla1 | 1231 | PlayGame1 | 4321     |

