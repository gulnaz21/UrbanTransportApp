package model.TransportMode;

import model.Transport;

public class Trolleybus extends Transport {
    public Trolleybus(int ID, int interval, int capacity, int cost){
        super(ID, interval, capacity, "троллейбус", cost);
    }
}
