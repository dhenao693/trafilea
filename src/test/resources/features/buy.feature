  #language: en
  Feature: Login

    @buy @userLogged @happyPath
    Scenario Outline: Buy product with user logged
      Given "Daniel" is on Demoblaze page
      When login in app
        | username   | password   |
        | <username> | <password> |
      And select first product and add to car with alert "Product added." and buy
        | name   | country   | city   | creditCard   | month   | year   |
        | <name> | <country> | <city> | <creditCard> | <month> | <year> |
      Then see the successful pay modal with message "Thank you for your purchase!"

      Examples:
        | username           | password  | name   | country  | city     | creditCard | month | year |
        | dhenao@yopmail.com | 123456789 | daniel | colombia | medellin | 123456789  | 12    | 1994 |

    @buy @userLogged @happyPath
    Scenario Outline: Buy product without <withoutLabel>
      Given "Daniel" is on Demoblaze page
      When login in app
        | username   | password   |
        | <username> | <password> |
      And select first product and add to car with alert "Product added." after user form
      And fill user form to pay without "<withoutLabel>"
        | name   | country   | city   | creditCard   | month   | year   |
        | <name> | <country> | <city> | <creditCard> | <month> | <year> |
      Then see the successful pay modal with message "Thank you for your purchase!"

      Examples:
        | username           | password  | name   | country  | city     | creditCard | month | year | withoutLabel |
        | dhenao@yopmail.com | 123456789 | daniel | colombia | medellin | 123456789  | 12    | 1994 | country      |
        | dhenao@yopmail.com | 123456789 | daniel | colombia | medellin | 123456789  | 12    | 1994 | city         |
        | dhenao@yopmail.com | 123456789 | daniel | colombia | medellin | 123456789  | 12    | 1994 | month        |
        | dhenao@yopmail.com | 123456789 | daniel | colombia | medellin | 123456789  | 12    | 1994 | year         |

    @buy @userLogged @failedPay @unhappyPath
    Scenario Outline: Fail pay without <withoutLabel>
      Given "Daniel" is on Demoblaze page
      When login in app
        | username   | password   |
        | <username> | <password> |
      And select first product and add to car with alert "Product added." after user form
      And fill user form to pay without "<withoutLabel>"
        | name   | country   | city   | creditCard   | month   | year   |
        | <name> | <country> | <city> | <creditCard> | <month> | <year> |
      Then see the alert with message "Please fill out Name and Creditcard."

      Examples:
        | username           | password  | name   | country  | city     | creditCard | month | year | withoutLabel |
        | dhenao@yopmail.com | 123456789 | daniel | colombia | medellin | 123456789  | 12    | 1994 | name         |
        | dhenao@yopmail.com | 123456789 | daniel | colombia | medellin | 123456789  | 12    | 1994 | creditCard   |

    @buy @userNotLogged @happyPath
    Scenario Outline: Buy product without logged
      Given "Daniel" is on Demoblaze page
      When select first product and add to car with alert "Product added" and buy
        | name   | country   | city   | creditCard   | month   | year   |
        | <name> | <country> | <city> | <creditCard> | <month> | <year> |
      Then see the successful pay modal with message "Thank you for your purchase!"

      Examples:
        | name   | country  | city     | creditCard | month | year |
        | daniel | colombia | medellin | 123456789  | 12    | 1994 |

    @buy @userNotLogged @happyPath
    Scenario Outline: Buy product user not logged without <withoutLabel>
      Given "Daniel" is on Demoblaze page
      When select first product and add to car with alert "Product added" after user form
      And fill user form to pay without "<withoutLabel>"
        | name   | country   | city   | creditCard   | month   | year   |
        | <name> | <country> | <city> | <creditCard> | <month> | <year> |
      Then see the successful pay modal with message "Thank you for your purchase!"

      Examples:
        | name   | country  | city     | creditCard | month | year | withoutLabel |
        | daniel | colombia | medellin | 123456789  | 12    | 1994 | country      |
        | daniel | colombia | medellin | 123456789  | 12    | 1994 | city         |
        | daniel | colombia | medellin | 123456789  | 12    | 1994 | month        |
        | daniel | colombia | medellin | 123456789  | 12    | 1994 | year         |

    @buy @userNotLogged @failedPay @unhappyPath
    Scenario Outline: Fail pay without <withoutLabel>
      Given "Daniel" is on Demoblaze page
      When select first product and add to car with alert "Product added" after user form
      And fill user form to pay without "<withoutLabel>"
        | name   | country   | city   | creditCard   | month   | year   |
        | <name> | <country> | <city> | <creditCard> | <month> | <year> |
      Then see the alert with message "Please fill out Name and Creditcard."

      Examples:
        | name   | country  | city     | creditCard | month | year | withoutLabel |
        | daniel | colombia | medellin | 123456789  | 12    | 1994 | name         |
        | daniel | colombia | medellin | 123456789  | 12    | 1994 | creditCard   |


    @RunTestAllSteps
    Scenario Outline: Buy product with user logged
      Given "Daniel" is on Demoblaze page
      When login in app
        | username   | password   |
        | <username> | <password> |
      And select first product and add to car with alert "Product added." and buy
        | name   | country   | city   | creditCard   | month   | year   |
        | <name> | <country> | <city> | <creditCard> | <month> | <year> |
#      And select first product and add to car with alert "Product added."
#      And select car to buy
#      And fill user form to pay
#        | name   | country  | city  | creditCard  | month  | year  |
#        | <name> | <country> | <city> | <creditCard> | <month> | <year> |
#      Then see the alert of add to car successful with message "Product added."

      Examples:
        | username           | password  | name   | country  | city     | creditCard | month | year |
        | dhenao@yopmail.com | 123456789 | daniel | colombia | medellin | 123456789  | 12    | 1994 |