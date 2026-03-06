public class Manager extends Employee {

    public Manager(int salary) {
        super(salary);
    }

    public void work() {
        System.out.println("Managing Employees ");
    }

    public void addEmployee() {
        System.out.println("Adding new employee!");
    }
}
