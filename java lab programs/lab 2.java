import java.io.*;
class xyz 
{
  int m,n;
  public void accept()throws Ioexception
{
 DataInputstream ds=new DataInputstream(system.in);
system.out.println("enter two numbers:");
a=Integer.parseInt(ds.readline());
b=Integer.parseInt(ds.readline());
}
public void gcd()
{
  {
    while(a!=b)
    {
      if(a>b)
        a=a-b;
      else
        b=b-a;
    }
system.out.println("GCD of two number="+a);
}
  }   