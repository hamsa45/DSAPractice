package Abstraction;

public class Hourly extends Employee{

    private double workedHours;
    private double rate;

    public Hourly(String firstName, String lastName, double workedHours, double rate){
        super(firstName,lastName);
        this.rate = rate;
        this.workedHours = workedHours;
        calculateSalary(this.rate);
        System.out.println("Inside HourlyEmployee Constructor");
    }

    @Override
    protected void calculateSalary(double salary) {
        setSalary(this.rate * this.workedHours);
    }

    @Override
    public double getSalary(){
        System.out.println("Inside HourlyEmployee getSalary Method");
        return super.getSalary();
    }

}
