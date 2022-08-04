package constructor;

class cricketer
{
	String name;
	String team;
	int age;
	cricketer()   //default constructor
	{
		name="";
		team="";
		age=0;
	}
	cricketer(String n,String t,int a)
	{
		name=n;
		team=t;
		age=a;
	}
	cricketer(cricketer ckt)
	{
		name=ckt.name;
		team=ckt.team;
		age=ckt.age;
	}
	public String toString()
	{
		return "this is "+name+" of "+team;
	}
}
class test1 {

	public static void main(String[] args) {
           cricketer c1=new cricketer();
           cricketer c2=new cricketer("Sachin", "India", 32);
           cricketer c3=new cricketer(c2);
           
           System.out.println(c2);
           System.out.println(c3);
           c1.name="virat";
           c1.team="India";
           c1.age=29;
           System.out.println(c1);
	}

}
