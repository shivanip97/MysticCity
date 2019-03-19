//gameTester Class for the game Testing...
//Name: Jay V Patel
//ACCC : jpate14
//netID: jpate225


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class gameTester {

	//Name: Jay V. Patel
	//NetID: jpate225
	//CS342 Project 4.
	
	//Name: Shivani Pathak
	//NetID: spath3
	//CS342 Project 4.
	
	//Name: Ruchit Patel
	//NetID: rpate329
	//CS342 Project 4.
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		System.out.println("Group No. 37, and Group members :");
		System.out.println("1.Name: Jay V. Patel");
		System.out.println("  NetID: jpate225\n");
		System.out.println("2.Name: Shivani Pathak");
		System.out.println("  NetID: spath3\n");
		System.out.println("3.Name: Ruchit Patel");
		System.out.println("  NetID: rpate329\n");
		
		//providing a file path to open the file and access it accordingly...
		//NOTE: this will not work until you put the appropriate path where the file exists.
		//"C:\\Users\\Jay Patel\\Desktop\\mystic.txt"
		File file = new File("C:\\Users\\shiv9\\OneDrive\\Desktop\\mystic5.txt");
		Scanner scan=new Scanner(file);
		Game game = new Game(scan);
		
		//playing the game.
		game.playChar();
		
	}

}
