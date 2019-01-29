class Rectangle extends Shape 
{
     Rectangle(double a, double b) 
     {
         super(a, b);
     }
     double display_area() 
     {
           System.out.println("Area for Rectangle.");
           return dim1 * dim2;
     }
}