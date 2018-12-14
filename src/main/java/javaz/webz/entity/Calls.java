package javaz.webz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;

@Entity
public class Calls {

    @Column
    private  String Source_Number;
    @Column
    private String Destination_Number;
    @Column
    private String Timing_Calls_While;
    @Id

    @Column
    private String Fare_Per_Month;
    @Column
    private String Payments_User_Phone_Number;

    public Calls(){}

    public String getSource_Number() {
        return Source_Number;
    }

    public void setSource_Number(String source_Number) {
        Source_Number = source_Number;
    }

    public String getDestination_Number() {
        return Destination_Number;
    }

    public void setDestination_Number(String destination_Number) {
        Destination_Number = destination_Number;
    }

    public String getTiming_Calls_While() {
        return Timing_Calls_While;
    }

    public void setTiming_Calls_While(String timing_Calls_While) {
        Timing_Calls_While = timing_Calls_While;
    }

    public String getFare_Per_Month() {
        return Fare_Per_Month;
    }

    public void setFare_Per_Month(String fare_Per_Month) {
        Fare_Per_Month = fare_Per_Month;
    }

    public String getPayments_User_Phone_Number() {
        return Payments_User_Phone_Number;
    }

    public void setPayments_User_Phone_Number(String payments_User_Phone_Number) {
        Payments_User_Phone_Number = payments_User_Phone_Number;
    }
}
