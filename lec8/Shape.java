abstract class Shape 
{
     double dim1;
     double dim2;
     Shape(double a, double b) 
     {
         dim1 = a;
         dim2 = b;
     }
     abstract double display_area();
}
