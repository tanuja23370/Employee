public class Employee {
    String name;
    int id;
    double salary;
    String location;

    public Employee(String name, int id, double salary, String location) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.location = location;

    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Location: " + location);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Tanuja", 101, 50000.0, "hubli");
        emp1.displayInfo();

    }


}
