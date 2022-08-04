class outer2
{
	int count;
		public void display()
		{
		Inner2 in=new Inner2();
		in.show();
		}
		class Inner2
		{
			public void show()
			{
				System.out.println("Inside Inner "+(++count));
			}
		}
}
public class nestedclass3 {
        public static void main(String[]args)
        {
        	outer2 ot=new outer2();
        	outer2.Inner2 in=ot.new Inner2();
        	in.show();
        }
}
