public class homework6 {
    public static void main(String[] args) {
        Employee employee1 = new Employee(20,1, "Dmitri", "Stepanov", 10);
        Employee employee2 = new Employee(21, 2, "Dmitri", "Stepanov");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee1.equals(employee2));
        employee1.upgrade(60);
        System.out.println(employee1);
        System.out.println(employee2.olderThan(employee1));
        System.out.println(employee2);
        System.out.println(employee2.getFullName());

    }


}
