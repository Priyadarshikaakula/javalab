class super
{
    void show()
    {
        System.out.println("I'm in super class");
    }
}
class sub extends super
{
    void display()
    {
        System.out.println("I'm in CSMA");
    }
}
class Inherit
{
    public static void main(String args[])
{
    super obj1 = new super();
    obj1.show();
    obj1.display();
}
}