package assignment2_1;
public class Student extends Person{
    final private String status;
    public Student(String name, String address, String phonenumber, String emailaddress, String status){
        super(name, address, phonenumber, emailaddress);
        this.status=status;
    }
    public String getStatus(){
        if (status=="Year 1") return "freshman";
        else if (status=="Year 2") return "sophpmore";
        else if (status=="Year 3") return "junior";
        else if (status=="Year 4") return "senior";
        else return "unknown";
    }
    @Override
    public String toString(){
        return "Name of the student: "+super.getName()+"\nName of the class: "+this.getClass().getName();
    }
}
