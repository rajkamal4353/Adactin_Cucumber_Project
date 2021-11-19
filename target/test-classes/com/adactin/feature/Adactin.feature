Feature: Hotel Booking In Adactin Application

@smokeTest
Scenario Outline: Login Page
Given user Launch The Application
When user Enter The "<username>" In Username Field
And user Enter The "<password>" In Password Field
Then user Click On The Login Button And It Navigates To The Search Hotel Page 
Examples:
|username|password|
|66668888|9876543210|


@sanityTest
Scenario: Search Hotel Page
When user Select The Location
And user Select The Hotel
And user Select The Room Type
And user Select Number Of Room Required
And user Select Checkin Date
And user Select Checkout Date
And user Select Number Of Adults Per Room
And user Select Number Of Child Per Room
Then user Click On Search Button And It Navigates To Select Hotel Page

@sanityTest
Scenario: Select Hotel Page
When user Click On The Select Hotel Button
Then user Click On Continue Button And It Navigates To Book A Hotel Page

@smokeTest
Scenario: Book A Hotel Page
When user Enter The Firstname
And user Enter The Lastname
And user Enter The Address
And user Enter The Credit Card Number
And user Select The Credit Card Type
And user Select Credit Card Expiry Month
And user Select Credit Card Expiry Year
And user Enter Cvv Number
Then user Click on Book Now Button And It Navigates To Booking Confirmation Page

@sanityTest
Scenario: Booking Confirmation Page
Then user Click On My Itinerary Button And It Naviagtes To Booked Itinerary Page

@sanityTest
Scenario: Booked Itinerary Page
Then user Click On Logout Button And It Navigates To Login Again Page 

@regressionTest
Scenario: Login Again Page 
Then user Click On Login Again Button And It Naviagtes To Login Page
