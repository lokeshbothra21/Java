package pkg3;

public class Box {
	
	private int height;
	private int width;
	private int breadth;
	
	public void assigndata(int h,int w,int b) {
		height=h;
		width=w;
		breadth=b;
		}
	
	public void display() {
		System.out.println("Height :"+height);
		System.out.println("width :"+width);
		System.out.println("breadth :"+breadth);
		
	}

}
