import java.util.Scanner;
class Box{
	float depth;
	float width;
	float height;
    Box(){
    depth=0;
    width=0;
    height=0;
    }
    Box(float depth,float width,float height){
    this.depth=depth;
    this.width=width;
    this.height=height;
   }
   Box(float height,float width){
   	this.height=height;
   	this.width=width;
   }
   float getwidth(){
   	return width;
   }
   float getdepth(){
   	return depth;
   }
   float getheight(){
   	return height;
   }
   void setdimension(float width,float height,float depth){
   	this.width=width;
   	this.height=height;
   	this.depth=depth;
   }
   void display(){
   	float volume;
   volume=(getdepth()*getwidth()*getheight());
   System.out.println("volume:"+volume);
 }
}
class BoxWeight extends Box{
	float weight;
	BoxWeight()
	{
		super();
	   weight=0;
	}
	BoxWeight(float depth,float width,float height,float weight ){
		super(depth,width,height);
		this.weight=weight;

	}
	BoxWeight(float height,float width,float weight){
		super(height,width);
		this.weight=weight;
	} 
	float getweight(){
		return weight;
	}
	void setdimension(float width,float height,float depth,float weight)
	{
		super.setdimension(width,height,depth);
		this.weight=weight;
	}
	void display(){
		float totalweight;
		totalweight=getdepth()*getwidth()*getheight()*getweight();
		System.out.println("weight is:"+totalweight);
	}
}
class BoxWeightDemo{
  public static void main(String args[])
  { float x,y,z,w;
  	Scanner input=new Scanner(System.in);
  	BoxWeight bw=new BoxWeight();
  	BoxWeight bw1=new BoxWeight(3,4,6,5);
  	System.out.println("enter dimensions:");
  	x=input.nextFloat();
  	y=input.nextFloat();
  	z=input.nextFloat();
  	w=input.nextFloat();
  	bw.setdimension(x,y,z,w);
  	bw.display();  
  }	
}