public class MyInteger
{
    private int value;
    MyInteger(int data)
    {
        this.value = data;
    }
    public int GetInt()
    {
        return value;
    }
    public boolean IsEven()
    {
        if(value%2 ==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean IsOdd()
    {
        if(IsEven())
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean IsPrime()
    {
        int flag=0;
        for(int i=value;i>0;i--)
        {
            if(value%i == 0)
            {
                flag++;
            }
            if(flag > 1)
            {
                break;
            }
        }
        if(flag <= 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean IsEven(int data)
    {
        if(data%2 ==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean IsOdd(int data)
    {
        if(IsEven(data))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static boolean IsPrime(int data)
    {
        int flag=0;
        for(int i=data;i>0;i--)
        {
            if(data%i == 0)
            {
                flag++;
            }
            if(flag > 1)
            {
                break;
            }
        }
        if(flag <= 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean IsEven(MyInteger data)
    {
        if((data.value)%2 ==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean IsOdd(MyInteger data)
    {
        if(IsEven(data.value))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static boolean IsPrime(MyInteger data)
    {
        int flag=0;
        for(int i=(data.value);i>0;i--)
        {
            if((data.value)%i == 0)
            {
                flag++;
            }
            if(flag > 1)
            {
                break;
            }
        }
        if(flag <= 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean equals(int data)
    {
        if(data == value)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean equals(MyInteger data)
    {
        if(data.value == value)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
