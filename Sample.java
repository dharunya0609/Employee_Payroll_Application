import p1.*;
import java.lang.*;
import java.util.*;
public class Sample
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String name,dsgn;
double G_sal;
int pf,it,pt;
System.out.println("Enter Your Name:");
name=sc.nextLine();
System.out.println("Enter Your Designation:");
dsgn=sc.nextLine();
System.out.println("Enter Your Gross salary:");
G_sal=sc.nextDouble();
System.out.println("Enter Your Provident fund interms of %:");
pf=sc.nextInt();
System.out.println("Enter Your Income Tax interms of %:");
it=sc.nextInt();
System.out.println("Enter Your Professional Tax interms of %:");
pt=sc.nextInt();
        employee e1=new employee();
        e1.nscalc(name,dsgn,G_sal,pf,it,pt);
}
}

