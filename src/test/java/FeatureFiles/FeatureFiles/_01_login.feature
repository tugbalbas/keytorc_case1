#Senaryo ;
#1- siteyi açınız. açıldığını verify et
#2- login tıkla username ve password u gönderin ve Login butonuna tıklatın.
#3- Login olduğunuzu doğrulayın.

Feature: Login Functionality
    @login
  Scenario: Login with valid username and password

    Given Navigate to web site and verify
    When Enter username and password and click login button
    Then User should login successfully