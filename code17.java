class parent 
{
        String fun()/////////////////////////DEFAULT ACCESS SPECIFIER
    {
        return new String();
    }
}
class child extends parent
{
     public String fun()////////////////////////////PUBLIC ACCESS SPECIFIER 
    {
        return new String();
    }
}
class client
{
    public static void main(String[] args) {
        parent p = new child();

    }
}