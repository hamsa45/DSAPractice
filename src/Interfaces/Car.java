package Interfaces;

public class Car implements IEngine, IBrake, IMedia{


    @Override
    public void applyBrake() {
        System.out.println("I brake like a normal car, Brakes are applied.");
    }

    @Override
    public void start() {
        System.out.println("Engine start like in a normal car.");
    }

    @Override
    public void stop() {
        System.out.println("Engine stop like in a normal car.");

    }

    @Override
    public void accelerate() {
        System.out.println("i accelerate like a normal car.");

    }
}
