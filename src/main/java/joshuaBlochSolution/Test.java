package joshuaBlochSolution;

public class Test {
    public static void main(String[] args) {
        Employee newTempEmployee = Employee.createNewTemporaryEmployee(4, "Jon");
        System.out.println(newTempEmployee);

        Employee newEmployee = Employee.createNewEmployee(6, "Anna", "Sales");
        System.out.println(newEmployee);
    }
}
