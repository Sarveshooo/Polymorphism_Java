class parent
{
    String fun()
    {
        return"demo";
    }
    
}
class child extends parent
{
    String fun()
    {
        return"demochild";
    }
}
class client
{
    public static void main(String[] args) {
        parent obj = new child();
        obj.fun();
    }
}