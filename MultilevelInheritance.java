class Animal
{
    String name;
    void show()
    {
        System.out.println("Animal Name is" + name);
    }
}
class Dog extends Animal
{
    void Bark()
    {
        System.out.println("Mother Dog Barking...");
    }
}
class BabyDog extends Dog
{
    void Weep()
    {
        System.out.println("Baby Dog Weeping");
    }
}
class TestInheritance
{
    public static void main(String args[])
    {
        BabyDog d=new BabyDog();
        d.name = "MotherDog";
        d.show();
        d.Bark();
        d.Weep();
    }
}