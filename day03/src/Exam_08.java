import java.util.*;
import java.io.*;
public class Exam_08 {
	public static void main(String[]args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		System.out.print("ù��° �� : ");
		int num1 = in.nextInt();
		System.out.print("�ι�° �� : ");
		int num2 = in.nextInt();
		System.out.print("��Ģ������ : ");
		char op = (char)System.in.read();
		
		if(op == '+') {
			System.out.printf("%d %c %d = %d", num1, op, num2, num1+num2);
		} else if(op=='-') {
			System.out.printf("%d %c %d = %d", num1, op, num2, num1-num2);
		} else if(op=='*') {
			System.out.printf("%d %c %d = %d", num1, op, num2, num1*num2);
		} else if(op=='/') {
			System.out.printf("%d $c %d = %d", num1, op, num2, num1/num2);
		} else {
			System.out.println("��Ģ �����ڰ� �ƴմϴ�.");
		}
	}
}