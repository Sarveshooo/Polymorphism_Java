class outer
{
    void fun(int x)
    {
        System.out.println("IN INT FUN");
    }
////////////////////////////////////////////method signature ERROR
    void fun(int z)
    {
        System.out.println("in int fun");
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
        
        obj.fun('A');
        obj.fun(10.5f);
    }
}