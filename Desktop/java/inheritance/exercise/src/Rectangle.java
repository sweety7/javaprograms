class Rectangle extends Shape
{ Rectangle()
{
	super(length,breadth);
	
}
 
  double area(double length,double breadth)
{  double Area;
Area=length*breath;
return Area;
}
void display()
{
System.out.println("area"+area);
}
	
}