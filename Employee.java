import java.util.Objects;

public class Employee {
    int age;
    String firstName;
    String lastName;
    double salary;
    int id;

    public Employee(int age, int id, String firstName, String lastName, double salary) {
        this.age = age;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

    }

    public Employee(int age, int id, String firstName, String lastName) {
        this.age = age;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = 50.0;
    }

    @Override
    public String toString() {
        return "Employee[" + "id: " + id + " " + getFullName() + ", " + "age:" + " " + age + " " + "salary" + " " + salary + "]";
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee employee) {
            return firstName.equals(employee.firstName) && lastName.equals(employee.lastName) && id == employee.id;
        }
        return false;

    }
    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }
    public boolean olderThan(Employee e) {
        return this.age > e.age;
    }

    public void upgrade(double salary) {
        this.salary += salary;
    }


}
