package com.abhilash.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2,3,4,5);
        System.out.println(box4.weight + "  "+ box4.w+ " "+ box4.l);
    }
}
