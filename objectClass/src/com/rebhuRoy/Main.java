package com.rebhuRoy;

public class Main {

    public static void main(String[] args) {
        Car porche = new Car();
        porche=null;

        porche.doors=3;
        porche.setName("Rebhu");

        porche.setDoors(2);

        porche.setWheel(4);
        System.out.println("Name Of The Car  " + porche.getName() + "\nNo Of Doors Are  " + porche.getDoors() + "\nNo Of Wheels " +
                porche.getWheel());


    }
}
