package org.example;

public class Duck extends Bird implements Swimmable{

    @Override
    void makeSound() {
        System.out.println("QUACK");
    }
}
