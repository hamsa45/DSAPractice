package com.abhilash.properties.inheritance;

import Abstraction.*;

public class Main {
    public static void main(String[] args) {

//        Payroll payroll = new Payroll();
//
//        payroll.add(new FullTime("John", "Doe", 6000));
//        payroll.add(new FullTime("Jane", "Doe", 6500));
//        payroll.add(new Hourly("Jenifer", "Smith", 200, 50));
//        payroll.add(new Hourly("David", "Wilson", 150, 100));
//        payroll.add(new Hourly("Kevin", "Miller", 100, 150));
//
//        payroll.print();

//        Animal animal = new Cow();
//        animal.makeSound();
//        animal.MakeSound();
//        Animal.myStaticMethod();
//        animal.name();
//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2,3,4,5);
//        System.out.println(box4.weight + "  "+ box4.w+ " "+ box4.l);

        Box box = new Box();
        Box box1 = new BoxWeight();
        box1.display();
        box.display();
    }
}
