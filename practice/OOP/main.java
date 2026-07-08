/*1. Create a class named "Student" with String variable "name" and integer variable "roll_no" 
assign the value of roll_no as "2" and name as "John" by creating and object of the class "Student" and print them.
*/
package OOP;
class Student{
    private String name;
    private int roll_no;
    public void setForStudentDetails(){
        name = "John";
        roll_no = 2;
    }
    public void printStudentDetails(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+roll_no);
    }
}
public class main {
    public static void main(String[] args) {
        Student f = new Student();
        f.setForStudentDetails();
        f.printStudentDetails();
    }   
}
