
package javaoop;

import java.util.ArrayList;
import java.util.Scanner;

//ArrayList
//inhance For Loop


public class Association {


    public static void main(String[] args) {
        
        
        Scanner in =new Scanner(System.in);
        Scanner st =new Scanner(System.in);
        Scanner db =new Scanner(System.in);
        
        ArrayList<Student> students =new ArrayList();
        
        System.out.print("How Many Student ? :  ");
        int Count1=in.nextInt();
        System.out.println();
        
        for (int i=0;i<Count1;i++){
        
        System.out.println("Registration Form");
        System.out.println("----------------------");
        
        System.out.print("Enter Student Name :  ");
        String studentName=st.nextLine();
        System.out.println();
        
        System.out.print("Enter Student Id :  ");
        String studentId=st.nextLine();
        System.out.println();
        
        System.out.print("Enter Student Age :  ");
        String studentAge=st.nextLine();
        System.out.println();
       
        
        System.out.print("Enter Dept Name :  ");
        String studentDept=st.nextLine();
        System.out.println();
        
        System.out.print("Enter Dept Building :  ");
        String studentDeptB=st.nextLine();
        System.out.println();
        
        System.out.print("Enter House :  ");
        String studentHouse=st.nextLine();
        System.out.println();
        
        System.out.print("Enter Road :  ");
        String studentRoad=st.nextLine();
        System.out.println();
        
        System.out.print("Enter City :  ");
        String studentCity=st.nextLine();
        System.out.println();
        
        System.out.print("Enter Zip :  ");
        int studentZip=in.nextInt();
        System.out.println();
        
        System.out.print("Enter Phone :  ");
        String studentPhone=st.nextLine();
        System.out.println();
        
        System.out.print("Enter Email :  ");
        String studentEmail=st.nextLine();
        System.out.println();
              
        
        System.out.print("How Many Course ? :  ");
        int Count=in.nextInt();
        System.out.println();
        
        ArrayList <Course> courses=new ArrayList();
        
        for(int j=0;j<Count;j++){
            
            System.out.print("Enter Course Name :  ");
        String studentCourseName=st.nextLine();
        System.out.println();
        
        System.out.print("Enter Course Code :  ");
        String studentCourseCode=st.nextLine();
        System.out.println();
        
        System.out.print("Enter Course Credit :  ");
        double studentCourseCredit=db.nextDouble();
        System.out.println();
        
        Course c=new Course(studentCourseName,studentCourseCode,studentCourseCredit);
        courses.add(c);
        
        }
        
                Dept d1=new Dept(studentDept,studentDeptB);
                Address a1=new Address(studentHouse,studentRoad,studentCity,studentZip,studentPhone,studentEmail);
                Student s1=new Student(studentName,studentId,studentAge,d1,a1,courses);
                //System.out.println(s1);
                students.add(s1);
                
                
                
     }
            
        for(Student s : students){
            System.out.println(s);
        }
        
        System.out.println("Enter a Search query");
        String src=st.nextLine();
        



        
//        Dept d1=new Dept("CSE","A");
//        Address a1=new Address("58","10","Dhaka",111,"1234","@gmail");
//        Course c1= new Course("MAD","cse-11",3.0);
//        Course c2= new Course("Java","cse-21",3.0);
//        
//        ArrayList<Course> course1=new ArrayList<Course>();
//        course1.add(c1);
//        course1.add(c2);
//        
//        Student s1=new Student("Rahul","161-15","20",d1,a1,course1);
//        
//        //System.out.println(s1);
//        
//        for(Course c: s1.getCourses()){
//            System.out.println(c.getCourse_name());
//        }
       
   
    
}
}