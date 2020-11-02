/*
 * STEP 1: GET NUMBERS FROM FILE (PROBABLY EASIEST WAY???) INTO MULTI-DIM ARRAY
 * 		READ FILE LINE BY LINE - STORE EACH NUMBER IN THE LINE IN THE ELEMENT OF AN ARRAY
 * STEP 2: SEARCH THROUGH ARRAY (UP, DOWN, LEFT, RIGHT, DIAGONALLY)
 * STEP 3: EVERY TIME A BIGGER NUMBER IS FOUND, STORE IT IN A LONG VARIABLE
 */
import java.io.*;


public class Problem11 {
	// ELEMENTS CONTAINING 0 SHOULD BE SET TO 1
	
	public static void main(String[] args) throws IOException {
		//File theData = new File("C:\\Users\\Leon\\Desktop\\problem11.txt");
		BufferedReader rdr = new BufferedReader(new FileReader("C:\\Users\\Leon\\Desktop\\problem11.txt"));
		int numbers[][] = new int[20][20];
		String line;
		String[] values = new String[20];
		int inc = 0;
		
		// Writes the numbers from the file into an array
		while((line = rdr.readLine()) != null)
		{
			values = line.split("\\s+");
			for(int j = 0; j<20; j++)
			{
				numbers[inc][j] = Integer.parseInt(values[j]);
				if(numbers[inc][j] == 0)
					numbers[inc][j] = 1;
			}
			inc++;
		}
		rdr.close();
		
		
		long sum=1, greatest=0;
		
		// Search horizontally
		for(int a=0; a<numbers.length; a++)
		{
			for(int b=0; b<numbers[a].length-3; b++)
			{
				for(int c=0; c<4; c++)
				{
					sum *= numbers[a][b+c];
					//System.out.print(numbers[a][b+c] + " ");
				}
				if(sum > greatest)
					greatest = sum;
				
				/*System.out.print(greatest);
				System.out.println();*/
				sum=1;
			}
			//System.out.println();
		}
		
		// Search vertically 
		for(int a=0; a<numbers.length-3; a++)
		{
			for(int b=0; b<numbers[a].length; b++)
			{
				for(int c=0; c<4; c++)
				{
					sum *= numbers[a+c][b];
					//System.out.print(numbers[a+c][b] + " ");
				}
				if(sum > greatest)
					greatest = sum;
				/*System.out.print(greatest);
				System.out.println();*/
				sum = 1;
			}
			//System.out.println();
		}

		//SEARCH DIAG DOWN - LEFT
		for(int a=0; a<numbers.length-3; a++)
		{
			for(int b=0; b<numbers[a].length-3; b++)
			{
				//System.out.print(numbers[a][b] + " ");
				for(int c=0; c<4; c++)
				{
					sum *= numbers[a+c][b+c];
					//System.out.print(numbers[a+c][b+c] + " ");
				}
				if(sum > greatest)
					greatest = sum;
				/*System.out.print(greatest);
				System.out.println();*/
				sum = 1;
			}
			//System.out.println();
		}
		
		
		// SEARCH DIAG - UP AND RIGHT - SEARCHES WHOLE GRID
		for(int a=3; a<numbers.length; a++)
		{
			for(int b=0; b<numbers[a].length-3; b++)
			{
				for(int c=0; c<4; c++)
				{
					sum *= numbers[a-c][b+c];
					//System.out.print(numbers[a-c][b+c] + " ");
				}
				if(sum > greatest)
					greatest = sum;
				/*System.out.println(greatest);
				System.out.println();*/
				sum = 1;
			}
			//System.out.println();
		}
	
		System.out.println("Largest is: " + greatest);
	}
}
