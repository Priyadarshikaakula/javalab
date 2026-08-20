class Super
{
    void show()
    {
        System.out.println("I'm in super class");
    }
}
class Sub extends Super
{
    void display()
    {
        System.out.println("I'm in sub class");
    }
}
class Intermediate extends Sub
{
    void print()
    {
        System.out.println("I'm in Intermediate class");
    }
}
class Inherit
{
    public static void main(String args[])
    {
        Intermediate obj1 = new Intermediate();
        obj1.show();
        obj1.display();
        obj1.print();
    }
}
