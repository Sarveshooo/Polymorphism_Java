
class parent 
{
    void marry()
    {
        System.out.println("ALIA BHATT");
    }
}
class child extends parent
{
    void marry(String str)
    {
        System.out.println("DISHA PATNI ");
    }
}
class client
{
    public static void main(String[] args) {
        
       parent obj=new child();
      obj.marry("KARSHIMA KAPPOR");

       parent obj2=new parent();
       obj2.marry("DEEPIKA ");
        
      child obj3=new child();
       obj3.marry("KRITI SANNON");


    }
}

