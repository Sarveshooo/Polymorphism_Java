////////////////////////OVERLOADING ,COMPILE TIME POLYMORPHISM,STATIC BINDING,EARLY BINDING 
class outer
{
    void fun(int x)
    {
        System.out.println("IN INT FUN");
    }
    void fun(double x)
    {
        System.out.println("IN DOUBLE FUN");
    }
    void fun(float x)
    {
        System.out.println("IN FLOAT FUN");
    }
    void fun(char x)
    {
        System.out.println("IN FUN CHAR FUN");
    }
    public static void main(String[] args) {
        outer obj=new outer();
        obj.fun(10);
        obj.fun(10.5);
        obj.fun('A');
        obj.fun(10.5f);
    }
}