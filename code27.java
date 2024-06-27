class demo
{
   
    void fun(float x,int y)/////////BECAUSE INT CAN BE STORED IN INT THAT IS 20
    {
        
        System.out.println(x);

    }
    void fun(int x,float y)////////BECAUSE INT CAN BE STORED IN FLOAT  THAT IS 20
    {
        
        System.out.println(x);

    }
    public static void main(String[] args) {
        demo obj=new demo();
        
        obj.fun(10.5f,20);
        obj.fun(10,20.5f);
       // obj.fun(10,20);///////////////ambiquity error
      // obj.fun(20.5f,30.5f);//////NO SUITABLE METHOD FOUND ERROR
    }

}