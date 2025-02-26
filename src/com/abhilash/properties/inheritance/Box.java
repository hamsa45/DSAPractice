package com.abhilash.properties.inheritance;

public class Box {
    int value = 7;
    double l ;
    double w ;
    double h ;

    Box()
    {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    public void display()
    {
        System.out.println(value);
    }
    Box(double value){
        this.l = value;
        this.w = value;
        this.h = value;
    }

    Box (double l, double h, double w)
    {
        this.h = h;
        this.l = l;
        this.w = w;
    }

    Box(Box old)
    {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
}
