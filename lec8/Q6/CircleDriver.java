class CircleDriver{
	public static void main(String[] args) {
		ResizableCircle c = new ResizableCircle(10);
		System.out.println("perimeter= "+c.getPerimeter());
		System.out.println("Area= "+c.getArea());
		System.out.println("resize" +c.resize(20));
		System.out.println("Area= "+c.getArea());
		System.out.println(c.getPerimeter());
	}
}
