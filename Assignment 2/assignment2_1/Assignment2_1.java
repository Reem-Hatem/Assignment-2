package assignment2_1;
public class Assignment2_1 {
    public static void main(String[] args) {
        Person person = new Person("person 1", "2 A street", 
			"123456789", "abc123@gmail.com");
	Student student = new Student("student 1", "2 b street", 
			"123456789", "abc123@gmail.com", "Year 1");
	Employee employee = new Employee("employee 1", "2 A street", 
			"123456789", "abc123@gmail.com", "10", 60000);
	Faculty faculty = new Faculty("faculty member 1", "2 A street", 
			"123456789", "abc123@gmail.com", "10", 50000, "9pm to 2pm", "Professor");
	Staff staff = new Staff("staff member 1", "2 A street", 
			"123456789", "abc123@gmail.com", "10", 65000, "Executive Assistant");
	System.out.println(person.toString());
	System.out.println(student.toString());
	System.out.println(employee.toString());
	System.out.println(faculty.toString());
	System.out.println(staff.toString()); 
    }
    
}
