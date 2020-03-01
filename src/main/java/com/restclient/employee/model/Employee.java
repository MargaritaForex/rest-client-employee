package com.restclient.employee.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("documet_number")
    private String documentNumber;
    @JsonProperty("document_type")
    private String documentType;
    @JsonProperty("salary")
    private Double salary;
    @JsonProperty("role")
    private String role;
    @JsonProperty("birth_date")
    private String birthDate;
    @JsonProperty("date_entry_company")
    private String dateEntryCompany;

    public Employee() {
    }

    public Employee(String fullName, String lastName, String documentNumber, String documentType, Double salary, String role, String birthDate, String dateEntryCompany) {
        this.fullName = fullName;
        this.lastName = lastName;
        this.documentNumber = documentNumber;
        this.documentType = documentType;
        this.salary = salary;
        this.role = role;
        this.birthDate = birthDate;
        this.dateEntryCompany = dateEntryCompany;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getDateEntryCompany() {
        return dateEntryCompany;
    }

    public void setDateEntryCompany(String dateEntryCompany) {
        this.dateEntryCompany = dateEntryCompany;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", documentNumber='" + documentNumber + '\'' +
                ", documentType='" + documentType + '\'' +
                ", salary=" + salary +
                ", role='" + role + '\'' +
                ", birthDate=" + birthDate +
                ", dateEntryCompany=" + dateEntryCompany +
                '}';
    }
}
