package exercises;

import java.util.Date;
import java.util.Scanner;

public class version3 {

    public static void main(String[] args) {

        System.out.print("Random seed the generator? (y/n) ");
        Scanner scanner = new Scanner(System.in);

        //read a value fom the console
        String x = scanner.nextLine();

        while(checkUserInput(x)){
            System.out.println(generateRandomNumber());
            x = anotherNumber(scanner);

        }
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


    public static int generateRandomNumber(){

        int modulo = 1000;

        long d = new Date().getTime();

        return (int) d % modulo;

    }
}
