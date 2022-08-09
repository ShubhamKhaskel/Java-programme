import java.util.*;
class MyDate
{
  int dd,mm,yy;
  MyDate(int dd,int mm,int yy)
  {
      this.dd=dd;
      this.mm=mm;
      this.yy=yy;
  }
  public String toString()
  {
      return (dd+"-"+mm+"-"+yy);
  }
}
class Employee
{
    String name;
    int salary;
    MyDate dt;
    
    Employee(String name,int salary,MyDate dt)
    {
        this.name=name;
        this.salary=salary;
        this.dt=dt;
    }
    
    String getDetails()
    {
        return (name+" "+salary+" "+dt);
    }
    
}
class Manager extends Employee
{
    String dept;
    
    Manager(String name,int salary,String dept,MyDate dt)
    {
       super(name,salary,dt);
       this.dept=dept; 
    }
    
    String getDetails()
    {
        return (super.getDetails()+" "+dept);
    }
    
}
class Engineer extends Employee
{
    String dept;
    
    Engineer(String name,int salary,String dept,MyDate dt)
    {
       super(name,salary,dt);
       this.dept=dept; 
    }
    
    String getDetails()
    {
        return (super.getDetails()+" "+dept);
    }
    
}
class TaxCalculate 
{
    double tax;
    float TaxReturn(Employee ob)
    {
        if(ob instanceof Engineer)
        {
            float sal=new Float(0.07*ob.salary);
            //float sal=(float)ob.salary;
            System.out.println(sal);
            return (sal);
        }
        else if(ob instanceof Manager)
        {
          float sal=new Float(0.07*ob.salary);
          System.out.println(sal);
            //float sal=(float)ob.salary;
            return (sal);  
        }
        return 1;
    }
    
}
public class TestProgram
{
    public static void main(String args[])
    {
        MyDate a=new MyDate(8,6,2002);
        Scanner sc=new Scanner(System.in);
        Manager ob1=new Manager("Shuv",9000,"it",a);
        System.out.println(ob1.getDetails());
        MyDate b=new MyDate(15,2,2002);
        Engineer ob2=new Engineer("Bony",5000,"cse",b);
        System.out.println(ob2.getDetails());
        
        Employee obb=new Engineer("Bony",5000,"cse",b);
        TaxCalculate ob3=new TaxCalculate();
        ob3.TaxReturn(obb);
        Employee obb1=new Engineer("Shuv",9000,"it",a);
        TaxCalculate ob4=new TaxCalculate();
        ob3.TaxReturn(obb1);
    }
}
