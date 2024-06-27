class parent{
    int marry(String str)
    {
        System.out.println(str);
        return 10;
    }
}
class child{   
    float marry(String str)
    {
        System.out.println(str);
        return 10.5f;
    }
}
class client{
    public static void main(String[] args) {
        parent obj=new parent();
       obj.marry("RAHUL");
    }
}