class outer
{
    private String fun()
    {
        return new String();
    }
}
class inner extends outer
{
    private String fun()
    {
        return new String();

    }
    public static void main(String[] args) {
        outer obj=new inner();
    }
}