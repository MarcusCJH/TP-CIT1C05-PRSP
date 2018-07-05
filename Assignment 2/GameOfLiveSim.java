/*
	Question 	: 4
	Purpose		: Write a program to simulate a simplified version of Conway's Game Of Life
	Author		: Marcus Chan
	Date			: 24/07/2011 
	Last Check	: 14/08/2011
*/

public class GameOfLiveSim
{
	// To count the total live to dead and dead to live numbers
	static int live2Dead=0,dead2Live=0;
	
	public static void main(String[] args)
	{	
		// life value is 1
		// dead value is 0
		
		// declare variable and array
		int i,k,j;										// Int value for next configuration
		int array[][] = new int [18][18];		// To create 2d array with border
		int temp[][] = new int [18][18];			// To store array in a temporary array 
		int liveCount = 0;							// To Count the live cell
		int deadCount = 0;							// To Count the dead cell
		int gen = (int)((Math.random()*16)+5);	// To determine how many configuration it will have
		int counter = 1;								// To start the counter from 1.
		
		
		
		// Call Method (initializeFirstConfiguration) to count the number of live and dead
		liveCount = initializeFirstConfiguration(array);
		deadCount = 16*16 - liveCount;
		System.out.println("Total number of initial live cells: "+liveCount);
		System.out.println("Total number of initial dead cells: "+deadCount+"\n");
		
		// Call Method (generateNextConfiguration) to generate next configuration
		while(counter<=gen)
		{		
			for(i = 1;i < 17; i++)
			{
				for(k = 1;k < 17; k++)
				{
					generateNextConfiguration(array, i, k, temp);
				}			
			}
			liveCount=0;
			
			for(i = 1;i < 17; i++)
			{
				for(k = 1;k < 17; k++)
				{
					if (temp [i][k] == 1)
					{
						liveCount++;
					}
				array[i][k] = temp[i][k];
				System.out.print(temp[i][k] + " ");
				}
			System.out.println();			
			}
		deadCount = 256 - liveCount; 
		counter++;
		
		// Printing the total number of live cell, dead cells and time generation
		System.out.println("Total number of live cells after " + (counter-1) + " time generation: " +liveCount);
		System.out.println("Total number of dead cells after " +(counter-1)+ " times generation: "+ deadCount + "\n");
		}
		
		// Printing the total number of cell that went from live to dead and dead to live
		System.out.println("Total number of cells that went from live to dead after all the steps: "+live2Dead);
		System.out.println("Total number of cells that went from dead to live after all the steps: "+dead2Live);
	
	
	}
	
	// Function: Create a 2D array and store value for life and dead
	public static int initializeFirstConfiguration (int [][] array)
	{
		// Declare Variable
		int liveCount = 0;
		
		// To Store random 1 and 0 into the array
		for (int i = 0; i < 18 ;i++)
		{
			for (int k = 0; k < 18; k++)
			{
				// This will not print the border of the array
				if (!( i==0 || i==17 || k == 0 || k == 17))
				{
					array[i][k] = (int)(Math.random()*2);
					System.out.print(array[i][k] + " ");
				}
				if(array[i][k] == 1)
				{
					liveCount++;
				}
		 	}
			System.out.println();
		}
		return liveCount;
	}	
	
	
	// Function : To generate next configuration for the simulation
	public static void generateNextConfiguration(int [][] array, int i, int k, int [][]temp)
   {
		// Declare variable
		int live = 0;
		int dead = 0;
		
		// Transversing and Checking For Neighbour in each and every row and colums
      for (int x = 0; x < 3; x++)
      {
         for (int y = 0; y <3; y++)
			{
				if (array [i + x -1][k + y -1] ==1)
				live++;
         }
   	}
		// Check whether cell is live, if yes, it will decrease by one
		if (array [i][k] == 1)
		{
			live--;
		}
		
		// Create Rules of the game
		if (array [i][k] == 1)
		{
			if (live == 2 || live == 3)
			{
				temp[i][k] = 1;
			}
			else
			{
				temp[i][k] = 0;
				live2Dead++; // store the value for live to dead
			}
		}
		else if(live == 3)
		{
			temp[i][k]=1;
			dead2Live++; // store the value for dead to live
		}
	}
}
	
	
	
	






