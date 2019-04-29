Feature: Options Select Mailing Date for Mats Application 

Scenario Outline: Options Select Mailing Date in Mats Application 
	Given Open browser for Options in Mats Application and click Select Mailing Date
	When Mailing Date is selected and User Enters "<Mailing_Date>" for Options in Mats Application
	Then Message displayed User clicked on select successfully for Mailing Date Option

	Examples: 
		|Mailing_Date   		 |
		| 12  					 |
		
		

		
		
		
