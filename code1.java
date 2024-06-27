//////////overriding 
////THE OVERRIDING IS A RUNTIME POLYMORPHISM
////THE OVERRIDING TAKES PLACE IN 2 CLASS (PARENT AND CHILD RELATION)
//// METHOD SIGNATURE MUST BE SAME OF BOTH CLASS
//// RETURN VALUE MATTER KARNAR ITHEEE


class parent 
{
    void marry()
    {
        System.out.println("ALIA BHATT");
    }
}
class child extends parent
{
    void marry()
    {
        System.out.println("DISHA PATNI ");
    }
}
class client
{
    public static void main(String[] args) {
        parent obj=new child();
        obj.marry();
    }
}

