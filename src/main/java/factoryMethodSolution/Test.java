package factoryMethodSolution;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        HR hr = new HR();
        PayrollOffice po = new PayrollOffice();

        EmployeeFactory employeeFactory = new EmployeeFactoryImpl();
        ManagerFactory managerFactory = new ManagerFactoryImpl();
        DirectorFactory directorFactory = new DirectorFactoryImpl();

        hr.addNewEmployee(employeeFactory.create("Tony"));
        hr.addNewEmployee(employeeFactory.create("Robert"));
        hr.addNewEmployee(employeeFactory.create("Sarah"));
        hr.addNewEmployee(managerFactory.create("Benjamin", "Sales"));
        hr.addNewEmployee(managerFactory.create("Alexandra", "Strategy"));
        hr.addNewEmployee(directorFactory.create("Ketty", "Management", 10000));

        hr.listEmployees();

        System.out.println();

        List<Employee> employees = hr.getEmployees();

        for (Employee employee : employees) {
            po.paySalary(employee);
        }
    }
}