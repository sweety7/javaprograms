class Triangle extends Shape
{ Triangle()
{
	super(length,breadth);
}
	double area(double base,double height)
	{
	double Area;
	Area=1/2*b*h;
	return area;
}
void display()
{
	System.out.println("area:"+area(5,7));
}
}