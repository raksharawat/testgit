import java.util.Scanner;
class quadr
{
	public static void main(String args[])
    {
    Scanner in =new Scanner(System.in);
	int a,b,c;
    double d,r1,r2;
	System.out.print("enter the coefficient of x square");
    a=in.nextInt();
    System.out.print("enter the coefficient of x");
    b=in.nextInt();
    System.out.print("enetr the constant");
    c=in.nextInt();
    d=b*b - 4*a*c;
    if(d>0)
    {
        System.out.print("real roots exist\n");
        r1=(-b + Math.sqrt(d))/ (2*a);
        r2=(-b - Math.sqrt(d))/ (2*a);
        System.out.print("Roots are:" + r1 + "and" + r2);
    }
    else if(d==0)
    {
        System.out.print("Roots are real and equal");
        r1=(-b + Math.sqrt(d)/(2*a));
        System.out.print("Roots are:" + r1);
    }
    else
    {
        System.out.print("Roots are imaginary");
    }
	}
}