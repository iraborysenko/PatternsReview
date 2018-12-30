package Creational.Singleton;

import java.util.ArrayList;


public class Singleton {

    private static volatile Singleton INSTANSE;
    private int numberOfRockets = 4;
    private int numberOfSatellites = 1;
    private ArrayList<String> workersOnStation = new ArrayList<>();
    private ArrayList<String> workersOnEarth = new ArrayList<>();


    private Singleton() {
        workersOnEarth.add("Petrov");
        workersOnEarth.add("Ivanov");
    }

    public static Singleton getInstance() {
        if (INSTANSE == null) {
            synchronized (Singleton.class) {
                if (INSTANSE == null) {
                    INSTANSE = new Singleton();
                }
            }
        }

        return INSTANSE;
    }

    public void flyToTheMoon() {
        if (numberOfRockets > 0) {
            System.out.println("We fly to the moon");
            --numberOfRockets;
        } else {
            System.out.println("All rockets were lent");
        }
    }

    public void flyAroundTheEarth(int numberOfCircles) {
        System.out.println("We flew around Earth " + numberOfCircles + " times");
    }

    public void launchSatellite() {

        if (numberOfSatellites > 0) {
            System.out.println("We launched satellite");
            --numberOfSatellites;
        } else {
            System.out.println("All satellites were lent");
        }
    }

    public void changeWorkerOnStation(String nameWorkerToEarth, String nameWorkerToStation) {
        workersOnStation.add(nameWorkerToStation);
        workersOnEarth.remove(nameWorkerToEarth);
        System.out.println("Number of workers on Earth is " + workersOnEarth);
        System.out.println("Number of workers on Station is " + workersOnStation);
    }
}

class A {
    public static void main(String... args) {
        final Singleton singleton = Singleton.getInstance();

        singleton.flyToTheMoon();
        singleton.flyToTheMoon();
        singleton.flyToTheMoon();
        singleton.flyToTheMoon();

        singleton.flyAroundTheEarth(5);

        singleton.launchSatellite();
        singleton.launchSatellite();

        singleton.changeWorkerOnStation("Ivanov", "Sydorov");
    }
}
