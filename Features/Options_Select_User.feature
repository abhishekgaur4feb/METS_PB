Feature: Options Select User for MET Application 

Scenario Outline: Options Select User in MET Application 
	Given Open "<browser>" for Options in MET Application and click Select User
	When Select User is selected and User Enters "<barcode>" and "<Username>" for Options in MET Application
	Then Message displayed User clicked on select successfully

	Examples: 
		| barcode        		 |Username|browser|
		| 88M0001163143161685XX  |Anurag  |Chrome |
		| 88M0001163143161685XX  |Abhishek  |Firefox |
		

		
		
		
