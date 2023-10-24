package tech.danielDpq.interfaces;

public interface OperateCar {

    //Constates, se houver

    public int turn(Direction direction, int radius, int startSpeed, int endSpeed);

    public int changeLanes(Direction direction, int startSpeed, int endSpeed);

    public int signalTurn(Direction direction, boolean signalOn);

    public int getRadarFront(double distanceToCar, int speedOfCar);

    public int getRadarRear(double distanceToCar, int speedOfCar);

    public int getRadarRear2(double distanceToCar, int speedOfCar);


}
