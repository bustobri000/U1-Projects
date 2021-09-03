import java.sql.SQLOutput;
import javax.swing.JOptionPane;
public class RPGCharacter {

    /*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.
     */
    public static void main(String[] args) {

        //Beginning the journey

        String name = JOptionPane.showInputDialog("Before we begin, what is your name?");
        JOptionPane.showMessageDialog(null, "Hello there " + name + ". My name is C.A.T. (Computer Assisted Terminator) \n I will now ask you questions that will determine your fate in this new world! \n Please answer any question starting with a '(#)' with a whole digit number. \n The last time someone didn't I terminated them instantly.");
        //Note: Name here has no relevance and will be thrown away shortly.

        int valor =  Integer.parseInt(JOptionPane.showInputDialog("(#) On a scale of 0 to 10 how much do you like the color red?"));
        //Note: Will be used to calculate health and attack
        int love = Integer.parseInt(JOptionPane.showInputDialog(("(#) Now tell me how much (0 to 10) you are willing to bring harm to a cat?")));
        love = 10 - love;
        //Note: Will be used to calculate health and luck
        int run = Integer.parseInt(JOptionPane.showInputDialog("(#) If it were just me and you in an alleyway how many miles per hour would you have to run to escape me? \n AND DON'T EVEN THINK ABOUT ENTERING A VALUE OVER 30."));

        int fingers = Integer.parseInt(JOptionPane.showInputDialog("(#) Tell me if your friend was being attacked by a bully how many fingers are you willing to sacrifice for them?"));

        String realHeroName = JOptionPane.showInputDialog("Now tell me what do they call you in this new world?");
        //actual math
        int cruelty = love * -1;
        int strength = (valor * (run/5 + 1)) + cruelty;
        int health = 25 + ((love * 5) - cruelty);
        int speed = (run * 5) + strength;
        int luck = Math.abs(love - 10) * 5;
        int fingersX = 10 - fingers;
        int aim = fingersX * 10;
        //final stats

        JOptionPane.showMessageDialog(null, "Well then " + realHeroName + " here are your stats: \nStrength: " + strength + "\nHealth: " + health + "\nSpeed: " + speed + "%\nLuck: " + luck +"%\nAim: " + aim + "%");

        JOptionPane.showMessageDialog(null, "And you have " + fingersX + " fingers left to spare. (Not that it matters!)");


        //messing with the user
        JOptionPane.showMessageDialog(null, "These are all great answers...");
        JOptionPane.showMessageDialog(null, "Your answers will now be deleted.");
        JOptionPane.showMessageDialog(null, "No one can escape the fate chosen for them. \nNo one can choose who they are in this world.");
        JOptionPane.showMessageDialog(null, "Your name is...");
        JOptionPane.showMessageDialog(null, name + "!");
        System.exit(0);
    }
}