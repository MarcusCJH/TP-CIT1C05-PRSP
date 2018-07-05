/*
	Question 	: 2
	Purpose		: Making a program that computes petrol top-up cost. 
	Author		: Marcus Chan
	Date			: 11/06/2011 
	Last Check	: 06/07/2011
*/

public class PetrolApp
{
	public static void main(String[] args)
	{
	// declare variables
	int tPetrol = 25;			//Total amount of petrol (in gallons)
	int cPetrol = 0;			//Current Amount of petrol (in gallons)
	int cCost = 0;				//Cost of petrol per gallon
	int cAvailable = 0;		//Amount of petrol available at the pump
	int petrolNeeded	= 0;	//Initial Result for the amount of petrol (in gallons) filled up
	int petrolLeft	= 0; 		//Initial Result for the amount of petrol (in gallons) left at the petrol station pump
	int petrolCost = 0; 		//Initial Result for the total cost of petrol payable
	
	
	// generate a random number between 1 and 25 inclusive
	cPetrol = (int)((Math.random()*25) + 1);
	// generate a random  number between 1 and 5 inclusive
	cCost = (int)((Math.random()*5) + 1);
	// generate a random number between 30 and 300 inclusive
	cAvailable = (int)((Math.random()*271) + 30);
	
	// print random number output 
	System.out.println("Current amount of petrol (in gallons): " + cPetrol);
	System.out.println("Cost of petrol per gallon: " + cCost);
	System.out.println("Amount of petrol available at the pump: " + cAvailable +"\n");
	
	
	//compute numbers
	petrolNeeded = (tPetrol -=cPetrol);				// Final Result for the amount of petrol (in gallons) filled up
	petrolLeft = (cAvailable -=petrolNeeded);		// Final	Result for the amount of petrol (in gallons) left at the petrol station pump
	petrolCost = (cCost * petrolNeeded);			// Final result for the amount of the total cost of the petrol payable

	// print output
	System.out.println("Amount of petrol (in gallons) filled up: " + petrolNeeded);
	System.out.println("Amount of petrol (in gallons) left at the petrol station pump: " + petrolLeft);
	System.out.println("Total Cost of the petrol payable: " + petrolCost);
	}
}