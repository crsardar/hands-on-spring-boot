/**
 * @author CRSardar
 *
 * https://github.com/crsardar
 */
package com.crsardar.springsoap;

import com.crsardar.springsoap.models.*;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EmpDetailsEndPoint {

    @PayloadRoot(namespace = "http://com.crsardar.springboot.soap/emp", localPart = "GetEmployeeRequest")
    @ResponsePayload
    public GetEmployeeResponse getEmployee(@RequestPayload  GetEmployeeRequest getEmployeeRequest){

        EmployeeDetails employeeDetails = new EmployeeDetails();
        employeeDetails.setId(getEmployeeRequest.getId());
        employeeDetails.setName("Chittaranjan Sardar");
        employeeDetails.setDescription("An Engineer");

        GetEmployeeResponse response = new GetEmployeeResponse();
        response.setEmployeeDetails(employeeDetails);

        return response;
    }

    @PayloadRoot(namespace = "http://com.crsardar.springboot.soap/emp", localPart = "GetAllEmployeeRequest")
    @ResponsePayload
    public GetAllEmployeeResponse getAllEmployee(@RequestPayload  GetAllEmployeeRequest request){

        GetAllEmployeeResponse response = new GetAllEmployeeResponse();

        if(request.getCount()>0)
        {
            for (int i = 0; i<request.getCount(); i++)
            {
                EmployeeDetails employeeDetails = new EmployeeDetails();
                employeeDetails.setId(i);
                employeeDetails.setName("Emp Name of " + i);
                employeeDetails.setDescription("Description of Emp " + i);

                response.getEmployees().add(employeeDetails);
            }
        }
        else {
            throw new InvalidInputException("Count should be more than 0");
        }
        return response;
    }
}
