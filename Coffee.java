package org.example.milan.homework;

import java.util.Scanner;

public class Coffee {
    void getCoffee(int button) {
        switch (button) {
            case 1 -> System.out.println("espresso");
            case 2 -> System.out.println("americano - espresso + water");
            case 3 -> System.out.println("cappuccino - espresso + milk");
            case 4 -> System.out.println("tea cooking - tea choosing + water");
            default -> System.out.println("This coffee/tea type doesn't exist");

        }


    }

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Scanner scanner = new Scanner(System.in);



    }
}











