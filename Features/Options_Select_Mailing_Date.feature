Feature: Options Select Mailing Date for MET Application 

Scenario Outline: Options Select Mailing Date in MET Application 
	Given Open "<browser>" for Options in MET Application and click Select Mailing Date
	When Mailing Date is selected and User Enters "<Mailing_Date>" for Options in MET Application
	Then Message displayed User clicked on select successfully for Mailing Date Option

	Examples: 
		|Mailing_Date   		 |browser|
		| 12  					 |Chrome |
		| 12  					 |Firefox |
		
		

		
		
		
