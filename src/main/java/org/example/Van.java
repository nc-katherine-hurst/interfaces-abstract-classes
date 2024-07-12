package org.example;

public class Van extends Vehicle implements Drivable{
    @Override
    void move() {
        System.out.println("The van is being driven");
    }
}
