Feature: Amazon.com

  Scenario: Amazon.com adding product
    Given User is on home page
    When Click accept cookies
    When Click the search button
    When Write product name
    When Click search button
    When Filter for shipped by Amazon
    When Filter for apple
    When Click the first product
    When Add to cart
    Then Check the cart page
