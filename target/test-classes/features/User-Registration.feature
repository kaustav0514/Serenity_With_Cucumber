Feature: User registration to the pet store application

Scenario: As a shopper, user need to register as a new user to the pet store application

Given Navigate to registration page
And add new user information
And add account information
And add profile information
And save the information
When login with the credentials
Then user will be able to view the welcome greeting with the user name on it
 