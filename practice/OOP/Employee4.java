/*4. Create a class Emp with private instance variables name, post, salary.
Create getters andd setters. In the main class, create 3 objects of Emp, set their details
and print the details of highest paid employees.
*/
package OOP;
class Emp{
    private String name, post;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
public class Employee4 {
    public static void main(String[] args) {
        Emp e = new Emp();
        e.setName("Sangam");
        e.setPost("Managing Director");
        e.setSalary(20);
        System.out.println(e.getName());
        System.out.println(e.getPost());
        System.out.println(e.getSalary());
    }
}
