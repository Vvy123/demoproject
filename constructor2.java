class outer
{
	public
	void display()
	{
		Inner in=new Inner();
		in.show();
	}
	class Inner
	{
		public
		void show()
		{
			System.out.println("Inside Inner");
			System.out.println("Inside Inner2");
		}
	}
}
public class nestedclass1 {
	public static void main(String[]args)
	{
	outer ot=new outer();
	ot.display();
	}

}
