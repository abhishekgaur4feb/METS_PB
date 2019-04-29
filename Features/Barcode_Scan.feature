Feature: Mats Application 

Scenario Outline: Mats Application Barcode Scan 
	Given Open browser for Mats Application 
	When NewUser enters "<barcode>" for Mats Application
	Then Message displayed Barcode Successful Submitted for Mats Application

	Examples: 
		| barcode       		 |
		| 99M0001163143161685XX  |
		
		

		
		
		
