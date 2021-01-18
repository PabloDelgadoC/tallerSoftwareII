#Author: pabandel@espol.edu.ec
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
      
@tag
Feature: Toma de datos de un cliente
	
	@tag1
	Scenario: Nuevo cliente que quiere adquirir un seguro
		Given Un nuevo cliente que quiere un seguro
		When Se lo registre como nuevo cliente
		Then Mostrara el valor de su seguro
		
	@tag2
	Scenario Outline: Juan es un cliente?
		Given Un nuevo <cliente> que quiere adquirir un seguro
		When Se lo registre como nuevo <cliente>
		Then Mostrara el <valor> de su seguro
		
		Examples:
		| cliente | valor |
		| cliente1| 500   |
		| cliente2| 500   | 
		
      
@tag3
Feature: Calcular el seguro de un cliente
	
	@tag4
	Scenario: El cliente es una persona mayor de 80 años
		Given Que el cliente cuenta con edad avanzada
		When Quiera calcular el valor de su seguro
		Then Mostrara un mensaje que no puede adquirir el seguro por su edad
		
	@tag5
	Scenario Outline: Cuantos años tiene el cliente?
		Given Que el <cliente> cuenta con <edad> avanzada
		When Quiera calcular el <valor> de su seguro
		Then Mostrara un <mensaje>
		
		Examples:
		| cliente | edad | valor | mensaje |
		| cliente1| 81   | 500   | No se le puede vender el seguro por la edad |
		| cliente2| 85   | 500   | No se le puede vender el seguro por la edad |

      
@tag6
Feature: Calcular el seguro de un cliente
	
	@tag7
	Scenario: El cliente es una persona menor de 25 años
		Given Que el cliente es un joven menor de 25 años
		When Quiera calcular el valor de su seguro
		Then Mostrara el valor de 2000
		
	@tag8
	Scenario Outline: Juan es un cliente?
		Given Que el <cliente> es un joven menor de <edad>
		When Quiera calcular el <valor> de su seguro
		Then Mostrara el <valor>
		
		Example:
		| cliente | edad | valor |
		| cliente1| 24   | 2000  |
		| cliente2| 26   | 500   |  		
