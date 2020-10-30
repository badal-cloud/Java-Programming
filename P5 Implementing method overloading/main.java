class MethodOverloading
{	   void output(int a)
{	System.out.println("I am Animal\n");
   	}
   	void output(int a, int b)
{	System.out.println("I am Bird");
  }   
}
class Main
{   public static void main(String args[])
{	MethodOverloading obj = new MethodOverloading();
	System.out.println("Name :  Badal");
	System.out.println("Roll No : 1816113015\n");
	System.out.println("Accessing Aniaml");
	obj.output(5);
	System.out.println("Accessing Reptile");
              obj.output(5,2);	
 }
}
