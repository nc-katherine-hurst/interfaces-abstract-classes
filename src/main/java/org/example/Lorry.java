package org.example;

public class Lorry extends Vehicle implements Drivable{
    @Override
    void move() {
        System.out.println("The lorry is being driven");
    }
}
