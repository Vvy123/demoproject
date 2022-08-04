package constructor;

public class Box {
	int width,height,depth;
	public
	Box(int w,int h,int d)
	{
		this.width=w;
		this.height=h;
		this.depth=d;
	}
	public String toString() {
		return "width"+width+"height"+height+"depth"+depth;
	}
	public static void main (String[]args) {
		Box b1=new Box(2,3,4);
		System.out.println();
	}

}
