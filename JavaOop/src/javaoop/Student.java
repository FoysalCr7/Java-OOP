/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop;

import java.util.ArrayList;

/**
 *
 * @author Mobile App Develop
 */
public class Student {
    
    private String studentName;
    private String studentId;
    private String studentAge;
    
    private Dept dept;
    private Address add;
    private ArrayList<Course> courses;

    public Student(String studentName, String studentId, String studentAge, Dept dept, Address add, ArrayList<Course> courses) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentAge = studentAge;
        this.dept = dept;
        this.add = add;
        this.courses = courses;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" + "studentName=" + studentName + ", studentId=" + studentId + ", studentAge=" + studentAge + ", dept=" + dept + ", add=" + add + ", courses=" + courses + '}';
    }
    
    
    
    
    
}
