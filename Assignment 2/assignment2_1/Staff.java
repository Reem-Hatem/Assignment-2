package assignment2_1;
public class Staff extends Employee{
    private String title;
    public Staff(){ }
    public Staff(String name, String address, String phonenumber, String emailaddress, String office, double salary, String title){
        super(name, address, phonenumber, emailaddress, office, salary);
        this.title=title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    @Override
    public String toString(){
        return "Name of the Staff member: "+super.getName()+"\nName of the class: "+this.getClass().getName();
    }
}
