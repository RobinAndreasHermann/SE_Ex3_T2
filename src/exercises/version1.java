// AG0706, Robin Hermann 108017239224, Konstantin Schauerte 108018219798, Leon Mainusch 108020225191
package exercises;
import java.util.Date;
import java.util.Scanner;

public class version1 {

    public static void main(String[] args) {
        // Version 1 is not implementable because Java does not contain an executable goto statement.

        int modulo = 1000;
        int seed = 0;

        System.out.print("Random seed the generator? (y/n) ");
        Scanner scanner = new Scanner(System.in);

        //read a value fom the console
        String x = scanner.nextLine();

        //set randomly seeded true if user input was "y"
        boolean randomlySeeded = false;
        if (x.equals("y")){
           //goto(33);
        }
        System.out.println((new Date().getTime() +seed) % modulo);
        System.out.print("Another random number (y/n)? ");
        x = scanner.nextLine();

        if (x.equals("y")){
            //goto(25);
        }
        //goto(35);
        seed = (int) new Date().getTime() % modulo;
        //goto(25);
    }
}
