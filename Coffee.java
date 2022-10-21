package org.example.milan.homework;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Coffee {
    void getCoffee(int Coffee) {

        switch (Coffee) {
            case 1 -> System.out.println("espresso");
            case 2 -> System.out.println("americano - espresso + water");
            case 3 -> System.out.println("cappuccino - espresso + milk");
            case 4 -> System.out.println("tea cooking - tea choosing + water");
            default -> System.out.println("This coffee/tea type doesn't exist");
        }
    }

    public static void main (String[]args){
        Coffee coffee = new Coffee();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Preparing a drink, please input the number of the drink");
        coffee.getCoffee(scanner.nextInt());
    }
}