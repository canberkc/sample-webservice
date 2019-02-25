package com.devlabs.samples.soap;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "SoapStatusService", serviceName = "SoapStatusService",
    portName = "SoapStatusServicePort",
    targetNamespace = "http://soap_status.com")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)
public class SoapStatusService {

  public SoapStatus checkStatus(@WebParam(name = "userNM") String userName){
    SoapStatus stat = new SoapStatus(userName);
    return stat;
  }

}
