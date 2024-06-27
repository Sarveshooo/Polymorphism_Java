class parent
{
    Object fun()
    {
        return ("sarvesh");
    }
}///////////////////////////////////////////THIS HAPPENS BECAUSE SCOPE OF OBJECT CLASS IS HIGHER THAN STRING THEREFORE IT IS ALLOWED 
class child extends parent
{
    String fun()
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