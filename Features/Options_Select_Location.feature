Feature: Options Select Location for MET Application 

Scenario Outline: Options Select Location in MET Application 
	Given Open "<browser>" for Options in MET Application and click Select Location
	When location is selected and User Enters "<location_barcode>" and "<location_name>" for Options in MET Application
	Then Message displayed User clicked on select successfully for location Option

	Examples: 
		| location_barcode       |location_name  |browser|
		| 99M0001163143161685XX  |India,New Delhi|Chrome|
		| 99M0001163143161685XX  |India,New Delhi|Firefox|
		
		

		
		
		
