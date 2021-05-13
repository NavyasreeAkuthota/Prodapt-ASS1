import java.util.*;
class Emp
{
String name;
int age;
double sal;
String job;

Scanner sc=new Scanner(System.in);
public void create()
{

System.out.println("Enter name:");
name=sc.next();

System.out.println("Enter age:");
age=sc.nextByte();

System.out.println("Enter salary:");
sal=sc.nextInt();

System.out.println("Enter Designation:");
job=sc.next();
}

public void display()
{
System.out.println("Name:" +name);
System.out.println("Age:" +age);

System.out.println("Salary:" +sal);
System.out.println("Designation:" +job);

}
void raisedSalary()
{
 sal=sal+1000;
System.out.println("Salary "+sal);
System.out.println("Salary raised by 1000");
}
}



public class Kavya
{
public static void main(String[] args)
{
Emp e=new Emp();
while(true)
{
Scanner sc=new Scanner(System.in);
System.out.println("1.Create \n 2.Display \n 3.Raise salary \n 4.Exit");
int ch=sc.nextInt();
if(ch==4)
break;
switch(ch)
{
case 1: e.create();
        break;
case 2: e.display();
        break;
case 3: e.raisedSalary();
        break;
}
}
}
}
