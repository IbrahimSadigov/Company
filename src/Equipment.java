public class Equipment {

    private final int ID;
    private String name;

    public Equipment(int ID, String name) {
        this.ID = ID;
        this.name = name;
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

    public String toString(){
        return "Equipment: " + name + "\nEquipment ID: " + ID;
    }

}
