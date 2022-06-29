@user_login
  Feature: user_login
    Scenario Outline: login_user_profile_testing

      Given user is on the Medunna page
      And user clicks human icon
      And user clicks signIn button


      Examples: customer credentials
        | username                     | password |
        | kubracanada@gmail.com        | Esra2014.    |
