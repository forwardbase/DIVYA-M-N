import java.io.*;
class rectangle
{
  int l,b;
  rectangle()
 {
  l=1;
  b=1;
 }
rectangle(int x,int y)
{
l=x;
b=y;
}
public void accept() throws IoException
{
DataInputstream ds=new DataInputstream(system.in);
system.out.println("enter length and breadth of a rectangle");
l=Integer.parseInt(ds.readline());
b=Integer.parseInt(ds.readline());
}
public void display()
{
system.out.println("area of rectangle="+(l*b));
}
}