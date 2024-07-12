package org.example;

public class Sky extends Environment<Flyable>{
    @Override
    public void checkTraffic() {
        for ( Flyable flyable : this.traffic) {
            System.out.println(flyable.getClass().getSimpleName() + " is flying!");
        }
    }
}
