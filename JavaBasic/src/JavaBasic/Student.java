
package JavaBasic;
//POJO=Plain Old Java Object
//Model Class
public class Student {
    public String name;
    public String id;
    public String address;
    public String phone;

    public Student(String name,String id,String address,String phone){
        super();
        this.name=name;
        this.id=id;
        this.address=address;
        this.phone=phone;
    }

    public void setPhone(){
        this.phone=phone;
    }

    public String getInfo(){
        return name+","+id+","+address;
    }
    public void Display(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(address);
        System.out.println(phone);

    }

}
