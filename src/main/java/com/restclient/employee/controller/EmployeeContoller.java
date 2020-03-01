package com.restclient.employee.controller;

import com.restclient.employee.model.Employee;
import com.restclient.employee.model.ResponseEmployee;
import com.restclient.employee.service.EmployeeService;
import com.restclient.employee.service.IEmployeeService;
import com.restclient.employee.utils.EmpRestConstants;
import com.restclient.employee.wsdl.EmployeeRequest;
import com.restclient.employee.wsdl.EmployeeResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/api")
public class EmployeeContoller {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeContoller.class);
    Map<Integer, Employee> empData = new HashMap<Integer, Employee>();
    @Autowired
    private IEmployeeService service;

    @RequestMapping(value = EmpRestConstants.DUMMY_EMP, method = RequestMethod.GET)
    public @ResponseBody ResponseEmployee getDummyEmployee(@RequestParam String fullName,
                                          @RequestParam String lastName, @RequestParam String documentType,
                                          @RequestParam String documentNumber,@RequestParam Double salary,
                                          @RequestParam String role, @RequestParam Date birthDate,
                                           @RequestParam Date dateEntryCompany
                                                           ) throws DatatypeConfigurationException {
        ResponseEmployee responseEmployee = new ResponseEmployee();
        Employee employee = new Employee();
        logger.info("Start getDummyEmployee");
        EmployeeResponse employeeResponse = service.consumeWebServiceEmployee(service.loadEmployeRequest
                (fullName,lastName,documentType,documentNumber,salary,role,birthDate,dateEntryCompany));
        if(employeeResponse.getEmployee()!=null) {
            employee = service.loadEmployee(employeeResponse);
            responseEmployee.setEmployee(employee);
            responseEmployee.setStatusCode(200);
            responseEmployee.setDescription("succesful transaction");
        }else{
            responseEmployee.setEmployee(employee);
            responseEmployee.setStatusCode(400);
            responseEmployee.setDescription("empty fields please validate");
        }
        return responseEmployee;
    }
}
