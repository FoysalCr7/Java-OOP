/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startpoint;

/**
 *
 * @author Mobile App Develop
 */
public abstract class Employee {
   private String employeName;
   private String employId;
   private Address address;
   private Contruct contruct;
   public static final  String companyName="Square";

    public String getEmployeName() {
        return employeName;
    }

    public void setEmployeName(String employeName) {
        this.employeName = employeName;
    }

    public String getEmployId() {
        return employId;
    }

    public void setEmployId(String employId) {
        this.employId = employId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contruct getContruct() {
        return contruct;
    }

    public void setContruct(Contruct contruct) {
        this.contruct = contruct;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeName=" + employeName + ", employId=" + employId + ", address=" + address + ", contruct=" + contruct + '}';
    }

 
   
   
   
   public abstract double totalSalary();
    
}
