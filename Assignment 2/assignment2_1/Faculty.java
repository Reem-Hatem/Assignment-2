package assignment2_1;
public class Faculty extends Employee {
    private String officeHours;
    private String rank;
    public Faculty(){ }
    public Faculty(String name, String address, String phonenumber, String emailaddress, String office, double salary, String officeHours, String rank){
        super(name, address, phonenumber, emailaddress, office, salary);
        this.officeHours=officeHours;
        this.rank=rank;
    }
    public void setOfficeHours(String officeHours){
        this.officeHours=officeHours;
    }
    public String getOfficeHours(){
        return officeHours;
    }
    public void setRank(String rank){
        this.rank=rank;
    }
    public String getRank(){
        return rank;
    }
    @Override
    public String toString(){
        return "Name of the Faculty member: "+super.getName()+"\nName of the class: "+this.getClass().getName();
    }
}
