// AG0706
// Robin Hermann 108017239224, Konstantin Schauerte 108018219798, Leon Mainusch 108020225191
package exercises;

import java.util.Date;
import java.util.Scanner;

class randomNumberGenerator{

    private int seed;

    randomNumberGenerator(){
        seed = 0;
    }
    randomNumberGenerator(boolean randomlySeeded){
        if (randomlySeeded){
            seed = generateRandomNumber();
        }
        else{
            seed = 0;
        }
    }

    public int getNewRandom(){
        return generateRandomNumber();
    }

    public void newSeed(){
        seed = generateRandomNumber();
    }

    private int generateRandomNumber(){
        int modulo = 1000;
        long d = new Date().getTime();

        return (int) (d+seed) % modulo;
    }
}


public class version4 {



    public static void main(String[] args) {
        randomNumberGenerator rng1 = new randomNumberGenerator(false);
        randomNumberGenerator rng2 = new randomNumberGenerator(false);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Random seed the first generator? (y/n) ");

        //read a value fom the console
        String x = scanner.nextLine();

        //set rng1
        if (x.equals("y")){
            rng1.newSeed();
        }

        System.out.print("Random seed the second generator? (y/n) ");

        //read a value fom the console
        x = scanner.nextLine();

        //set rng2
        if (x.equals("y")){
            rng2.newSeed();
        }

        do{
            System.out.println("First random number: " + rng1.getNewRandom());
            System.out.println("Second random number: " + rng2.getNewRandom());
            x = anotherNumber(scanner);

        }while(checkUserInput(x));
    }

    public static String anotherNumber(Scanner scanner){

        System.out.print("New random numbers (y/n)? ");
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



}
