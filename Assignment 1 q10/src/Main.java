public class Main {
    public static void main(String[] args) {
        Account m = new Account(1122,20000);
        Account.annualInterestRate=4.5;
        m.withdraw(2500);
        System.out.println(m.GetBalance());
        m.deposit(3000);
        System.out.println(m.GetBalance());
    }
}