import java.util.Scanner;

public class Exam_05 {
	public static void main(String[]agrs) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		int num1 = in.nextInt();
		System.out.print("두 번째 수: ");
		int num2 = in.nextInt();
		System.out.print("세 번째 수: ");
		int num3 = in.nextInt();
		
		//큰 수를 찾아서 num1에 넣기
		if(num2>num1 && num2>num3) {
			int imsi = num1;
			num1 = num2;
			num2 = imsi;
		} else if(num3>num1 && num3>num2) {
			int imsi = num3;
			num3 = num1;
			num1 = imsi;
		} // 이러한 공식으로 num1에 제일 큰 값이 들어가진다.
		
		// 두 번째로 큰 수를 찾아서 num2에 넣기
		if(num3>num2) {
			int imsi = num3;
			num3 = num2;
			num2 = imsi;
		}
		
		System.out.println(num1 +  ">=" + num2 +  ">=" + num3);
		
	}
}
