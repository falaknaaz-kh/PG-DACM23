class Area 
{
	int radius;
	int height;
	int base;
	
	void circle()
	{
		System.out.println("Area of circle: " + 3.14 * radius);	
	}
	
	void triangle()
	{
		System.out.println("Area of triangle: " + 0.5 * base * height);		
	}
	
	void rectangle()
	{
		System.out.println("Area of rectangle: " + base * height);	
	}
	
	public static void main(String args[])
	{
		Area ar = new Area();
		ar.radius = 5;
		ar.height = 10;
		ar.base = 15;
		
		ar.circle();
		ar.triangle();
		ar.rectangle();
	}
}	