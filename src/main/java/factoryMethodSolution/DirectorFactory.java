package factoryMethodSolution;

public interface DirectorFactory {
    Director create(String name, String workingDepartment, int bonus);
}
