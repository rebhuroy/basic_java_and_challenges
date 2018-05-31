package com.rebhuRoy;

public class Main {

    public static void main(String[] args) {

        double myFirstVar = 20d;
        double mySecondVar = 80d;
        double result = 25d * (myFirstVar + mySecondVar);

        double rem = (myFirstVar + mySecondVar + result) % 40d;

        if (rem <= 20d)
            System.out.println("Total was over the limit");


    }
}
