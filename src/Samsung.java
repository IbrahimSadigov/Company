import java.util.ArrayList;

public class Samsung extends Company{

    public Samsung(int ID, String name, String mail) {
        super(ID, name, mail);
    }

    public String samsungOS(){

        String OS = "Android";

        return "The Operating system is " + OS;
    }



}
