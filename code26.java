class demo
{
    void fun(int x,int y)
    {
        System.out.println(x);

    }
    void fun(float x,float y)
    {
        
        System.out.println(x);

    }
    void fun(float x,int y)
    {
        
        System.out.println(x);

    }
    void fun(int x,float y)
    {
        
        System.out.println(x);

    }
    public static void main(String[] args) {
        demo obj=new demo();
        obj.fun(10,20);
        obj.fun(10.5f,20.5f);
        obj.fun(10.5f,20);
        obj.fun(10,20.5f);


       
       
       // obj.fun(10.5,10.5);
    }

}