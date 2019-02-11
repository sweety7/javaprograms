abstract class Shape
{
	double length;
	double breadth;
	Shape()
	{
	length=0;
	breadth=0;
	}
	abstract double area(double length,double breath);
    void display()
    {
    System.out.println("length:"+length);
    System.out.println("breadth"+breath);
    System.out.println("area"+area(3,4));
    }
	
}