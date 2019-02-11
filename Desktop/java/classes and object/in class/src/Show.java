class Circle
{ 
 int radius=6;
 double findArea()
 {
 return(3.14*radius*radius);
 }
	double findCircumference()
	{
	return(2*3.14*radius);
	}
	void toDisplay()
	{ double x,y;
		x=findArea();
		y=findCircumference();
	System.out.println("area :"+x);
	System.out.println("circumference :"+y);
	}
}
class Show
{
	public static void main(String args[])
	{Circle c=new Circle ();
	 c.findArea();
	 c.findCircumference();
	c.toDisplay();
	}
}