package M18P1Q11;

public class Patient {
    private int ID;
    private String name;
    private String phoneNum;

    public Patient(int ID, String name, String phoneNum) {
        this.ID = ID;
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }
}
