//Player interface class that implements the Decision Maker.....

//Name: Jay V. Patel
//NetID: jpate225
//CS342 Project 4.

//Name: Shivani Pathak
//NetID: spath3
//CS342 Project 4.

//Name: Ruchit Patel
//NetID: rpate329
//CS342 Project 4.
import java.util.Scanner;

public class PlayerInterface implements DecisionMaker
{

	@Override
	public Move getMove(Character char1, Place place1) 
	{
		
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		
		//Checking the condition for the GET, USE, and DROP parts and getting the objects back into the vector.
		//into move class.
		if ( userInput.contains("USE") )
		{
			Move Obj1= new Move ("USE", userInput);
			return Obj1;
		}
		if ( userInput.contains("DROP") )
		{
			Move Obj2 = new Move ("DROP", userInput);
			return Obj2;
		}
		
		if ( userInput.contains("GET"))
		{
			Move Obj3 = new Move ("GET", userInput);
			return Obj3;
		}
		return null;
	}//end of the getMove function.

}