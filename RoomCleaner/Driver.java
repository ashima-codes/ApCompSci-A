import java.util.Scanner;  //may be necessary for input

import javax.swing.JOptionPane;  //may be necessary for input

import kareltherobot.*;

import java.util.ArrayList;

public class Driver implements Directions {
// declared here so it is visible in all the methods!! 
// It will be assigned a value in the getInfo method
    public static void turnRight() {
		roomba.turnLeft();
		roomba.turnLeft();
		roomba.turnLeft();
	}
	private static Robot roomba;
	// You will add very many variables!!

	
	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		Driver d = new Driver();
		Scanner scanner = new Scanner(System.in);
		World.setDelay(EastVal);

		System.out.print("Enter the street number (y): ");
        String street = scanner.nextLine();
    	int numStreet = Integer.parseInt(street);
		System.out.print("Enter the avenue number (x): ");
        String avenue = scanner.nextLine();
		int numAvenue = Integer.parseInt(avenue);

		int beeperCounter = 0;
		int width = 0;
		int length = 0;
		int numOfPiles = 0;
		ArrayList<Integer> pileList = new ArrayList<>();
		int indPileCounter = 0;
		



  /**
	 * This section of code gets info from the user in the following order: 1. Ask the user
	 * which world file they wish to process. Right now, that world file name is
	 * hardcoded in. 2. Ask the user for the starting location and direction of the
	 * Robot. A new Robot should be constructed and assigned to the global
	 * (instance) variable named roomba that is declared on line 10.
	 * 
	 * An inelegant way to interact with the user is via the console, using
	 * System.out.println and a Scanner that scans System.in (input from the
	 * console). A more elegant way to get user input might include using a
	 * JOptionPane.
	 */

    String wrldName = "basicRoom.wld";

		World.readWorld(wrldName);

    World.setVisible(true);


    


	/** This section will have all the logic that takes the Robot to every location 
	 * and cleans up all piles of beepers.  Think about ways you can break this
	 * large, complex task into smaller, easier to solve problems.
	 */

		// the line below causes a null pointer exception
		// what is that and why are we getting it?
		roomba = new Robot(numStreet, numAvenue, East, 0);
		while (true){
			while (roomba.frontIsClear() == true){
				roomba.move();
				width ++;
				if (roomba.nextToABeeper()== true){
					numOfPiles ++;
				}
				while (roomba.nextToABeeper()== true){
					roomba.pickBeeper();
					beeperCounter ++;
				}

		}
		    if (roomba.facingEast()){
				roomba.turnLeft();
				if (roomba.frontIsClear()){
					roomba.move();
					length ++;
					roomba.turnLeft();
				}
				else{
					break;
				}
			}
			else {
				turnRight();
				if (roomba.frontIsClear()){
				roomba.move();
				length ++;
				turnRight();
				}
				else {
					break;
				}	
			}
			while (roomba.frontIsClear() == true){
				roomba.move();
				width ++;
				if (roomba.nextToABeeper()== true){
					numOfPiles ++;
				}
				while (roomba.nextToABeeper()== true){
					roomba.pickBeeper();
					beeperCounter ++;
				}
			}
		    if (roomba.facingEast()){
				roomba.turnLeft();
				if (roomba.frontIsClear()){
				roomba.move();
 				length ++;
				roomba.turnLeft();
				}
				else{
					break;
				}
			}
			else if (roomba.facingWest()) {
				turnRight();
				if (roomba.frontIsClear()){
				roomba.move();
				length ++;
				turnRight();
				}
				else{
					break;
				}	
			}

		}
		System.out.println("The number of beepers is: " + beeperCounter);
		//System.out.println("The width is " + width/(length+1));
		//System.out.println("The length is " + length);
		System.out.println("The area is " + length * (width/(length+1)));
		System.out.println("The number of piles is:  " + numOfPiles);

	


  






  	/** This method displays the results of cleaning the room.  All of the info
	 * in the pdf that describes the problem need to be displayed.  You can present
	 * this info in the console (boring) or you can present using JOptionPane (cool!)
	 */

   // System.out.println("The biggest pile was ");








  }

}
