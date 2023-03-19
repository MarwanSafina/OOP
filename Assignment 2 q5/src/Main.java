public class Main {
    public static void main(String[] args)
    {
        MyInteger A = new MyInteger(12);
        MyInteger B = new MyInteger(11);
        //testing the none parameter method for A object.
        A.IsEven();
        A.IsOdd();
        A.IsPrime();
        //testing the none parameter method for B object.
        B.IsEven();
        B.IsOdd();
        B.IsPrime();
        //testing the value parameter method.
        MyInteger.IsEven(A.GetInt());
        MyInteger.IsOdd(B.GetInt());
        MyInteger.IsPrime(A.GetInt());
        //testing the object parameter method.
        MyInteger.IsEven(A);
        MyInteger.IsOdd(B);
        MyInteger.IsPrime(A);
        //testing the equals method.
        A.equals(B.GetInt());
        B.equals(A);
    }
}