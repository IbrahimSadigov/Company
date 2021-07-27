public class Developer extends Employee{

    public Developer(String name, String lastname, int ID, String job, String skill) {
        super(name, lastname, ID, job, skill);
    }

    @Override
    public void employeeSkill(){

        System.out.println("My skill is Developing");

    }

}
