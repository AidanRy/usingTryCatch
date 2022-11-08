package ie.atu.usingTryClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingTryCatch
{
    public static void main(String[] args) {

        Scanner myscan = new Scanner(System.in);
        char repeat = 'y';
        while(repeat == 'y') {
            System.out.println("please enter a number between 0 - 9 :");
            try {
                int myNum = myscan.nextInt();

                if (myNum <= 9 && myNum > 0) {
                    System.out.println("you entered : " + myNum);
                    repeat = 'n';
                } else {
                    System.out.println("Not a valid number ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Not a valid input ");
                myscan.next();
            }
        }
    }
}
