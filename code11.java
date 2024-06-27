class parent
{
    int marry()
    {
        return 50;

    }

}
class child extends parent
{
    Float marry()
    {
        return 90f;
    }

}
class client
{
    public static void main(String[] args) {
        parent obj=new child();
        obj.marry();
    }
}