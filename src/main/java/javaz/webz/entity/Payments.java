package javaz.webz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pay2")
public class Payments {
    @Id
    @Column
    private String name;
    @Column
    private String Surname;

    @Column
    private String Users_Phone_Numbers;

    @Column
    private String Type_Of_Payments_Network;

    @Column
    private String Service_Name;
    @Column
    private int Phone_Numbers_Id;

    public Payments() {

    }

    @Override
    public String toString() {
        return "Payments{" +
                "name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Users_Phone_Numbers='" + Users_Phone_Numbers + '\'' +
                ", Type_Of_Payments_Network='" + Type_Of_Payments_Network + '\'' +
                ", Service_Name='" + Service_Name + '\'' +
                ", Phone_Numbers_Id=" + Phone_Numbers_Id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getUsers_Phone_Numbers() {
        return Users_Phone_Numbers;
    }

    public void setUsers_Phone_Numbers(String users_Phone_Numbers) {
        Users_Phone_Numbers = users_Phone_Numbers;
    }

    public String getType_Of_Payments_Network() {
        return Type_Of_Payments_Network;
    }

    public void setType_Of_Payments_Network(String type_Of_Payments_Network) {
        Type_Of_Payments_Network = type_Of_Payments_Network;
    }

    public String getService_Name() {
        return Service_Name;
    }

    public void setService_Name(String service_Name) {
        Service_Name = service_Name;
    }

    public int getPhone_Numbers_Id() {
        return Phone_Numbers_Id;
    }

    public void setPhone_Numbers_Id(int phone_Numbers_Id) {
        Phone_Numbers_Id = phone_Numbers_Id;
    }
}
