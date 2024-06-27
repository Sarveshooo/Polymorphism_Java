
class parent 
{
    void marry(String str)
    {
        System.out.println("ALIA BHATT");
       // System.out.println(str);
    }
}
class child extends parent
{
    void marry(String str)
    {
        System.out.println("DISHA PATNI ");
      //  System.out.println(str);
    }
}
class client
{
    public static void main(String[] args) {
        parent obj=new child();
        obj.marry("KARSHIMA KAPPOR");

        parent obj2=new parent();
        obj.marry("DEEPIKA ");
        
        child obj3=new child();
        obj.marry("KRITI SANNON");
    }
}

