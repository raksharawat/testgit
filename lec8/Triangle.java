class Triangle extends Shape 
{
     Triangle(double a, double b) 
     {
     super(a, b);
     }
     double display_area() 
     {
           System.out.println("Area for Triangle.");
           return dim1 * dim2 / 2;
     }
}