class Distance
{
	float feet;
	float feet1;
	float inch;
	float inch1;
	Distance()
	{
		System.out.println("");
	}
	Distance(float feet, float inch,float feet1, float inch1)
	{
		this.feet=feet;
		this.inch=inch;
		this.inch1=inch1;
		this.feet1=feet1;
	}
	public float getfeet()
	{
		return feet;
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
	public void set(float feet, float inch)
	{
		this.feet=feet;
		this.inch=inch;
	}
	public void set(float feet, float inch,float feet1, float inch1)
	{
		this.feet=feet;
		this.inch=inch;
		this.feet1=feet1;
		this.inch1=inch1;
	}
	public void sum(Distance D)
	{
		float F1,I1;
		F1=getfeet()+D.getfeet1();
		I1=getinch()+D.getinch1();
		System.out.println("");
		System.out.println(F1 + " " +I1);
	}
}
