import java.util.*;
import java.io.*;
public class Exam_08 {
	public static void main(String[]args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		int num1 = in.nextInt();
		System.out.print("두번째 수 : ");
		int num2 = in.nextInt();
		System.out.print("사칙연산자 : ");
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
			System.out.println("사칙 연산자가 아닙니다.");
		}
	}
}
