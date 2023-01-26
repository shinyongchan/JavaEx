import java.util.Scanner;

//ex2_3
public class Ex {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("원기둥의 밑면 반지름은? ");
	double r = sc.nextInt();
	System.out.print("원기둥의 높이는? ");
	double h = sc.nextInt();
	System.out.printf("원기둥의 부피는 %.1f",3.14*r*r*h);

	}

}
