import java.util.Scanner;
public class TwoDimensionalArray
	{

			
		
			static int[][] myArray =
				{
							{3, 5, 9, 2, -1, 8, 13}, 
							{-2, 5, 1, 11, 8, 2, 0}, 
							{9, 1, -3, 4, 8, 4, 8}, 
							{6, 0, 0, -1, 4, 12, 7}, 
							{2, 6, -1, 5, 3, 10, 1}, 
							{2, 5, 1, 2, 9, 2, 3}, 
							{-3, 1, 1, 4, 11, 12, 4}
							};

				public static void main(String[] args)
		
					{
			for(int row = 0; row< myArray.length; row++)
				{
				for(int col = 0; col<myArray.length; col++)
					{
					
					System.out.println(row + col);	
					}
				
				
					}
						
						
			}
	}
	
