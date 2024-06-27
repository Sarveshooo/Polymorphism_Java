class demo
{
    String x=    "  10      NON STATIC VARIABLE ";
    static String y=    "20    STATIC VARIABLE ";

    demo()
    {
        System.out.println("IN DEMO CONSTRUCTOR");
    }

    void show()
    {
        System.out.println("NON STATIC METHOD");
    }

    static void display()
    {
        System.out.println("IN STATIC METHOD");
    }

    {
        System.out.println("IN INSTANCE BLOCK");
    }

    static
    {
        System.out.println("IN STATIC BLOCK");
    }
    public static void main(String[] args) {
        System.out.println("IN MAIN METHOD");
        demo obj = new demo();
        display();
        System.out.println(y);
        System.out.println(obj.x);
        obj.show();

    }
    
}