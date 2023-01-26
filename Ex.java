import java.util.Scanner;

//ex2_8 0부터 999 사이의 정수를 입력받아 각 자릿수를 더한 결과를 출력하는 프로그램
public class Ex {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("0~999 사이의 숫자를 입력하세요 : ");
	int num = sc.nextInt();
	int sum = num/100 + (num%100)/10 + num%10;
	
	System.out.printf("각 자릿수의 합 = %d", sum );

	}

}
