  #language: en
  Feature: Login

    @buy @unhappyPath
    Scenario Outline: Buy product with user logged
      Given "Daniel" is on Demoblaze page
      When select first product and add to car to buy
        | email   | firstName   | lastName   | address   | aptSuite   | city   | country   | state   | postalCode   | phone   |
        | <email> | <firstName> | <lastName> | <address> | <aptSuite> | <city> | <country> | <state> | <postalCode> | <phone> |
      And fill payment info
        | cardNumber   | cardName   | expDate   | cvv   |
        | <cardNumber> | <cardName> | <expDate> | <cvv> |
      Then see the shipping type "<shippingType>"
      And see the failed pay with message "<cardMessage>" in card
      And the url contains "<urlContains>"

      Examples:
        | email             | firstName | lastName    | address            | aptSuite | city     | country      | state    | postalCode | phone      | cardNumber          | cardName      | expDate | cvv | shippingType                          | cardMessage                  | urlContains   |
        | qa.mail@gmail.com | My Name   | My Lastname | 123 William Street | apt 1    | New York | United State | New York | 10038      | 1234567890 | 1234 1234 1234 1234 | Name Lastname | 01 / 25 | 999 | Standard Delivery (4-8 business days) | Your card number is invalid. | /hc/checkout/ |

