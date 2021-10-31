package assignment2_1;
public class Employee extends Person{
    private String office;
    private double salary;
    private MyDate dateHired;
    public Employee(){ }
    public Employee (String name, String address, String phonenumber, String emailaddress, String office, double salary){
        super(name, address, phonenumber, emailaddress);
        this.office=office;
        this.salary=salary;
        this.dateHired=new MyDate();
    }
    public void setOffice(String office){
        this.office=office;
    }
    public String getOffice(){
        return office;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public void setDate(){
        this.dateHired=new MyDate();
    }
    public MyDate getDate(){
        return dateHired;
    }
    @Override
    public String toString(){
        return "Name of the Employee: "+super.getName()+"\nName of the class: "+this.getClass().getName();
    }
    
}
