public class Person
{
    protected String name;
    protected String address;
    protected String email;
    protected int phoneNumber;
    Person(String name, String address, String email, int phoneNumber)
    {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return ("Class :" + "Person\n" + "Name :" + name);
    }
}
