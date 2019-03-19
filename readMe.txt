//ReadMe file

Name: Jay Patel
NetID: jpate225
UIN: 653798119
ACCC: jpate14
CS 342 Project 5

Name: Shivani Pathak
NetID: spath3
UIN: 661646405
ACCC: spathak
CS 342 Project 5

Name: Ruchit Patel
NetID: rpate329
UIN: 679500553
ACCC: rpatel1
CS 342 Project 5

Submission Description:

1. I have followed professor's instructions to make classes and also the functions for each class.
2. I have five java class files (Direction.java,Place.java,Game.java,gameTester.java,Artifact.java..etc...) also,
   there is readMe file in my submission folder. 
3. NOTE: Provide appropriate path for the "data file" in gameTester.java file.
4. RUN: type make, java gameTester.

Game Logic:
1. I have made the game using the input of the file "Mystic_city_5.0.gdf"
2. Once you run the program, it will display user the name of the game, and the choices that user can enter.
3. If you type "look" on the very first turn you will see your current place and description with the Artifact information.
4. i have used Enum DirType{} so that Program accepts "North", "NORTH", "N", "North", "GO NORTH", etc. variations for all the directions.
5. Once user types the direction the program will follow it and check whether the input is valid or not, and
   direction is locked or unlocked.
6. Prints out the exception message when the direction is locked.
7. Descriptions of the important functions are in comment section at the beginning of the each function.
8. User has four new commands Get,Drop,Use,Inventory.
9. inventory prints out the Artifacts.

Enhancement:
1. It accepts variations of user inputs for 19 possible directions with Enum..
	For example, to go North the user can type,
	["GO N","GO NORTH","GO North","GO north",
		"Go North","Go north","NORTH","North",
		"north","N","n" ]  
		
2. Now the Game class does not have the play() mathod anymore.
3. there is no CurrentPalce in Game class...Each Characters have their own Current Places.
4. If you want to exit the game you have to exit from all the CHaracter game playing.
5. I have implemented the Player part of the program, There will be future enhancement of NPC, AI interface.
//-------------------Project4 enhancements--------------
6. There are new classes including NPC, Player, Move etc.
7. Now, Move class creates an Object of user input for futhur assesment.
8. Game class and Character class got their Updates as well.
9. Game class now provides user with two options or ways he/she can play the game.
	1. he/she can either pick the existing character and play the game.
	2. Or he/she can create their own Characters with ID and Discriptions as they please and Play the game.
10. Character Class now has a constructor to create user defined objects.

//-----------------------------------------Jay Patel----------------------------------------------------//
Jay's GUI:

Note: Made appropriate changes to the Game Class, Character Class, and Place Class.
INPUT:
1. My interface has Buttons for all the possible direction visible on the frame.
2. Also, I have included buttons for LOOK, INVENTORY, AND EXIT.
3. Moreover, I have included a Text Input Area so that user can type in the name of the Artifact 
to wrok with the button GET, DROP, AND USE.
OUTPUT:
1. Text Area for the out put of the appropriate button commands.
2. Also has Scrolling ability to enhance the visibility of the Game.
//-------------------------------------------------------------------------------------------------------
//-----------------------------------------Shivani Pathak-----------------------------------------------//
Shivani's GUI:

1. To play the game, select all the directions you want to choose [Example: If you want to go North-northwest,
   then select N and NW both and then press Go button. This will make a move in the specified direction or 
   print if it is an invalid direction.
2. Similarly, if you want to look what all a place contains, you can select Look and then press Submit button.
   Selecting inventory and then pressing submit will show what all a player has in his bag.
3. The second column contains a text box where you can type the name of any artifact you want and then press get, 
   use, or drop as per your wish.
4. Press Exit if you want to exit the game. 
//------------------------------------------Ruchit Patel------------------------------------------------//
Ruchit's GUI:

1. First Declare all the GUI basic needs in code. As example JFrame, JText, JLabel.
2. Then create size of JFrame, add title, add close operation mathode, and set background color of frame.
3. Write down all the labels and set font size and font color.
4. Create new panels set layout and add labels.
5. Create small user command window, where collect all the command from user.
6. Create all the buttons and set name, size and added to actionlistner.
7. ActionPerformance function set diffrent action as press diffrent buttons.
8. Joint the performance of button and collected command from user, then send to command text.
