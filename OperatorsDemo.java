
public class OperatorsDemo {
    public static void main(String[] args)
{
  int a=10;
  int b=20;
  int x=10;
  System.out.println("a and b values before the operation: "+a+" "+b);
  
  
  ++a;
  int c =++a +b +a--;
  System.out.println("C value after the operation: "+c);
  
  int d=c++ +a+ b--;
  System.out.println("D value after the operation: "+d);
  
  System.out.println("a,b,c,d values after the operations:"+a+" "+b+" "+c+" "+d);
}}