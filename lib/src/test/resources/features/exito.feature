Feature: SelectObjects
  As a Web User  
  I want to use virtual exito
  to search products in different subs and add to car

  @VirtualExito
  Scenario: VirtualExito
    Given that the User want select to categori in the application
    When User select five product
    Then User should see the products in the car