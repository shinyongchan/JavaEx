//ch4_ex4
class Line {
	private int length = 0;
	
	public Line (int length) {
		this.length = length ;
	}
	
	public boolean isSameLine (Line l) {
		
		if (l.length == length) 
			return true ;
		else 
			return false ;
		
	}
	
	
}


public class ExCh4 {

	
	public static void main(String[] args) {
		
		Line a = new Line(1);
		Line b = new Line(1);
		
		System.out.println(a.isSameLine(b));
		System.out.println(a==b);
		
	}

}
