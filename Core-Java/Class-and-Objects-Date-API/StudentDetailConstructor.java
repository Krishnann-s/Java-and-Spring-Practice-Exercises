// DESCRIPTION

/*
Sarah got confused to creating the constructor. Write a Java application to help Sarah to do this.

Type(Class)
Student

Attributes
int studentId

String studentName

String studentAddress

String collegeName

Methods
Include the getters and setters method for all the attributes.

Responsibilities

Type(Class)
Student

Methods
Include a public parametrized constructor of four arguments in the following order - studentId, studentName, studentAddress, and collegeName to initialize the values for the Student object

Responsibilities
If student belongs to other college, give input as 'no/NO' and get college name from the user and create student object with 4-argument constructor to initialize all the values. 


Type(Class)
Student

Methods
Include a public parametrized constructor of three arguments in the following order - studentId, studentName, studentAddress, and collegeName should be "NIT" to initialize the values for the Student object

Responsibilities
If student belongs to NIT, give input as 'yes/YES' and skip input for the attribute collegeName and create student object with 3-argument constructor to initilze the values for studentId, studentName and studentAddress and  collegeName as "NIT".

Note: The class and methods should be declared as public and all the attributes should be declared as private. 


In the StudentDetailConstructor class, write the main method to test the application.

Assume most of the students are from "NIT" college. So user has to give input whether the student is from NIT or not.

Instead of Yes / No, if user enters different input then display 'Wrong Input' and get the input again.

 Note:

-         In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.

-         Ensure to follow the object-oriented specifications provided in the question description.

-         Ensure to provide the names for classes, attributes, and methods as specified in the question description.

-         Adhere to the code template, if provided.

-         Please do not use System.exit(0) to terminate the program

 

Sample Input 1:

Enter Student's Id:

12

Enter Student's Name:

John

Enter Student's address:

Chennai

Whether the student is from NIT(Yes/No):

NO

Enter the college name:

SVS

 

Sample Output 1:

Student id:12

Student name:John

Address:Chennai

College name:SVS

 

Sample Input 2:

Enter Student's Id:

43

Enter Student's Name:

Tom

Enter Student's address:

Coimbatore

Whether the student is from NIT(Yes/No):

y

Wrong Input

Whether the student is from NIT(Yes/No):

yes

 

Sample Output 2:

Student id:43

Student name:Tom

Address:Coimbatore

College name:NIT

 */

import java.util.Scanner;

public class StudentDetailConstructor {

    public class Student {
        private int studentId;
        private String studentName;
        private String studentAddress;
        private String collegeName;

        public int getStudentId() {
            return studentId;
        }
        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }
        public String getStudentName() {
            return studentName;
        }
        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }
        public String getStudentAddress() {
            return studentAddress;
        }
        public void setStudentAddress(String studentAddress) {
            this.studentAddress = studentAddress;
        }
        public String getCollegeName() {
            return collegeName;
        }
        public void setCollegeName(String collegeName) {
            this.collegeName = collegeName;
        }
        public Student(int studentId, String studentName, String studentAddress) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.studentAddress = studentAddress;
            this.collegeName = "NIT";
        }
        public Student(int studentId, String studentName, String studentAddress, String collegeName) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.studentAddress = studentAddress;
            this.collegeName = collegeName;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student's Id:");
        int studentId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student's Name:");
        String studentName = sc.nextLine();

        System.out.println("Enter Student's address:");
        String studentAddress = sc.nextLine();

        Student s = null;
        while (s == null) {
            System.out.println("Whether the student is from NIT(Yes/No):");
            String nit = sc.nextLine();
            if (nit.equalsIgnoreCase("yes")) {
                s = new StudentDetailConstructor().new Student(studentId, studentName, studentAddress);
            } else if (nit.equalsIgnoreCase("no")) {
                System.out.println("Enter the college name:");
                String collegeName = sc.nextLine();
                s = new StudentDetailConstructor().new Student(studentId, studentName, studentAddress, collegeName);
            } else {
                System.out.println("Wrong Input");
            }
        }
        System.out.println("Student id:" + s.getStudentId());
        System.out.println("Student name:" + s.getStudentName());
        System.out.println("Address:" + s.getStudentAddress());
        System.out.println("College name:" + s.getCollegeName());
    }
}