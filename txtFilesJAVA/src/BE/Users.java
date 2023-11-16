package BE;

public class Users {

    private int pos;
    private String fName;
    private String lName;

    public Users(int pos, String fName, String lName) {
        this.pos = pos;
        this.fName = fName;
        this.lName = lName;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {

        return pos + ": " + fName + " " + lName;
    }
}