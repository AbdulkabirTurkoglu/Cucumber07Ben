Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create Country
    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | ismetUlk188 |
      | codeInput | isKod11     |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

#    And User delete the Element from Dialog
#      | ismetUlk188 |

    Then Success message should be displayed

  Scenario: CitizenShip Create and Delete
    And Click on the Element in LeftNav
      | setup       |
      | parameters  |
      | citizenship |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | isSCulk19 |
      | shortName | isSC1     |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the Element from Dialog
      | isSCulk19 |

    Then Success message should be displayed

  Scenario: Create Nationlity and Delete
    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | Nationlity |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | isNTulk19 |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete the Element from Dialog
      | isSCulk19 |

    Then Success message should be displayed

