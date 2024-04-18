package org.example;

public class Main {
    public static void main(String[] args) {
        UnUSRobot unUSRobot = new UnUSRobot(5);
        RiojaRobotsInterface riojaRobot = new AdaptadorUnUSRobot(unUSRobot);
        System.out.println(riojaRobot.velocidadActualEnKmh());
        riojaRobot.salta(2);
    }
}