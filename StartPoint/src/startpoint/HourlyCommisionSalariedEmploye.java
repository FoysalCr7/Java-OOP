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
public class HourlyCommisionSalariedEmploye extends HourlySalaryEmploye  {
    
    private double growSale;
    private double commisionRate;

    public double getGrowSale() {
        return growSale;
    }

    public void setGrowSale(double growSale) {
        this.growSale = growSale;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }

    @Override
    public String toString() {
        return "HourlyCommisionSalariedEmploye{" + "growSale=" + growSale + ", commisionRate=" + commisionRate + '}';
    }

    @Override
    public double totalSalary() {
        double hse=(growSale* commisionRate)/100;
        double hcts=getTotalHour()*getHourlyRate();
        return hse+hcts;//To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
