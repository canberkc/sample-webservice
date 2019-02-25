package com.devlabs.samples.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SoapStatusWs", namespace = "http://soap_status.com")
@XmlAccessorType(XmlAccessType.FIELD)
public class SoapStatus {

  private String userName;
  private String message;

  public SoapStatus(){
    message = "System is up, thanks for checking.";
  }

  public SoapStatus(String userName){
    this.userName = userName;
    message = "Hi " +  userName + ", system is up, thanks for checking.";
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
