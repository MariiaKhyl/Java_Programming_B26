package day47_encapsulation.RoadAndTrificLights;

import day47_encapsulation.RoadAndTrificLights.TrafficLights;

public class Road {
    public static void main(String[] args) {

        TrafficLights light = new TrafficLights("grey");
//        System.out.println(light.color);
//        light.color = "pink";

         TrafficLights light2 = new TrafficLights("red");
        System.out.println(light2.getColor());
        light2.setColor("grey");

        System.out.println(light2.getColor());

        TrafficLights ligth3 = new TrafficLights("black");
        System.out.println(ligth3.getColor());


    }
}
