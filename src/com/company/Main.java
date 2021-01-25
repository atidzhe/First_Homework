package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String petsName = "Georgi";
        String favoriteAction = "Programming";
	    System.out.println(petsName + " likes to " + favoriteAction);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter yours pet's name: ");
        String animalName = scanner.nextLine();

        System.out.println("Enter his favorite action: ");
        String animalFavoriteAction = scanner.nextLine();

        System.out.println("My name's pet is: " + animalName);
        System.out.println("His favorite action is: " + animalFavoriteAction);
    }
}
