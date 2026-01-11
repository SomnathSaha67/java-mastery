public class Student{
    String name;
    int rollno;
    String branch;
    int semester;
    double cgpa;
    boolean eligibleforplacement;
    Student(String name, int rollno, String branch, int semester, double cgpa){
        this.name = name;
        this.rollno = rollno;
        this.branch = branch;
        this.semester = semester;
        this.cgpa = cgpa;
    }void displaydetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Branch: " + branch);
        System.out.println("Semester: " + semester);
        System.out.println("CGPA: " + cgpa);
    }void isEligibileforPlacement(){
        if (cgpa>=7.5){
            eligibleforplacement=true;
            System.out.println(name + " is eligible for placement.");
        }
    }void promoteSemester(){
        if (semester<8){
            semester+=1;
            System.out.println(name + " has been promoted to semester " + semester + ".");
        }else{
            System.out.println(name + " is already in the final semester.");
        }
    }
}
public class StudentDemo{
    public static void main(String[] args){
        Student student1=new Student("Alice", 101, "Computer Science", 5, 8.2);
        Student student2=new Student("Bob", 102, "Mechanical Engineering", 8, 7.0);
        student1.displaydetails();
        student1.isEligibileforPlacement();
        student1.promoteSemester();
        System.out.println();
        student2.displaydetails();
        student2.isEligibileforPlacement();
        student2.promoteSemester();
    }
}