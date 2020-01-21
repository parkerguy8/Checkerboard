package Checkerboardpackage;

public class Checkerboard {

	public static void main(String[] args) {
		   printCheckerboard(3,5);
	}
public static void printCheckerboard(int width,int height)
{
	// sample outer and inner for() loops
	// (assumes numRows and numCols are parameters
	// into the printCheckerboard() function)

	// for each row
	for (int row=0; row<width; row++)
	{

	   // for each column in this row
	   for (int col=0; col<height; col++)
	   {
		   if (row % 2 == 0)
			{
			   	if (col % 2 == 0)
			   		{
			   			System.out.print("#");
			   		}
			   	if (col % 1 == 0)
			   		{
			   			System.out.print(" ");
			   		}
			}
		   if (row % 1 == 0)
		   {
				if (col % 2 == 0)
		   			{
						System.out.print(" ");
		   			}
			
		   		if (col % 1 == 0)
		   			{
		   				System.out.print("#");
		   			}
		   }
		   System.out.println("");
	   }
	   System.out.println("");
	}
}
}