package com.restclient.employee.service;

import com.restclient.employee.model.Employee;
import com.restclient.employee.wsdl.EmployeePort;
import com.restclient.employee.wsdl.EmployeePortService;
import com.restclient.employee.wsdl.EmployeeRequest;
import com.restclient.employee.wsdl.EmployeeResponse;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

@Service
public class EmployeeService implements IEmployeeService {


    @Override
    public EmployeeResponse consumeWebServiceEmployee(EmployeeRequest employeeRequest) {
        EmployeeResponse employee = new EmployeeResponse();
        if(validateNullAndEmpty(employeeRequest)) {
            EmployeePortService service = new EmployeePortService();
            EmployeePort employeePort = service.getEmployeePortSoap11();
            employee = employeePort.employee(employeeRequest);
            System.out.println(employee);
        }
        return employee;
    }

    private Boolean validateNullAndEmpty(EmployeeRequest employeeRequest){
        if((employeeRequest.getFullName()!=null && !employeeRequest.getFullName().isEmpty()) &&
        (employeeRequest.getLastName()!=null && !employeeRequest.getLastName().isEmpty()) &&
        (employeeRequest.getDocumentType()!=null && !employeeRequest.getDocumentType().isEmpty()) &&
        (employeeRequest.getDocumentNumber()!=null && !employeeRequest.getDocumentNumber().isEmpty())&&
        (employeeRequest.getRole()!=null && !employeeRequest.getRole().isEmpty() )){
            return true;
        }
        return false;
    }

    @Override
    public EmployeeRequest loadEmployeRequest(String fullName, String lastName, String documentType, String documentNumber, Double salary, String role, Date birthDate, Date dateEntryCompany ) throws DatatypeConfigurationException {
        EmployeeRequest employeeRequest = new EmployeeRequest();
        employeeRequest.setFullName(fullName);
        employeeRequest.setLastName(lastName);
        employeeRequest.setDocumentType(documentType);
        employeeRequest.setDocumentNumber(documentNumber);
        employeeRequest.setSalary((salary!=null?salary:0.0));
        employeeRequest.setRole(role);
        employeeRequest.setBirthDate(getGregoryCal(birthDate));
        employeeRequest.setDateEntryCompany(getGregoryCal(dateEntryCompany));
        return employeeRequest;
    }

    private XMLGregorianCalendar getGregoryCal(Date date) throws DatatypeConfigurationException {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        XMLGregorianCalendar xCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        return xCal;
    }


    @Override
    public Employee loadEmployee(EmployeeResponse employeeResponse) {
        Employee emp = new Employee();
        emp.setFullName(employeeResponse.getEmployee().getFullName());
        emp.setLastName(employeeResponse.getEmployee().getLastName());
        emp.setDocumentType(employeeResponse.getEmployee().getDocumentType());
        emp.setDocumentNumber(employeeResponse.getEmployee().getDocumentNumber());
        emp.setRole(employeeResponse.getEmployee().getRole());
        emp.setSalary(employeeResponse.getEmployee().getSalary());
        emp.setBirthDate(toDate(employeeResponse.getEmployee().getBirthDate()));
        emp.setDateEntryCompany(toDate(employeeResponse.getEmployee().getDateEntryCompany()));
        return emp;
    }

    public  String toDate(XMLGregorianCalendar calendar){
        if(calendar == null) {
            return null;
        }
        DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
        return formatter.format(calendar.toGregorianCalendar().getTime());

    }
}
