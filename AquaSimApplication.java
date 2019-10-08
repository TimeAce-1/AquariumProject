import java.awt.Color;
import java.util.Random;

/** Aquarium Lab Series: <br>    
 *      The AquaSimApplication class contains the main function that will
 *      run the Aquarium Simulation. (This description should be updated
 *      when the behavior of the program changes.)<br>
 *
 * Modifications: <br>
 *   23 March 2008,  Alyce Brady,  Created skeleton main that constructs and
 *                                 displays an empty aquarium.<br>
 *   (date), (your name), Modified to .... <br>
 *
 *  @author  Alyce Brady  (should be Your Name)
 *  @version 23 March 2008  (should be today's date)
 *  @see AquariumController
 **/
public class AquaSimApplication
{
    /**
     *  This is the main function.  It executes the program.
     *  @param    String args[] is never used
     **/
    public static void main(String args[])
    {
        System.out.println("Watch the fishies swim :)");

        // CONSTRUCT OBJECTS NEEDED FOR THE AQUARIUM SIMULATION.
        Random generator = new Random();
        int randNum = generator.nextInt(10);
        randNum = generator.nextInt(10);
        randNum = generator.nextInt(10);
        // Construct the aquarium.  Specify its dimensions when creating it.
        Aquarium aqua;                 // create reference to an Aquarium ...
        aqua = new Aquarium(600, 480); // ... object that has now been created
        //aqua = new Aquarium(100, 200);
        
        // Construct fish and add them to the aquarium.
        
        AquaFish nemo = new AquaFish(aqua, Color.RED);
        AquaFish teemo = new AquaFish(aqua, Color.BLUE);
        AquaFish gyrados = new AquaFish(aqua, Color.BLUE);
        aqua.add(nemo);
        aqua.add(teemo);
        aqua.add(gyrados); 
        
        // Add aquafish to aquarium
        // Construct a graphical user interface (GUI) to display and control
        // the simulation.  The user interface needs to know about the
        // aquarium, so we pass aqua to the user interface constructor.
        AquaSimGUI userInterface;              // create reference to GUI ...
        userInterface = new AquaSimGUI(aqua);  // ... and then GUI itself

        // Tell the user how to start the aquarium simulation.
        System.out.println("Press the start button to start the simulation.");

        // Now wait for the user to press the start button.
        userInterface.waitForStart();

        // Draw the initial view of the aquarium and its contents.
        userInterface.showAquarium();
        // RUN THE AQUARIUM SIMULATION.

        // Make the fish move and redisplay.
        //      CODE MISSING HERE!
        nemo.moveForward();
        teemo.moveForward();
        gyrados.moveForward();
        userInterface.showAquarium();
        for (int i = 0; i<=1; i--)
        {
        nemo.moveForward();
            if (nemo.atWall())
                nemo.changeDir();
        teemo.moveForward();
            if (teemo.atWall())
                teemo.changeDir();
        gyrados.moveForward();
            if (gyrados.atWall())
                gyrados.changeDir();
        userInterface.showAquarium();
        }
        
        // WRAP UP.

        // Remind user how to quit application.
        userInterface.println ("Close GUI display window to quit.");

    }//end main

}//end class
