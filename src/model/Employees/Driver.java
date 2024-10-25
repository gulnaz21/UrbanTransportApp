package model.Employees;

import model.Employee;
import model.Transport;

public class Driver extends Employee {
    public Driver(int ID, String name, Transport transport){
        super(ID, name, transport, "водитель");
    }
}
