package javaz.webz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Services {
    @Id
    @Column
    private  String Name;

    @Column
    private String Service_1;

    @Column
    private String Service_2;

    @Column
    private  String Fare_1_Service;
    @Column
    private  String Fare_2_Service;


    public Services(){

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getService_1() {
        return Service_1;
    }

    public void setService_1(String service_1) {
        Service_1 = service_1;
    }

    public String getService_2() {
        return Service_2;
    }

    public void setService_2(String service_2) {
        Service_2 = service_2;
    }

    public String getFare_1_Service() {
        return Fare_1_Service;
    }

    public void setFare_1_Service(String fare_1_Service) {
        Fare_1_Service = fare_1_Service;
    }

    public String getFare_2_Service() {
        return Fare_2_Service;
    }

    public void setFare_2_Service(String fare_2_Service) {
        Fare_2_Service = fare_2_Service;
    }
}
