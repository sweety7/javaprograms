class Distance
{
 private float feet;
 private float feet1;
 private float inch;
 private float inch1;
 Distance()
{
	System.out.println("nothing");
}
 Distance(float feet,float inch)
{
	this.feet=feet;
	this.inch=inch;
}
  public float getfeet()
 { return feet;
 }
  public float getinch()
 {
 return inch;
 }
  public float getfeet1()
 {
 return feet1;
 }
  public float getinch1()
 {
 return inch1;
 }
  public void setfeet(float feet,float inch1)
 {
 this.feet=feet;
 this.inch1=feet1;
 }
  public void setfeet(float feet,float feet1,float inch, float inch1)
 {this.feet=feet;
 this.feet1=feet1;
 this.inch=inch;
 this.inch1=inch1;
}
 public void sum(Distance d)
 { float f1,i1;
 f1=getfeet()+d.getfeet1();
 i1=getinch()+getinch1();
  System.out.println(f1);
  System.out.println(i1);
 }
}
 class DistanceDemo
 {
  public static void main(String args[])
  {
  Distance D1=new Distance(5,6);
  Distance D2=new Distance(9,10);
  D1.sum(D2);
  }
 }

