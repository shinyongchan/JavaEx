import java.util.Scanner;

//ex2_4 초를 입력하면 시간, 분, 초로 환산해 출력하는 프로그램
public class Ex {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("초 단위 정수를 입력하세요 : ");
	int sec = sc.nextInt();
	int hour = sec/3600;
	int min = (sec-(hour*3600))/60;
	sec = sec-(hour*3600)-(min*60);
	System.out.printf("%d시간 %d분 %d초", hour, min, sec);

	}

}
