package assignment2_1;
public class Person {
    private String name;
    private String address;
    private String phonenumber;
    private String emailaddress;
    public Person(){ }
    public Person(String name, String address, String phonenumber, String emailaddress){
        this.name=name;
        this.address=address;
        this.phonenumber=phonenumber;
        this.emailaddress=emailaddress;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }
    public void setPhonenumber(String phonenumber){
        this.phonenumber=phonenumber;
    }
    public String getPhonenumber(){
        return phonenumber;
    }
    public void setEmailaddress(String emailaddress){
        this.emailaddress=emailaddress;
    }
    public String getEmailaddress(){
        return emailaddress;
    }
    @Override
    public String toString(){
        return "Name is: "+name+"\nAddress is: "+address+"\nPhone Number is: "+phonenumber+"\nEmail Address is: "+emailaddress;
    }
}
