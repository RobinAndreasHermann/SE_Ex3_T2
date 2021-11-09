package exercises;
import java.util.Scanner;
import java.util.Date;
// AG0706
// Robin Hermann 108017239224, Konstantin Schauerte 108018219798, Leon Mainusch 108020225191
public class version2 {

    public static void main(String[] args) {

        System.out.print("Random seed the generator? (y/n) ");
        Scanner scanner = new Scanner(System.in);

        //read a value fom the console
        String x = scanner.nextLine();

        //set randomly seeded true if user input was "y"
        boolean randomlySeeded = false;
        if (x.equals("y")){
            randomlySeeded = true;
        }

        do{
            System.out.println(generateRandomNumber(randomlySeeded));
            x = anotherNumber(scanner);

        }while(checkUserInput(x));
    }

    public static String anotherNumber(Scanner scanner){

        System.out.print("Another random number (y/n)? ");
        return scanner.nextLine();
    }

    public static boolean checkUserInput(String input){
        if (input.equals("y")){
            return true;
        }
        else {
            return false;
        }
    }


    public static int generateRandomNumber(boolean randomlySeeded){
        int modulo = 1000;
        int seed = 0;
        if (randomlySeeded){
            seed = generateRandomNumber(false);
        }
        long d = new Date().getTime();

        return (int) (d+seed) % modulo;

    }
}
