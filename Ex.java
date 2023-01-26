import java.util.Scanner;

//ex2_6 화씨온도를 섭씨온도로 환산해 출력하는 프로그램
public class Ex {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("화씨온도를 입력하세요 : ");
	double f = sc.nextDouble();
	double c = (5.0/9.0)*(f-32);
	
	System.out.printf("화씨온도 %.2f는 섭씨온도 %.2f", f, c);

	}

}
