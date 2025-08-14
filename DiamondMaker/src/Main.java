import kareltherobot.*;
public class Main implements Directions{

      public static void main(String[] args) {
        World.setVisible(true);// allows us to see the run
        World.setSize(9, 9);
    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot r = new Robot(1,5,North,100);

    for (int j = 0; j < 4; j++) {
        for (int i = 0; i < 4; i++ ){
            r.putBeeper();
            r.move();
            r.turnLeft();
            r.move();
            r.turnLeft();
            r.turnLeft();
            r.turnLeft();
        }
        r.turnLeft();
        r.turnLeft();
        r.turnLeft();

    }
  }
}