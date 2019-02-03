class BaseException extends Exception {}

class Base 
{
	Base() throws BaseException 
	{
		throw new BaseException();
	}
}

class Derived extends Base 
{
    Derived() throws BaseException 
	{}
}

public class Ex
{
	public static void main(String[] args) 
	{
		try 
		{
			Derived d = new Derived();
	    }catch(BaseException e) 
	     {
		    System.out.println("BaseException caught in main()");
	     }		
	}
}