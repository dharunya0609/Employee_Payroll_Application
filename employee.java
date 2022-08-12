package p1;
interface emp1
{
final String company="TESLA";
void nscalc(String name,String dsgn,double G_sal,int pf,int it,int pt);
}
public  class employee implements emp1
{
double net_sal;
double pfamt,ptamt,itamt;
public void nscalc(String name,String dsgn,double G_sal,int pf,int it,int pt)
{
pfamt=(pf*G_sal)/100;
itamt=(it*G_sal)/100;
ptamt=(pt*G_sal)/100;
net_sal=G_sal-pfamt-itamt-ptamt;
System.out.println("NAME OF EMPLOYEE:"+name);
System.out.println("COMPANY NAME:"+company);
System.out.println("NET SALARY:"+net_sal);
}
}
