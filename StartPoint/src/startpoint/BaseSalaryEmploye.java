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
public class BaseSalaryEmploye extends Employee {
    
    private double baseSalary;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public static String getCompanyName() {
        return companyName;
    }


    @Override
    public double totalSalary() {
            return baseSalary;
    }

       @Override
    public String toString() {
        return  super.toString()+"Employee{" + "employeName=" + getEmployeName() + ", employId=" + getEmployId() + ", address=" + getAddress() + ", contruct=" + getContruct() +"basSalary"+baseSalary+ '}';
    }

 


}
