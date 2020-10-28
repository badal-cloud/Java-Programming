import java.util.*; //Java util package
class Rectangle
{	int width,height;
	Rectangle(int a,int b)
	{	width=a;
		height=b;
	}
	void area()
	{	int area=width*height;
		System.out.println("Area of Room  : "+area);
	}
}
class Rectanglearea
{	public static void main(String args[])
	{	Scanner s=new Scanner(System.in);
		System.out.println("Github username: badal-cloud");
		System.out.println("Enter the Width of Room :");
		int a=s.nextInt();           //next use in util package
		System.out.println("Enter the Height of Room  :");
		int b=s.nextInt();
		Rectangle R=new Rectangle(a,b);  //create new object R of Rectangle class
		R.area();  //call above void area() function of new object R
	}
}

