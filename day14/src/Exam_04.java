import java.util.*;

class MyException04 extends Exception{
	private String message;
	public MyException04(String msg) {
		super(msg);
	}
	public String getMessage() {
		return super.getMessage() + "점수는 0~100점 사이값만 가능";
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			System.out.print("국어점수를 입력 : ");
			int kor = in.nextInt();
			if(kor<0 || kor>100) {
				throw new MyException04("국어");
			}
			System.out.println("입력하신 국어점수는 "+kor+"점 입니다.");
		} catch(InputMismatchException e) {
			System.err.println("숫자만!");
		} catch(MyException04 e) {
			System.err.println(e.getMessage());
		}
	}
}
