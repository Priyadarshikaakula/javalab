public class JavaStringExample
{
public static void main(String[] args)
{
String title = "Java Programming";
String siteName = "String Handling Methods"; 
System.out.println("Length of title: " + title.length());
System.out.println("Char at index 3: " + title.charAt(3)); 
System.out.println("Index of 'T': " + title.indexOf('T')); 
System.out.println("Empty: " + title.isEmpty()); 
System.out.println("Equals: " + siteName.equals(title)); 
System.out.println("Sub-string: " + siteName.substring(9, 14)); 
System.out.println("Upper case: " + siteName.toUpperCase());
}
}


