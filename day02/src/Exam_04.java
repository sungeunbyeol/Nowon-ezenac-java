import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("이름을 입력:");
		String name = in.next();
		System.out.print("국어점수를 입력:");
		int kor = in.nextInt();
		System.out.print("영어점수를 입력:");
		int eng = in.nextInt();
		
		int sum = kor + eng;
		double avg = (double)sum/2; 
		
		System.out.printf("%s님의 총점은 %d점이고, 평균은 %.2f입니다.\n", name,sum,avg);
		//System.out.println(name);
		//System.out.println(sum);
		//System.out.printf("%.2f", avg);
	}
}
