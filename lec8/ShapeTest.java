class ShapeTest 
{
      public static void main(String args[]) 
      {
           Rectangle r = new Rectangle(9, 5);
           Triangle t = new Triangle(10, 8);
           Shape s;
           s = r;
           System.out.println("Area is " + s.display_area());
           s = t;
           System.out.println("Area is " + s.display_area());
      }
}