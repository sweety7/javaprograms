import java.util.*;
class ArrayStack{
	Scanner in = new Scanner(System.in);
	int i=0;
	int index=0;
	int array[] = new int[10];
	void push(){
		for(i=0;i<array.length;i++){
			System.out.println("Please enter element "+(i+1));
			array[i] = in.nextInt();
		}
	}
		void pop(){
			index=array.length;
			index=i-1;
			for(i=0;i<index;i++){
			System.out.println(array[i]);
		}
	}
			void isEmpty(){
				for(i=array.length-1;i>0;i--){
					if(i==0){
						throw new ArrayIndexOutOfBoundsException();

					}
				}
			}
			void isFull(){
				if(i==array.length){
					throw new ArrayIndexOutOfBoundsException();
				}
			}
			void Spaceleft(){
				if(index>=0 && index<9){
					System.out.println("Space is left in the stack");
				}
			}
}
class ArrayStackDemo extends ArrayStack
{
	public static void main(String args[])
	{ ArrayStack s=new ArrayStack();
		s.push();
		s.pop();
		try{
			s.isEmpty();
			s.isFull();
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception is:"+e);
		}
      
	}
}