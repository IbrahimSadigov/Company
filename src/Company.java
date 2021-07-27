import java.util.ArrayList;

public class Company {

    private final int ID;
    private String name;
    private String mail;
    private ArrayList<Employee> employees;

    public Company(int ID, String name, String mail) {
        this.ID = ID;
        this.name = name;
        this.mail = mail;
        this.employees = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {

        this.employees.add(employee);

    }

    public void addEmployees(ArrayList<Employee> employees) {

        this.employees.addAll(employees);

    }

    public String toString() {
        return "Company: " + name + "\nCompany ID: " + ID + "\nMail: " + mail +"\n";
    }

    public void allEmployees() {

        for (int i = 0; i < employees.size(); i++){

            System.out.println(employees.get(i));

        }

    }


}
