class parent
{
    int marry()
    {
        System.out.println("alia bhatt");
        return 0;
    }

}
class child extends parent
{
    int  marry()
    {
        System.out.println("shraddha kapoor");
        return 0;

    }

}
class client
{
    public static void main(String[] args) {
        parent obj = new child();
        obj.marry();
    }
}