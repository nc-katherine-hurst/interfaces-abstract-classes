package org.example;

public class Water extends Environment<Swimmable>{
    @Override
    public void checkTraffic() {
        for ( Swimmable swimmable : this.traffic) {
            System.out.println(swimmable.getClass().getSimpleName() + " is swimming!");
        }
    }
}
