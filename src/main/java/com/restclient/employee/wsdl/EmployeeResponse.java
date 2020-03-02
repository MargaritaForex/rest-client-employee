
package com.restclient.employee.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Employee" type="{employee.soap}Employee"/>
 *         &lt;element name="serviceStatus" type="{employee.soap}serviceStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "employee",
        "serviceStatus"
})
@XmlRootElement(name = "EmployeeResponse")
public class EmployeeResponse {

    @XmlElement(name = "Employee", required = true)
    protected Employee employee;
    @XmlElement(required = true)
    protected ServiceStatus serviceStatus;

    /**
     * Obtiene el valor de la propiedad employee.
     *
     * @return
     *     possible object is
     *     {@link Employee }
     *
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * Define el valor de la propiedad employee.
     *
     * @param value
     *     allowed object is
     *     {@link Employee }
     *
     */
    public void setEmployee(Employee value) {
        this.employee = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceStatus.
     *
     * @return
     *     possible object is
     *     {@link ServiceStatus }
     *
     */
    public ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Define el valor de la propiedad serviceStatus.
     *
     * @param value
     *     allowed object is
     *     {@link ServiceStatus }
     *
     */
    public void setServiceStatus(ServiceStatus value) {
        this.serviceStatus = value;
    }

}
