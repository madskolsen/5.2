package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int tilfældig = random.nextInt(100) + 1;
        boolean win = false;
        int i;
        System.out.println("I'm thinking of a number between 1-100, can you guess what it is?");

        for (i=0; i<3; i++) {
            System.out.println("Type a number: ");
            int x = scanner.nextInt();

            if (x == tilfældig) {
                System.out.println("Det var rigtigt!");
                win = true;
            } else if (x > tilfældig) {
                System.out.println("Det var forkert. Du gættede på: " + x);
                System.out.println("Du gættede for højt!");
                System.out.println("Forskellen på de to tal er: " + (x - tilfældig));


            } else if (tilfældig>x) {
                System.out.println("Det var forkert. Du gættede på: " + x);
                System.out.println("Du gættede for lavt!");
                System.out.println("Forskellen på de to tal er: " + (tilfældig - x));
            }

            }
        System.out.println("Du gættede forkert 3 gange, du har tabt.");
        }
    }





