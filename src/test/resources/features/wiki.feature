Feature: manage my todo list
  As a customer, I want to place an order for searched item

  @home_page @home_page_display
  Scenario: User should be able to launch the application
    Given User navigates to the website
    Then scroll down to find language section in left menu
    Then store first 10 language from menu

  @home_page @home_page_display
  Scenario Outline: User should be able to launch the application
    Given User navigates to the website
    Then Search celebrity name "<celebrityName>"
    Then log birthdates and spouse details

    Examples:
      | celebrityName |
      | Al Pacino |
      | Johnny Depp |
      | Robert De Niro |
      | Kevin Spacey |
      | Denzel Washington |
      | Russell Crowe |
      | Brad Pitt |
      | Angelina Jolie |
      | Leonardo DiCaprio |
      | Tom Cruise |

