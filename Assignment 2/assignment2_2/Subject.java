package assignment2_2;
public class Subject {
    int subjectID=0;
    String subjectName=" ";
    int subjectHours=0;
    public Subject(){ }
    public Subject(int subjectID, String subjectName, int subjectHours){
        this.subjectID=subjectID;
        this.subjectName=subjectName;
        this.subjectHours=subjectHours;
    }
    public String toString(){
        return "Subject ID is: "+subjectID+"\nSubject name is: "+subjectName+"\nSubject Hours: "+subjectHours;
    }
}
