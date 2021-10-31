package assignment2_2;
public class Address {
    String streetNO=" ";
    String city=" ";
    String country=" ";
    public Address(){ }
    public Address(String streetNO, String city, String country){
       this.streetNO=streetNO;
       this.city=city;
       this.country=country;
    }
    public String toString(){
        return "Street number is: "+streetNO+"\nCity: "+city+"\nCountry: "+country;
    }
}
