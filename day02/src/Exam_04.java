import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�̸��� �Է�:");
		String name = in.next();
		System.out.print("���������� �Է�:");
		int kor = in.nextInt();
		System.out.print("���������� �Է�:");
		int eng = in.nextInt();
		
		int sum = kor + eng;
		double avg = (double)sum/2; 
		
		System.out.printf("%s���� ������ %d���̰�, ����� %.2f�Դϴ�.\n", name,sum,avg);
		//System.out.println(name);
		//System.out.println(sum);
		//System.out.printf("%.2f", avg);
	}
}