
package com.restclient.employee.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EmployeePort", targetNamespace = "employee.soap")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmployeePort {


    /**
     * 
     * @param employeeRequest
     * @return
     *     returns client.EmployeeResponse
     */
    @WebMethod(operationName = "Employee")
    @WebResult(name = "EmployeeResponse", targetNamespace = "employee.soap", partName = "EmployeeResponse")
    public EmployeeResponse employee(
        @WebParam(name = "EmployeeRequest", targetNamespace = "employee.soap", partName = "EmployeeRequest")
        EmployeeRequest employeeRequest);

}
