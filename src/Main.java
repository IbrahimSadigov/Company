import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Companies ID = 1 - 99
        // Company Employee ID = 100 - 199
        // Company Equipments ID = 200 - 299
        // Apple Employee ID = 300 - 399
        // Apple Equipments ID = 400 - 499
        // Samsung Employee ID = 500 - 599
        // Samsung Equipments ID = 600 - 699


        Company company = new Company(1, "Pasha Bank", "abc@pashabank.az");

        Employee employee100 = new Employee("Ibrahim", "Sadigov", 100, "Project manager", "Management");

        company.addEmployee(employee100);

        Equipment equipment200 = new Equipment(200, "HP-Notebook");

        employee100.addEquipment(equipment200);

        // System.out.println(company);
        // System.out.println(company.getEmployees().get(0));
        // System.out.println(company.getEmployees().get(0).getEquipments().get(0));

        // System.out.println();


        Apple apple = new Apple(2,"Apple", "apple@apple.com");

        Employee employee300 = new Employee("Ferhad", "Aliyev", 300, "IOS Developer", "Developing");

        Employee employee301 = new Employee("Sahib", "Vezirov", 301, "IOS Developer Intern", "Developing");

        Employee employee302 = new Employee("Dadash", "Cemilli", 302, "HR", "Hiring People");

        Employee employee303 = new Employee("Vafadar", "Cabbarli", 303, "HR Intern", "Hiring People");

        apple.addEmployee(employee300);

        ArrayList<Employee> appleEmployees = new ArrayList<>(Arrays.asList(employee301, employee302, employee303));

        apple.addEmployees(appleEmployees);



        HR hr1 = new HR("Murad", "Muradli", 303, "HR Manager", "Hiring People");

        apple.addEmployee(hr1);



        Equipment equipment400 = new Equipment(400, "Mac-Air");

        employee300.addEquipment(equipment400);

        // System.out.println(apple);
        // System.out.println(apple.appleOS());
        // System.out.println(apple.getEmployees().get(0));
        // System.out.println(apple.getEmployees().get(0).getEquipments().get(0));


        // System.out.println();

        Samsung samsung = new Samsung(3,"Samsung", "samsung@samsung.com");

        Employee employee500 = new Employee("Narmin", "Isayeva", 500, "Android Developer", "Developing");

        samsung.addEmployee(employee500);

        Equipment equipment600 = new Equipment(600, "Samsung-Notebook");

        employee500.addEquipment(equipment600);

        // System.out.println(samsung);
        // System.out.println(samsung.samsungOS());
        // System.out.println(samsung.getEmployees().get(0));
        // System.out.println(samsung.getEmployees().get(0).getEquipments().get(0));

        // System.out.println();

        apple.allEmployees();

        //employee500.employeeSkill();

    }
}
