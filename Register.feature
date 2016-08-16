Feature: Test for User Registeration Form
	
	Scenario: User register without input values
	Given Open Browser and start application
	When User click on Submit
	Then Error message is generated
	
	Scenario: User register without entering mandatory values
	Given Open Browser and start application
	When User click on Marital Status
	And User set Country
	And User select Date of Birth
	And User upload profile picture
	And User enters description about yourself
	Then Click Submit and Error message is generated
	
	Scenario Outline: New User Register with all valid Credentials
	Given Open Browser and start application
	When User enters First Name as "<firstname>"
	And User enters Last Name	as "<lastname>"
	And User click on Marital Status as "<status>"
	And User select Hobby as	"<hobby>"
	And User set Country to "<country>"
	And User select Month to "<month>" ,Day to "<day>" and Year to "<year>"
	And User enters Phone as "<phone>"
	And User enters Username as "<username>"
	And User enters Email as "<email>"
	And User upload profile picture
	And User enters description about myself "<desc>"
	And User enters password "<password>"
  And User enters confirm password "<confirmpwd>"
	Then The User should see the message "<result>"
	
	Examples:
	|firstname	|lastname		|status			|hobby							|country				|month|day|year	|phone				|username				|email													|desc																|password					|confirmpwd			|result											|
	|user11			|name11			|married		|dance							|India					|4		|20	|1982	|9046187901		|user1117				|user1117@gmail.com							|I am a quick learner								|username201728		|username201728	|Registered Successfully		|
	|user12			|name12			|						|reading						|Afghanistan		|10		|7	|1986	|9045247287		|user1126				|user1126@gmail.com							|																		|username201628		|username201628	|Registered Successfully		|
	|user7 			|name7			|single	  	|cricket 						|United States	|12		|10	|1987	|9046188011		|user3018				|user3018@gmail.com							|I basic knowledge on selenium			|username201828		|username201829	|Password Mistmatch					|
	|user8 			|name8			|divorced	  |reading						|United Kingdom	|5		|15	|1989	|904619901		|user3019				|user3019@gmail.com							|I basic knowledge on selenium			|username201930		|username201930	|Minimum 10 Digits starting	|
	
	