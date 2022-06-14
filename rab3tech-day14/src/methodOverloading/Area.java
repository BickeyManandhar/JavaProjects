package methodOverloading;

public class Area {
	public int areaofshape(int l, int b) {
		return l*b;
	}
	public float areaofshape(int r) {
		float pi=3.14f;
		float f= pi*r*r;
		return f;
	}
	public static void main(String[] args) {
		Area a=new Area();
		System.out.println("Area of a rectangle is "+a.areaofshape(2,3)+ " square units.");
		System.out.println("Area of a circle is "+a.areaofshape(2)+ " square units.");
	}
}
