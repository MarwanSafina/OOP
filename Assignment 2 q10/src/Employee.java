import java.text.DateFormat;
import java.util.Date;

public class Employee extends Person
{
    protected String office;
    protected double salary;
    protected Date dateHired;

    Employee(String name, String address, String email, int phoneNumber,String office,double salary, Date dateHired) {
        super(name, address, email, phoneNumber);
        this.office=office;
        this.salary=salary;
        this.dateHired=dateHired;
    }

    @Override
    public String toString() {
        return "Class : Employee\n" + "Name :" + super.name;
    }
}
