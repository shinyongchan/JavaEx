import java.util.Scanner;

//ex2_9 
public class Ex {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("전공 이수학점 : ");
	int a = sc.nextInt();
	System.out.print("교양 이수학점 : ");
	int b = sc.nextInt();
	System.out.print("일반 이수학점 : ");
	int c = sc.nextInt();
	String grad = ((a + b + c>=140)&&(a>=70)&&((b>=30 && c>=30)||(b+c>=80)))?"졸업 가능":"졸업 불가능";
	System.out.printf("%s", grad );

	}

}
