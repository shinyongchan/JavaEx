import java.util.Scanner;

// 입력받은 양의 정수 중 짝수만 더하여 출력하는 프로그램
public class ExCh3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		do
		{
			System.out.print("양의 정수를 입력하시오 : ");
			int num = sc.nextInt();
			if (num % 2 == 0)
				sum = sum + num;
			else if (num <= 0)
				break;
		} while (true);
		System.out.printf("입력한 양의 정수 중에서 짝수의 합은 %d", sum);
	}

}
