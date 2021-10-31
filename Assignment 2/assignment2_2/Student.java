package assignment2_2;
public class Student {
    String name="s1";
    private int studentID=11;
    int studentGPA=3;
    Subject subject;
    Address address;
    public Student(){ }
    public Student(String name, int studentID, int studentGPA, Subject subject, Address address){
        this.name=name;
        this.studentID=studentID;
        this.studentGPA=studentGPA;
        this.subject=subject;
        this.address=address;
    }
    public void setStudentID(int id){
        this.studentID=id;
    }
    public int getStudentID(){
        return studentID;
    }
    @Override
    public String toString(){
                return "Student name is: "+name+"\nStudent ID is: "+getStudentID()+
                        "\nStudent GPA is: "+studentGPA+subject.toString()+"\nStudent Address: "+address.toString();
    }
}
