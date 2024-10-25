package model;


import java.util.ArrayList;
import java.util.List;

public class Transport {
    private final int ID;             // номер автобуса
    private int interval;             // интервал движения
    private final int capacity;       // количество мест
    private boolean work;             // работоспособность
    private final List<String> stops;   // маршрут
    private final String type;        // тип транспорта
    private int cost;                 // стоимость проезда
    private final List<String> employees; // персонал
    private Transport reserve; //резервный транспорт

    public Transport(int ID, int interval, int capacity, String type, int cost){
        this.ID = ID;
        this.interval = interval;
        this.capacity = capacity;
        this.type = type;
        this.cost = cost;
        employees = new ArrayList<>();
        stops = new ArrayList<>();
        work = true;
    }

    // конструктор для создания резервного транспорта
    public Transport(Transport transport){
        this.ID = transport.getID();
        this.interval = transport.getInterval();
        this.capacity = transport.getCapacity();
        this.type = transport.getType();
        this.cost = transport.getCost();
        employees = new ArrayList<>();
        stops = new ArrayList<>(transport.getStops());
        work = true;
    }
    public void addReserve(Transport transport){
        reserve = transport;
    }

    public int getID() {
        return ID;
    }

    public boolean isWork() {
        return work;
    }

    public void setWork(boolean work) {
        this.work = work;
    }

    public String getType(){
        return type;
    }
    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<String> getStops() {
        return stops;
    }
    public void addStop(Stop ... stop){
        for (Stop s : stop) {
            stops.add(s.getName());
            s.setTransports(getType() + " № " + getID());
        }
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void addEmployee(String employee){
        employees.add(employee);
    }

    public void removeEmployee(String employee){
        employees.add(employee);
    }

    public List<String> getEmployees() {
        return employees;
    }

    public Transport getReserve() {
        return reserve;
    }

    @Override
    public String toString() {
        return  type + " № " + ID + "\n" +
                "Интервал: " + interval + " минут\n" +
                "Количество мест: " + capacity + "\n" +
                "Стоимость проезда: " + cost + "₽\n" +
                "Маршрут: " + String.join(" -> ", stops) + "\n" +
                "Персонал: " + String.join(", ", employees) + "\n";
    }
}

