/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startpoint;

import java.util.Scanner;

/**
 *
 * @author Mobile App Develop
 */
public class StartPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ip=new Scanner(System.in);
        
        BaseSalaryEmploye bse=new BaseSalaryEmploye ();
        HourlySalaryEmploye hse=new HourlySalaryEmploye();
        HourlyCommisionSalariedEmploye hce =new HourlyCommisionSalariedEmploye();
        
        System.out.println("emplyee registration from");
       System.out.println("-----------------------------------") ;
       System.out.println("Select your type");
       System.out.println("Enter 1 for basesalary Employee");
       System.out.println("Enter 2 for Hourly Salary Employee");
       System.out.println("Enter 3 for Hourly Commision Salary Employee");
       
       int  type =Integer.parseInt(ip.nextLine());
    System.out.println("Employee Name: ");
    String employename=ip.nextLine();
    
     System.out.println("Employee ID: ");
    String employeid=ip.nextLine();
    
    System.out.println("house No: ");
    String houseNo=ip.nextLine();
    
    System.out.println("Road NO: ");
    String roadNo=ip.nextLine();
    
    System.out.println("City: ");
    String city=ip.nextLine();
    
    System.out.println("Zip Code: ");
    String zipcode=ip.nextLine();
    System.out.println("Phone No: ");
    String phone=ip.nextLine();
    
    System.out.println("Email: ");
    String email=ip.nextLine();
    
    System.out.println("Designation: ");
    String designation=ip.nextLine();
   Address a =new Address();
   Contruct c =new Contruct();
    
    switch(type){
        case 1:
            System.out.println("enter base bsalary: ");
            double baseSalary=Double.parseDouble(ip.next());
            bse.setBaseSalary(baseSalary);
            bse.setEmployeName(employename);
         
            a.setHouseNo(houseNo);
            a.setCity(city);
            a.setRoadNo(roadNo);
            a.setZipCode(zipcode);
              bse.setAddress(a);
            c.setDesignation(designation);
            c.setEmail(email);
            c.setPhonrNo(phone);
            System.out.println(bse);
            
            break;
            
        case 2:
           double totalHour=Double.parseDouble(ip.next());  
         double hourlyRate=Double.parseDouble(ip.next());
            hse.setTotalHour(totalHour);
            hse.setHourlyRate(hourlyRate);
            break;
            
        case 3:
        double totalHour1=Double.parseDouble(ip.nextLine());       
          double hourlyRate1=Double.parseDouble(ip.nextLine());  
             double growSale=Double.parseDouble(ip.nextLine());  
             double commissionRate=Double.parseDouble(ip.nextLine());  
            hce.setCommisionRate(commissionRate);
            hce.setGrowSale(growSale);
            hce.setHourlyRate(hourlyRate1);
            hce.setTotalHour(totalHour1);
    }
    
    
    
    
    
    
    
    
    }
    
}
