public class Employee_Main {
    public static void main(String[] args) {

        Employee employee = new Employee (5000);
        employee.work();
        System.out.println("Employee salary: " + employee.getSalary());

        Manager manager = new Manager(6000);
        manager.work();
        System.out.println("Manager salary: " + manager.getSalary());
        manager.addEmployee();

    }
}
