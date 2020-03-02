package com.restclient.employee.service;

import com.restclient.employee.model.Employee;
import com.restclient.employee.wsdl.EmployeeRequest;
import com.restclient.employee.wsdl.EmployeeResponse;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.Date;


public interface IEmployeeService {

    public EmployeeResponse consumeWebServiceEmployee(EmployeeRequest employeeRequest);

    public EmployeeRequest loadEmployeRequest(String fullName, String lastName, String documentType, String documentNumber, Double salary, String role, Date birthDate, Date dateEntryCompany ) throws DatatypeConfigurationException;

    public Employee loadEmployee(EmployeeResponse employeeResponse) ;

    public Boolean validateAges(Date age) ;

}
