import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("������ ���� ? ");
		int num = in.nextInt();
		
		if(num>10) {
			System.out.println("10���� Ů�ϴ�");
		} else if(num<10) {
			System.out.println("10���� �۽��ϴ�.");
		} else {
			System.out.println("10�� �����ϴ�.");
		}
		
	}
}