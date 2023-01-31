
class Triangle {
	private double length , height = 0;
	
	public Triangle (double length, double height) {
		this.length = length ;
		this.height = height ;
	}
	
	public double findArea() {
		return 0.5 * length * height;
	}
}


public class ExCh4 {

	
	public static void main(String[] args) {
		
		Triangle t = new Triangle(10.0, 5.0);
		System.out.println(t.findArea());
	}

}
