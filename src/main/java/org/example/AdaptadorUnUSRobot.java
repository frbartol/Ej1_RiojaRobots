package org.example;

public class AdaptadorUnUSRobot implements RiojaRobotsInterface{
    UnUSRobot unUSRobot;
    public AdaptadorUnUSRobot(UnUSRobot robot){
        this.unUSRobot = robot;
    }

    @Override
    public double velocidadActualEnKmh() {
        return unUSRobot.currentSpeedInMilesPerHour()*1.6;
    }

    @Override
    public void salta(double distancia) {
        unUSRobot.jump(distancia/0.3);
    }
}
