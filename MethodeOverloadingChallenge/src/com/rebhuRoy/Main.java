package com.rebhuRoy;

public class Main {

    public static void main(String[] args) {
        double feet=6;


       double cen = calculateFeetAndInchesToCentimeters(feet);
        System.out.println( cen);
    }

    public static double calculateFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches >= 0) && (inches <= 12)) {
            double centimiture = 2.54d * inches;
            return centimiture;
        }

        return -1;
    }

    public static double calculateFeetAndInchesToCentimeters(double feet) {
        if (feet >= 0) {
            double inches = 12d * feet;
           return  calculateFeetAndInchesToCentimeters(feet, inches);
        }
            return -1;
    }

}
