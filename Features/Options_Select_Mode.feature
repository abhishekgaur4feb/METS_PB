Feature: Options Select Mode for MET Application 

Scenario Outline: Options Select Mode in MET Application 
	Given Open "<browser>" for Options in MET Application and click Select Mode
	When Mode is selected and User Enters "<Scan_Barcode>" for Options in MET Application
	Then Message displayed User clicked on select successfully for Mode Option

	Examples: 
		| Scan_Barcode           |browser|
		| Validate                |Chrome|
		| Validate                |Firefox|
		
		

		
		
		
