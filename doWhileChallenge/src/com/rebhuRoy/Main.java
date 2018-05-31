package com.rebhuRoy;

public class Main {

    public static void main(String[] args) {
        int start = 2, end = 10;
        while (start <= end) {
            if (!isEven(start)) {
                System.out.println(start);
                start++;
                continue;
            }
        }
    }

    public static boolean isEven(int n) {

        if (n % 2 == 0) {
            return true;
        }
        return false;

    }

}

