import java.util.Scanner;

public class Exam_07 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("����������? ");
		int kor = in.nextInt();
		System.out.print("����������? ");
		int eng = in.nextInt();
		
		int avg = (kor+eng)/2;
		System.out.println(avg);
		if(avg>=90) {
			System.out.println("��");
		} else if(avg>=80) {
			System.out.println("��");
		} else if(avg>=70) {
			System.out.println("��");
		} else if(avg>=60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
	}
}