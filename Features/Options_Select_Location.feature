Feature: Options Select Location for Mats Application 

Scenario Outline: Options Select Location in Mats Application 
	Given Open browser for Options in Mats Application and click Select Location
	When location is selected and User Enters "<location_barcode>" and "<location_name>" for Options in Mats Application
	Then Message displayed User clicked on select successfully for location Option

	Examples: 
		| location_barcode       |location_name  |
		| 99M0001163143161685XX  |India,New Delhi|
		
		

		
		
		
