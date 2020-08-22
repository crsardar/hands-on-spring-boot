package com.crsardar.springsoap;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.CUSTOM, customFaultCode = "{ttp://com.crsardar.springboot.soap/emp}400")
public class InvalidInputException extends RuntimeException{

    static final long serialVersionUID = -7034897190745766999L;

    public InvalidInputException(String message) {
        super(message);
    }
}
