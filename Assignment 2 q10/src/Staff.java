import java.util.Date;

public class Staff extends Employee
{
    private String title;

    Staff(String name, String address, String email, int phoneNumber, String office, double salary, Date dateHired, String title) {
        super(name, address, email, phoneNumber, office, salary, dateHired);
        this.title = title;
    }
    @Override
    public String toString() {
        return "Class : Staff\n" + "Name :" + super.name;
    }
}
