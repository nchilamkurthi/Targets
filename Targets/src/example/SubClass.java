package example;

class Classconversions// super class
{
void show()
{
System.out.println("These is the super class");
}
}

 public class SubClass extends Classconversions//(sub class)
{
void display()
{
System.out.println("These is the sub class");
}
public static void main(String[] args)
{
SubClass s=new SubClass();//object for sub class
s.display();
s.show();//implicit conversion
Classconversions  cc=new Classconversions();//super object
cc.show();
((SubClass)cc).display();//explicit conversion
}
}


