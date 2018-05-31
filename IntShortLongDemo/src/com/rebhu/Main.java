package com.rebhu;

public class Main {

    public static void main(String[] args) {
	// write your code here

  byte myByte =13;
  short myShort =8;
  int myInt = 14;
   long result ;
   result = 50000L +   10L * (myByte + myShort + myInt);
   short myShortResult =  (short)(myByte + myShort + myInt);
        System.out.println("result is "+ result);
        System.out.println(myShortResult);

int newInt =130;
byte newByte = (byte)newInt;
        System.out.println(newByte);
    }
}
