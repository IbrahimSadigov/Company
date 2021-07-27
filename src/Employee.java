import java.util.ArrayList;

public class Employee{

    private String name;
    private String lastname;
    private final int ID;
    private ArrayList<Equipment> equipments;
    private String job;
    private String skill;


    public Employee(String name, String lastname, int ID, String job, String skill) {
        this.name = name;
        this.lastname = lastname;
        this.ID = ID;
        this.equipments = new ArrayList<>();
        this.job = job;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getID() {
        return ID;
    }

    public ArrayList<Equipment> getEquipments() {
        return equipments;
    }

    public void addEquipment(Equipment equipment){

        this.equipments.add(equipment);

    }

    public void addEquipments(ArrayList<Equipment> equipments){

        this.equipments.addAll(equipments);

    }

    public String toString(){

        return "Employee: " + name + " " + lastname + "\nEmployee ID: " + ID + "\nJob: " + job + "\nSkill: " + skill + "\n";
    }

    public void allEquipments(){

        for (int i = 0; i < equipments.size(); i++){

            System.out.println(equipments.get(i));

        }

    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void employeeSkill(){

        System.out.println("My skill is " + getSkill());

    }
}
