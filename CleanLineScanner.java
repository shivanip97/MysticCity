import java.util.Scanner;

//Class to get the trimmed and CLean line from the file....
//Name: Jay V. Patel
//NetID: jpate225
//CS342 Project 4.

//Name: Shivani Pathak
//NetID: spath3
//CS342 Project 4.

//Name: Ruchit Patel
//NetID: rpate329
//CS342 Project 4.
public class CleanLineScanner {

	//getting the clean line function.
		public static String getCleanLine(Scanner fileIn)
		{
			while (fileIn.hasNextLine())
			{
				String L=null;
				String subLine=null;
				L=fileIn.nextLine();
				//Condition for the blank line from the file.
				if(L.length()==0)
				{
					continue;
				}
				
				//Condition for the line that starts with the comments.
				if(L.startsWith("//"))
				{
					continue;
				}
				//conditions for the line that contains comment mark.
				if(L.contains("//"))
				{
					subLine=L.substring(0, L.indexOf("//")).trim();
					return subLine;
				}
				else
				{
					subLine=L.trim();
					return subLine;
				}
			}
			return null;
		}//end of the Lean line function.
}
