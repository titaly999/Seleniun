Feature: Login Action

Scenario Outline:Successfull login

    Given User is on Homepage
	When Enter <Username> and click on Next button
	And Enter <Password> and click on Next Button
	And Click on Compose button
	And Enter <EmailID> and <Subject>
	Then click on send button
Examples:
|Username|Password|EmailID|Subject|
|"parultestuser"|"vtesting139"|"titaly999@gmail.com"|"Test Email"|
