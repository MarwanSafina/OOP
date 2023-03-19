public class Student extends Person
{
    private String status;

    Student(String name, String address, String email, int phoneNumber,String status) {
        super(name, address, email, phoneNumber);
        this.status=status;
    }

    @Override
    public String toString() {
        return "Class :" + "Student\n" + "Name :" + super.name;
    }
}
