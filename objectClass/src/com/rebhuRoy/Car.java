package com.rebhuRoy;

/**
 * Created by rebhu_roy on 06-07-2017.
 */
public class Car {

    private String name;
    private int wheel;

    private int doors;
    public  void  s(){
        System.out.println("hello Moto");
    }

    public void setName(String name) {

        if (name.equals("Rebhu")) {
            this.name = name;
        } else {
            System.out.println("Unknown");
        }
    }

    public String getName() {
        return name;

    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }


    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
