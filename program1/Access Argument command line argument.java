class CommandLineTest
{
	public static void main(String[] args)
	{
		int a;
		String mystring;
		a=args.length;
		System.out.println("Github usernameName: badal-cloud");
		System.out.println("no. of commandline arguments : "+a);
		for(int i=0; i<a ; i++)
		{	mystring=args[i];
			System.out.println(i+" argument "+mystring);
		}
	}
}
