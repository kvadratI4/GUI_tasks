package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int leftLimit = 0, rightLimit = 2147483647;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number from 0 to 2147483647: ");
        int userNumber = in.nextInt();

        if ((userNumber < leftLimit) | (userNumber > rightLimit)){
            System.out.println("incorrect value");
        } else {
            int middleValue;
            boolean isFound = false;
            int userAnswer;

            while (!(isFound)){
                middleValue = (leftLimit + rightLimit) / 2;

                System.out.println("I guess your number is: " + middleValue);
                System.out.print("Send 0 if I guessed right; ");
                System.out.print("1 if your number is greater; ");
                System.out.print("2 if your number is less: -> ");

                Scanner in_ = new Scanner(System.in);
                userAnswer = in_.nextByte();

                if (userAnswer == 0){
                    System.out.println("it was easy");
                    isFound = true;
                }

                else if (userAnswer == 1) {
                    System.out.println("Ok, I will try again");
                    leftLimit = middleValue + 1;

                } else {
                    System.out.println("Ok, I will try again");
                    rightLimit = middleValue;
                }

            }
        }

    }
}
