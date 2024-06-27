class parent
{///////////////////////////////////////////////////////
     void show()
    {
        System.out.println("IN CLASS PARENT");
    }

}
class child extends parent
{
   public  void show()
    {
        System.out.println("IN CLASS CHILD ");

    }

}
class child2 extends parent
{
    public void show()
    {
        System.out.println("IN CHILD CLASS 2");
    }
    public static void main(String[] args) {
        parent obj = new parent();
        obj.show();;

        obj=new child();
        obj.show();

        obj=new child2();
        obj.show();
    }

}