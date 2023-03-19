import java.util.Date;

public class Faculty extends Employee
{
    private String officeHours;
    private int rank;
    Faculty(String name, String address, String email, int phoneNumber,String office,double salary, Date dateHired, String officeHours, int rank) {
        super(name, address, email, phoneNumber, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Class : Faculty\n" + "Name :" + super.name;
    }
}
