package com.restclient.employee.model;

public class ResponseEmployee extends  ResponseParent{

    public Employee employee;

    public ResponseEmployee() {
    }

    public ResponseEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
