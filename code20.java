class outer
{
    final  String fun()
    {
        return new String();
    }
}
class inner extends outer
{
    String fun()
    {
        return new String();

    }
    public static void main(String[] args) {
        outer obj=new inner();
    }
}