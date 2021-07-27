public class HR extends Employee{

    public HR(String name, String lastname, int ID, String job, String skill) {
        super(name, lastname, ID, job, skill);
    }


    @Override
    public void employeeSkill(){

        System.out.println("My skill is Hiring People");

    }

}
