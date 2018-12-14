package javaz.webz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class PhoneNumbersServices implements Serializable{

 @Column
   private String Services;
@Id
    @Column
    private  int Phone_Numbers_Id;
@Id
    @Column
    private String Services_Name;

public PhoneNumbersServices(){}

    public String getServices() {
        return Services;
    }

    public void setServices(String services) {
        Services = services;
    }

    public int getPhone_Numbers_Id() {
        return Phone_Numbers_Id;
    }

    public void setPhone_Numbers_Id(int phone_Numbers_Id) {
        Phone_Numbers_Id = phone_Numbers_Id;
    }

    public String getServices_Name() {
        return Services_Name;
    }

    public void setServices_Name(String services_Name) {
        Services_Name = services_Name;
    }
}
