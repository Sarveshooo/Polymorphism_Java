class parent
{
    int  marry()
    {
        System.out.println("alia bhatt");
        return 0;
    }

}
class child extends parent
{
    void  marry()
    {
        System.out.println("shraddha kapoor");
        

    }

}
class client
{
    public static void main(String[] args) {
        parent obj = new child();
        obj.marry();
    }
}