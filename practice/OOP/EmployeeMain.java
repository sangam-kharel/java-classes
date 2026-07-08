//Create a class Employee with private instance name, post and salary, set employee details and print them.
package OOP;
class Employee{
    private String name, post;
    int salary;
    public void EmployeeDetails(String name,String post,int salary){
        this.name = name;
        this.post = post;
        this.salary = salary;
    }
    public void PrintEmployeeDetails(){
        System.out.println("Name of Employee:"+name);
        System.out.println("Post: "+post);
        System.out.println("Salary: "+salary);
    }
}
public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.EmployeeDetails("Sandip", "Director", 5);
        e.PrintEmployeeDetails();
    }
}
