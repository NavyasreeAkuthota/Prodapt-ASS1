# java Prodapt-ASS1
It is program with a business logic and a real entity
In Bussiness logic we have given the properties like name,age,salary and designation of employee.
Here we are printing Create,Display,Salary,Exit whenever program execute and 
The below one is the logic to read  dynamic inputs

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


The below one logic for Raise in salary
raisedSalary() which is used to increase the salary 


    void raisedSalary()
    {
       sal=sal+1000;
        System.out.println("Salary "+sal);
        System.out.println("Salary raised by 1000");
    }



we are repeating the logic for our choice
and also we are raising salary
as a choice 
here we used switch case to break 



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



output
1.Create
 2.Display
 3.Raise salary
 4.Exit
1
Enter name:
NAVYA
Enter age:
21
Enter salary:
2300
Enter Designation:
XYZ
1.Create
 2.Display
 3.Raise salary
 4.Exit

  
2
Name:NAVYA
Age:21
Salary:2300.0
Designation:XYZ
1.Create
 2.Display
 3.Raise salary
 4.Exit
3
Salary 3300.0
Salary raised by 1000
1.Create
 2.Display
 3.Raise salary
 4.Exit
4
exit from program


   
