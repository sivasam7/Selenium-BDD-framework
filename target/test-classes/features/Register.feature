Feature: Register functionality


@Register
 Scenario: User registers successfully
   Given user is on login page 
   Then Enter emailID for sign in "selvamsivaprakasam7@gmail.com"
   Then user clicks signIn next button
   And Enter first name "Siva"
   And Enter last name "Selvaraj"
   And Enter Address "1-2/345, Mettur Dam, Salem"
   And Enter email Address "selvamsivaprakasam7@gmail.com"
   And Enter phone Number "9021234567"
   And Select gender "Male"
   And Select Hobby "Cricket"
   And Select Language "English"
   And Select Skill "Java"