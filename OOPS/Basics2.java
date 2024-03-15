public class Basics2 {
    public static void main(String[] args) {
        // Commented-out section related to the Pen class
        
        // Creating an instance of the Student class
        Student s1 = new Student();
        
        // Initializing properties of the Student instance
        s1.name = "sujal";
        s1.roll = 4;
        s1.pwd = "abcd";
        s1.marks[0] = 98;
        s1.marks[1] = 99;
        s1.marks[2] = 100;
    
        // Creating another Student instance (s2) using a copy constructor
        Student s2 = new Student(s1);
        
        // Modifying the pwd property of s2
        s2.pwd = "xyz";
        
        // Displaying the marks of s2
        for(int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String pwd;
    int marks[];

    // Copy constructor for Student
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    // Non-parameterized constructor for Student
    Student() {
        System.out.println("constructor is called");
    }

    // Constructor with a String parameter for Student
    Student(String name) {
        this.name = name;
    }

    // Constructor with an int parameter for Student
    Student(int roll) {
        this.roll = roll;
    }
}

// Commented-out Pen class

