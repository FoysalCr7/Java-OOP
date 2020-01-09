
package javaoop;


public class Dept {
    
    private String dept_name;
    private String dept_b;

    public Dept(String dept_name, String dept_b) {
        this.dept_name = dept_name;
        this.dept_b = dept_b;
    }
    

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getDept_b() {
        return dept_b;
    }

    public void setDept_b(String dept_b) {
        this.dept_b = dept_b;
    }

    @Override
    public String toString() {
        return "Dept{" + "dept_name=" + dept_name + ", dept_b=" + dept_b + '}';
    }
    
  
}
