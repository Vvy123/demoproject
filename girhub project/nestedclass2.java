class outer1
{
	int count;
	public void display() 
	{
	for(int i=0;i<5;i++)
	{
		class Inner1
		{
			void show()
			{
				System.out.println("Inside inner "+(count++));
			}
		}
		Inner1 in=new Inner1();
		in.show();
	}
 }
}
public class nestedclass2 {

	public static void main(String[] args) {
		outer1 ot=new outer1();
		ot.display();

	}

}
