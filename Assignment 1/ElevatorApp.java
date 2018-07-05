/*
	Question 	: 3
	Purpose		: Making a program that decides whether furniture can be transported by an elevator in a skyscraper. 
	Author		: Marcus Chan
	Date			: 14/06/2011 
	Last Check	: 06/07/2011
*/

public class ElevatorApp
{
	public static void main(String[]args )
	{
		// declare variable
		int totalNum  = 30;  // maximum number of floor
		int tFloor 	  = 0;	// total number of floor
		int elevator1 = 0;	// elevator#1 floor number
		int elevator2 = 0;	// elevator#2 floor number
		int cFloor 	  = 0;	// current floor
		int fFloor	  = 0;	// final floor
		
		// generate a random floor number between 1 and 30 inclusive 
		tFloor	 = (int)((Math.random()*totalNum)+1);
		// generate a elevator floor number between 1 and number of floors inclusive
		elevator1 = (int)((Math.random()*tFloor)+1);
		// generate a elevator floor number between 1 and number of floors inclusive
		elevator2 = (int)((Math.random()*tFloor)+1);
		// generate a current floor number between 1 and number of floors inclusive
		cFloor	 = (int)((Math.random()*tFloor)+1);
		// generate a final floor number between 1 and number of floors inclusive
		fFloor	 = (int)((Math.random()*tFloor)+1);
		

		// print the random outputs
		System.out.println("Total number of floor: " + tFloor);
		System.out.println("Elevator #1 Floor Level: " + elevator1);
		System.out.println("Elevator #2 Floor Level: " + elevator2);
		System.out.println("Furniture Current Floor Level: " + cFloor);
		System.out.println("Furniture Final Floor: " + fFloor);
		
		// decide which elevator should be use or not to be use
		if(fFloor < cFloor)
		{
			System.out.println("It is not possible to move the furniture.");
		}
		else if(fFloor == cFloor)
		{
			System.out.println("No need to move the furniture (Current and Final floor level are the same)");
		}
		else if(elevator1 > cFloor && elevator2 > cFloor)
		{
			System.out.println("It is not possible to move the furniture.");
		}
	
		// decide which elevator should be use.
		if(cFloor < fFloor)
		{
			if(elevator1 < cFloor && elevator2 < cFloor)
			{
				int result1 = cFloor - elevator1;
				int result2 = cFloor - elevator2;
			
				if(result1 < result2)
				{
					System.out.println("The furniture can be moved up from " + cFloor + " floor to " + fFloor +" floor using elevator #1.");
				}
				else
				{
					System.out.println("The furniture can be moved up from " + cFloor + " floor to " + fFloor +" floor using elevator #2.");
				}
			}
		else if(elevator1 <= cFloor && elevator2 > cFloor)
		{
			System.out.println("The furniture can be moved up from " + cFloor + " floor to " + fFloor +" floor using elevator #1.");		
		}
		else if(elevator2 <= cFloor && elevator1 > cFloor)
		{
			System.out.println("The furniture can be moved up from " + cFloor + " floor to " + fFloor +" floor using elevator #2.");
		}
				
		}
	}
}