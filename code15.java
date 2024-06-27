class parent
{
    String fun()
    {
        return ("sarvesh");
    }
}
class child extends parent
{
    Object  fun()
    {
        return ("sarvesh2");
    }
}
class client 
{
    public static void main(String[] args) {
        parent p = new child();
        p.fun();
    }
}