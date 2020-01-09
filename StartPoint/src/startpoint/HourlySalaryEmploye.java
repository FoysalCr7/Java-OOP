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
public class HourlySalaryEmploye extends Employee {
    private double totalHour;
    private double hourlyRate;

    public double getTotalHour() {
        return totalHour;
    }

    public void setTotalHour(double totalHour) {
        this.totalHour = totalHour;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "HourlySalaryEmploye{" + "totalHour=" + totalHour + ", hourlyRate=" + hourlyRate + '}';
    }


    @Override
    public double totalSalary() {
       return hourlyRate*totalHour;
    }
    
    

  
    
    
}
