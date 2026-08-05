class Employee
{
static int empid=500;
static void emp1()
{
empid++;
System.out.println("Employee id:"+empid);
}
}
class Sample
{
public static void main(String args[])
{
Employee obj1=new Employee();
obj1.emp1();
}
}