package model.TransportMode;

import model.Transport;

public class Tram extends Transport {
    int number_of_cars; // количество вагонов

    public Tram(int ID, int interval, int capacity, int cost, int number_of_cars){
        super(ID, interval, capacity, "трамвай", cost);
        this.number_of_cars = number_of_cars;
    }

    // присоединить вагон
    public void attach_car(){
        number_of_cars++;
    }

    // отсоединить вагон
    public void detach_car(){
        number_of_cars--;
    }


}
