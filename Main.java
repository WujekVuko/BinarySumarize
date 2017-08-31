package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int numberOne = in.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int numberTwo = in.nextInt();
        System.out.print("Podaj trzecią liczbę: ");
        int numberThree = in.nextInt();
        int[] list = new int[3];
        list[0] = numberOne;
        list[1] = numberTwo;
        list[2] = numberThree;
        int min = numberOne;
        int max = numberOne;
        for (int a : list) {
            if (a <= min) {
                min = a;

            }
            if (a >= max) {
                max = a;
            }
        }

        System.out.print(min + " jest liczbą najmniejszą, " + max + " jest liczbą największą.");

    }
}
