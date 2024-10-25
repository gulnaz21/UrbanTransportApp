
import logic.TransportSystem;
import model.Employee;
import model.Employees.Conductor;
import model.Employees.Driver;
import model.Stop;

import model.Transport;
import model.TransportMode.Bus;
import model.TransportMode.Tram;
import model.TransportMode.Trolleybus;

import java.util.ArrayList;
import java.util.List;

public class AppRunner {
    public static void main(String[] args) {

        // создаем остановки
        Stop stop1 = new Stop("Ж/д вокзал");
        Stop stop2 = new Stop("Колхозный рынок");
        Stop stop3 = new Stop("Габдуллы Тукая");
        Stop stop4 = new Stop("Театр им. Камала");
        Stop stop5 = new Stop("Театр им. Тинчурина");

        // создаем транспорт
        Transport bus1 = new Bus(10, 10, 29, true, 3, 45);
        Transport bus2 = new Bus(2, 25, 29, true, 3, 45);
        bus1.addReserve(bus2);
        Transport tram = new Tram(1, 15, 50, 45, 2);
        Transport trolleybus = new Trolleybus(5, 10, 29, 45);

        // создаем персонал
        Employee driver1 = new Driver(1, "Иван", bus1);
        Employee conductor1 = new Conductor(2, "Ольга", bus1);

        Employee driver2 = new Driver(3, "Рамис", bus2);
        Employee conductor2 = new Conductor(4, "Азалия", bus2);


        // создаем маршрут транспорта
        bus1.addStop(stop1, stop2, new Stop("Худякова"), stop3, new Stop("Станция метро пл. Тукая"));
        bus2.addStop(stop5, stop4, stop3, stop2, stop1);
        tram.addStop(stop1, stop4, stop5);
        trolleybus.addStop(stop5, stop4, stop1);

        TransportSystem transportSystem = new TransportSystem();

        transportSystem.showInfoTransport(bus1);
        transportSystem.breakDown(bus1);
        transportSystem.showStop(trolleybus);
        transportSystem.breakDown(tram);
        transportSystem.repair(bus1);
        transportSystem.showTransport(stop1);
    }
}