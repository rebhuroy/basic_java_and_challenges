package com.rebhuRoy;

public class Main {

    public static void main(String[] args) {

        char myVar = 'Z';
        switch (myVar) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Value if found in this case actual value is " + myVar);
                break;
            default:
                System.out.println("no value out of them");
                break;
        }
        String month = "janUarY";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Month is january");
                break;
            case "june":
                System.out.println("Month is June");
                default:
                    System.out.println("No Month is required ");
        }
    }
}

