@regression

  Feature: Logged User could search for any product

    Scenario Outline: user could search using product name
      Given click on search field to insert something inside
      When search for any product like <arg0>
      Then url contains "nopCommerce demo store. Search"
      And search shows relevant results <arg0>
      Examples:
        | arg0    |
        | "Apple" |
        |"Nike"   |
        |"Laptop" |

    Scenario Outline: user could search for product using sku
      Given click on search field to insert something inside
      When search for any sku <arg0>
      And click on the product in search result
      Then Verify the sku <arg0>
      Examples:
        | arg0        |
        | "SF_PRO_11" |
        | "APPLE_CAM" |
        | "SCI_FAITH" |
