package org.example;

import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void main(String[] args) {

            Sky sky = new Sky();
            sky.addTraffic(new Duck());
            sky.addTraffic(new Pigeon());
            sky.addTraffic(new Aeroplane());

            Water water = new Water();
            water.addTraffic(new Duck());
            water.addTraffic(new Fish());

            Road road = new Road();
            road.addTraffic(new Car());
            road.addTraffic(new Van());
            road.addTraffic(new Lorry());

            List<Environment<?>> environments = List.of(sky, water, road);

            for (Environment<?> environment: environments) {
                environment.checkTraffic();
            }

        }


}