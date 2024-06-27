class demo
{

}
class demochild extends demo
{

}
class parent
{
    Object fun()
    {
        return new Object();
    }   
 Object run()
 {
    return new Object();
 }
}
class child extends parent
{
    String fun()
    {
        return new String();
    }
    public demochild run()
    {
        return new demochild();
    }
}
class client{


    public static void main(String[] args) {
        
    }

}