import java.util.Scanner;

//This class has Non-Player charcter as an extantion from tha Character Class
//Also it also has an AI interface to generate Random move objects...
//Name: Jay V. Patel
//NetID: jpate225
//CS342 Project 4.

//Name: Shivani Pathak
//NetID: spath3
//CS342 Project 4.

//Name: Ruchit Patel
//NetID: rpate329
//CS342 Project 4.
public class NPC extends Character 
{
	PlayerInterface AI ;	
	public NPC(Scanner G2, double Version2) 
	{
		super(G2, Version2);
	    AI = new PlayerInterface ();
		// TODO Auto-generated constructor stub
	}
	void makeNPCMove()
	{
		//Future Enhancement: This will allow Computer to USE NPC characters to play Against the user,
		//to make the game experience harder.
	}
}