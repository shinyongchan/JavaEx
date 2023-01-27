import java.util.Scanner;

// 입력한 정수가 19이상이면 성년 아니면 미성년을 출력하는 프로그램
public class ExCh3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하시오 : ");
		int age = sc.nextInt();
		
		if (age >= 19)
			System.out.println("성년");
		else
			System.out.println("미성년");
		
	}

}
