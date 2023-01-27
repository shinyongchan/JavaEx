import java.util.Scanner;

// 등수를 입력 받아 출력하는 프로그램 (switch 사용)
public class ExCh3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("등수를 입력하시오 : ");
		int grade = sc.nextInt();
		
		switch(grade)
		{
			case 1 -> System.out.println("아주 잘했습니다.");
			case 2, 3 -> System.out.println("잘했습니다.");
			case 4, 5, 6 -> System.out.println("보통입니다.");
			default ->  System.out.println("노력해야겠습니다.");
		}
	}

}
