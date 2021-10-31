package assignment2_2;
public class Assignment2_2 {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.subjectID=1;
        subject.subjectName="IT";
        subject.subjectHours=3;
        Address address = new Address();
        address.city="minya";
        address.country="egypt";
        address.streetNO="11";
        Student student = new Student("name1",11,3,subject,address);
        System.out.println(student.toString());
    }
    
}
