Feature: Options Select User for Mats Application 

Scenario Outline: Options Select User in Mats Application 
	Given Open browser for Options in Mats Application and click Select User
	When Select User is selected and User Enters "<barcode>" and "<Username>" for Options in Mats Application
	Then Message displayed User clicked on select successfully

	Examples: 
		| barcode        		 |Username|
		| 88M0001163143161685XX  |Anurag  |
		
		

		
		
		
