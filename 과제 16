import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("정수 하나를 입력하세요: (16 ~ 31)");
		int A = input.nextInt();  //16~31사이의 정수
		
		double a;
		int aa;
		double b;
		int bb;
		for(int i = 8; i >= 1; i--) {	   //8bit로 계산 
			a = A % Math.pow(2,i);         //제곱 함수(2의 i제곱)
			b = 0 * (A/Math.pow(2,i));
			if(A < Math.pow(2,i-1)) {
				aa = 0;
				System.out.print(aa);
			}
			else if(a != 0.0) {
			    aa = 1;
			    System.out.print(aa);
			}
			else if(a == 0.0) {
				aa = 0;
				System.out.print(aa);
			}
		}
		
		String bin = Integer.toBinaryString(A);
		
		System.out.println();
		System.out.print(bin);
		
	}
}
