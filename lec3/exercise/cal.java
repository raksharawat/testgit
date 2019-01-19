import java.util.Scanner;
class cal
{
	public static void main(String args[])
	{
	Scanner add = new Scanner(System.in);
	int a,b, choice;
	System.out.println("Enter first number");
	a=add.nextInt();
	System.out.println("Enter second number");
	b=add.nextInt();
    System.out.print("Menu:");
	System.out.print("1. Addition\n");
	System.out.print("2. Subtraction\n");
	System.out.print("3. Multiplication\n");
	System.out.print("4. Division\n");
	System.out.print("5. Modulus\n");
	System.out.print("enter your choice:");
	choice=add.nextInt();
	switch(choice)
	{
	case 1:System.out.print(a+b);
	       break;
	case 2:System.out.print(a-b);
	       break;
	case 3:System.out.print(a*b);
	       break;
	case 4:System.out.print(a/b);
	       break;
	case 5:System.out.print(a%b);
	       break;
	}
	}
}