package org.example;

public class Road extends Environment<Car>{
    @Override
    public void checkTraffic() {
        for ( Drivable vehicle : this.traffic) {
            System.out.println(vehicle.getClass().getSimpleName() + " is driving!");
        }
    }
}
