using system;
class VParam
{
public void swap(int x,int y)
{
int temp;
temp=x;
x=y;
y=temp;
}
public static void main(string[] args)
{
VParam V=new VParam();
int a=100,b=200;
console.WriteLine("before swap value of a is:"+a);
console.WriteLine("before swap value of b is:"+b);
V.swap(a,b);
console.WriteLine("after swap value of a is:"+a);
console.WriteLine("after swap value of b is:"+b);
console.ReadLine();
  }
}