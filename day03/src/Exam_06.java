import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("임의의 수는? ");
		int num = in.nextInt();
		
		if(num%3==0) {
			if(num%5==0) {
				System.out.println("3과 5의 배수입니다.");
			} else {
				System.out.println("3의 배수 입니다.");
			}
		}else if(num%5==0) {
			System.out.println("5의 배수 입니다.");
		}else {
			System.out.println("두 배수가 아닙니다.");
		}
		
	}
}
