  #language: en
  Feature: Login

    @login @userNotLogged @happyPath
    Scenario Outline: Login successfull
      Given "Daniel" is on Demoblaze page
      When login in app
        | username   | password   |
        | <username> | <password> |
      Then see the correct username

      Examples:
        | username           | password  |
        | dhenao@yopmail.com | 123456789 |


    @login @userNotLogged @unhappyPath
    Scenario Outline: Login failed for username
      Given "Daniel" is on Demoblaze page
      When login in app
        | username   | password   |
        | <username> | <password> |
      Then see the alert with message "User does not exist."

      Examples:
        | username                 | password  |
        | dhenaofailed@yopmail.com | 123456789 |

    @login @userNotLogged @unhappyPath
    Scenario Outline: Login failed for password
      Given "Daniel" is on Demoblaze page
      When login in app
        | username   | password   |
        | <username> | <password> |
      Then see the alert with message "Wrong password."

      Examples:
        | username                 | password        |
        | dhenao@yopmail.com       | 123456789Failed |

    @login @userNotLogged @unhappyPath @run
    Scenario Outline: Login without username
      Given "Daniel" is on Demoblaze page
      When login in app without "<fieldDoNotFill>"
        | username   | password   |
        | <username> | <password> |
      Then see the alert with message "Please fill out Username and Password."
      Examples:
        | username           | password        | fieldDoNotFill |
        | dhenao@yopmail.com | 123456789Failed | username       |
        | dhenao@yopmail.com | 123456789Failed | password       |

    @login @userNotLogged @unhappyPath
    Scenario Outline: Login without all
      Given "Daniel" is on Demoblaze page
      When login in app without all
        | username   | password   |
        | <username> | <password> |
      Then see the alert with message "Please fill out Username and Password."

      Examples:
        | username                 | password        |
        | dhenao@yopmail.com       | 123456789Failed |