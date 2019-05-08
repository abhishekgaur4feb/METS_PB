Feature: MET Application 

Scenario Outline: MET Application Barcode Scan 
	Given Open "<browser>" for MET Application 
	When NewUser enters "<barcode>" for MET Application
	Then Message displayed Barcode Successful Submitted for MET Application

	Examples: 
		| barcode       		 |browser|
		| 99M0001163143161685XX  |Chrome |
		| 99M0001163143161685XX  |Firefox |
		| 99M0001163143161685XX  |IE |
		
		
		
		

		
		
		
