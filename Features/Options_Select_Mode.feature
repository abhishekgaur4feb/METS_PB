Feature: Options Select Mode for Mats Application 

Scenario Outline: Options Select Mode in Mats Application 
	Given Open browser for Options in Mats Application and click Select Mode
	When Mode is selected and User Enters "<Scan_Barcode>" for Options in Mats Application
	Then Message displayed User clicked on select successfully for Mode Option

	Examples: 
		| Scan_Barcode           |
		| Validate                |
		
		

		
		
		
