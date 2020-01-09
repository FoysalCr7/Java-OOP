/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop;

/**
 *
 * @author Mobile App Develop
 */
public class Address {
    
    private String house;
    private String road;
    private String city;
    private int zip;
    private String phone;
    private String email;

    public Address(String house, String road, String city, int zip, String phone, String email) {
        this.house = house;
        this.road = road;
        this.city = city;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Address{" + "house=" + house + ", road=" + road + ", city=" + city + ", zip=" + zip + ", phone=" + phone + ", email=" + email + '}';
    }
    
   
    
}
