import java.util.*;

public class CompanyTest {

    public static void main(String[] args) {
        // (a), (b), (c)
        Company testCompany = new Company("UMS");
        testCompany.addEmployee(new Employee("John", 5, 2500.0, 'M', new Spouse("Kate", 37)));
        System.out.println("Total salary(before): $" + testCompany.getAllEmployeesSalary() + "\n");

        // (d) (e)
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int inputID = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Name: ");
        String inputName = sc.nextLine();
        System.out.print("Enter Salary: ");
        double inputSalary = Double.parseDouble(sc.nextLine());
        System.out.print("Enter Gender: ");
        char inputGender = sc.nextLine().charAt(0);
        testCompany.addEmployee(new Employee(inputName, inputID, inputSalary, inputGender));

        sc.close();
        System.out.println("\nTotal salary(after addition): " + testCompany.getAllEmployeesSalary());

        // (f) (g)
        // Employee testEmployee = testCompany.getEmployee(4);
        // Spouse testEmployeeSpouse = testEmployee.getSpouse();
        // System.out.printf("%nName: %s, Salary: $%.2f, Status: %s%n",
        // testEmployee.getName(), testEmployee.getSalary(),
        // testEmployeeSpouse != null ? "Married" : "Single");
        // if (testEmployeeSpouse != null) {
        // System.out.println("Spouse's name: " + testEmployeeSpouse.getName());
        // }

        // testEmployee = testCompany.getEmployee(5);
        // testEmployeeSpouse = testEmployee.getSpouse();
        // System.out.printf("%nName: %s, Salary: $%.2f, Status: %s%n",
        // testEmployee.getName(), testEmployee.getSalary(),
        // testEmployeeSpouse != null ? "Married" : "Single");
        // if (testEmployeeSpouse != null) {
        // System.out.println("Spouse's name: " + testEmployeeSpouse.getName());
        // }

        // (h)
        checkEmployee(testCompany, 4);
        checkEmployee(testCompany, 5);
    }

    public static void checkEmployee(Company comp, int id) {
        Employee testEmployee = comp.getEmployee(id);
        Spouse testEmployeeSpouse = testEmployee.getSpouse();
        System.out.printf("%nName: %s, Salary: $%.2f, Status: %s%n", testEmployee.getName(), testEmployee.getSalary(),
                testEmployeeSpouse != null ? "Married" : "Single");
        if (testEmployeeSpouse != null) {
            System.out.println("Spouse's name: " + testEmployeeSpouse.getName());
        }
    }
}
