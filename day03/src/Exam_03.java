import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("임의의 수는 ? ");
		int num = in.nextInt();
		
		if(num>10) {
			System.out.println("10보다 큽니다");
		} else if(num<10) {
			System.out.println("10보다 작습니다.");
		} else {
			System.out.println("10과 같습니다.");
		}
		
	}
}
