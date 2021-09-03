import java.sql.SQLOutput;
import java.util.Scanner;

public class MadLib {

    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String place;
        String object;
        String trash;
        String password;
        String name;

        System.out.print("Tell me what is your favourite place? (Title Case): ");
        place = read.nextLine();
        System.out.println("Now tell me what your favourite object that has two purposes? (Ignore articles such as 'a' or 'the')?: ");
        object = read.nextLine();
        System.out.println("That is crazy "+ place + " is also where I prefer use a(n) " + object + ". Almost like I just asked you that.");
        System.out.println("Anyway now tell me what is your favourite thing ever? (Singular object): ");
        trash = read.nextLine();
        System.out.println("And while we're at it why not also tell me your favourite combination of letters, numbers, and symbols that you would use to secure yourself: ");
        password = read.nextLine();
        System.out.println("My favourite thing is not " + trash + ". In fact I recently threw one away in a dumpster.");
        System.out.println("Now I must ask, how would you type your name using only standard United States keyboard without any funny words and symbols while also being on one line?: ");
        name = read.nextLine();
        System.out.println("Why hello there " + name + ". Actually that is a terrible name your new name is now Menacing Space Egg Commander LAZR");
        name = "Menacing Space Egg Commander LAZR";
        System.out.println();
        System.out.println("Well then " + name + " if I were you I would go to " + place + " and cry as a man with a(n) " + trash + " is chasing you with a(n) " + object + ".");
        System.out.println("Also thanks for the password. Expect your accounts to be locked out in about three to five business days. I would recommend not using " + password + " as a password ever again.");
    }
}