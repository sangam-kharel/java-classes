/*3. Create a class Employ with the private instance variable name, post, salary.
provide getters and setters.
*/
package OOP;
class Employ{
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
public class Employee3 {
    public static void main(String[] args) {
        Employ e = new Employ();
        e.setName("Sandip");
        e.setPost("Officer");
        e.setSalary(5000);
        System.out.println(e.getName());
        System.out.println(e.getPost());
        System.out.println(e.getSalary());
    }
}
