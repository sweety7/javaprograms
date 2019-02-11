class Box 
{
	double width;
	double height;
	double depth;
	void setDim ()
	{
	width=5.0;
	height=7.0;
	depth=8.0;
	}
	double volume()
	{
	return ( width*height*depth);
	}
}
class BoxDemo
{ public static void main(String args[])
	{  double volume=0;
		Box a=new Box();
	a.setDim();
	volume=a.volume();
	System.out.println("vol"+volume);
	}
	}