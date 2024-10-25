package model.TransportMode;

import model.Transport;

public class Bus extends Transport {
    private final boolean wheelchair; // доступность для инвалидов
    private final int number_of_doors; // количество дверей
    public Bus(int ID, int interval, int capacity, boolean wheelchair, int number_of_doors, int cost){
        super(ID, interval, capacity, "автобус", cost);
        this.wheelchair = wheelchair;
        this.number_of_doors = number_of_doors;
    }

    public boolean isWheelchair() {
        return wheelchair;
    }

    public int getNumber_of_doors() {
        return number_of_doors;
    }

}
