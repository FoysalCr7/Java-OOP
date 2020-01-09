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
public class Contruct {
    private String email;
    private String phonrNo;
    private String designation;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonrNo() {
        return phonrNo;
    }

    public void setPhonrNo(String phonrNo) {
        this.phonrNo = phonrNo;
    }

    @Override
    public String toString() {
        return "Contruct{" + "email=" + email + ", phonrNo=" + phonrNo + ", designation=" + designation + '}';
    }


    
}
