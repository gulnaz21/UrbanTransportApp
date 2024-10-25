package model.Employees;

import model.Employee;
import model.Transport;

public class Conductor extends Employee {
    public Conductor(int ID, String name, Transport transport){
        super(ID, name, transport, "кондуктор");
    }
}
