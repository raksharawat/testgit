class ResizableCircle extends Circle implements Resizable{
	ResizableCircle(double radius){
		super(radius);

	}
	double resize(double percent){
		radius=(percent/100)*radius + radius;

	}


}