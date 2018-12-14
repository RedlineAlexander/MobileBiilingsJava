package javaz.webz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PhoneNumbers {
    @Id
    @Column
    private int Id;
    @Column
    private String services;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Column
    private String phoneNumbers;


    @Column
    private String Service_Name;

    public PhoneNumbers(){

    }

    public String getservices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }



    public void setPhone_Numbers(String phone_Numbers) {
        phone_Numbers = phone_Numbers;
    }

    public String getService_Name() {
        return Service_Name;
    }

    @Override
    public String toString() {
        return "PhoneNumbers{" +
                "Id=" + Id +
                ", Services='" + services + '\'' +
                ", phone_Numbers='" + phoneNumbers + '\'' +
                ", Service_Name='" + Service_Name + '\'' +
                '}';
    }

    public void setService_Name(String service_Name) {
        Service_Name = service_Name;

    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
