package factoryMethodSolution;

import java.util.Random;

public class EmployeeRandomizer {
    private static Random random = new Random();

    private static String[] firstNames = { "Jon", "Oliver", "Angelina", "Brandon", "Joseph", "Bill", "Joshua", "Brain", " Johanna", "Silvester",
                                            "Tom", "Brad", "Alina", "Harry", "Will", "Ali", "James", "Robert", "David", "Tailor",
                                            "Joe", "Gabriela", "Jordan", "Veronica", "Carl", "Harold", "Kyle", "Adam", "Peter", "Douglas",
                                            "Victoria", "Carl", "Anna", "Jacob", "Daniel", "Thomas", "Malena", "Richard", "Donald", "Larry"};

    private static String[] departments = { "Production", "Sales", "Marketing", "Engineering"};

    public static int createId() {
        return random.nextInt(100000);
    }

    public static String createName() {
        int randomInt = random.nextInt(40);
        return firstNames[randomInt];
    }

    public static String createDepartment() {
        int randomInt = random.nextInt(4);
        return departments[randomInt];
    }

    public static int createYear() {
        return random.nextInt(20);
    }
}
