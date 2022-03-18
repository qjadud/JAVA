import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();  //현제시각 시
		int B = input.nextInt();  //현제시각 분
		int C = input.nextInt();  //현제시각 초
		int D = input.nextInt();  //요리하는 데 필요한 시간(초)

		int a = D / 60;			  //필요한 시간를 분으로 변경
		int b = D % 60;			  //변경한 분의 남은 초
		int c;
		int d;		  
		
		if(a >= 60) {
			c = a / 60;			  //변경된 분을 시로 변경
			d = a % 60;			  //변경한 시의 남은 분
			A = A + c;
			B = B + d;
			C = C + b;
			if(C >= 60) {
				B++;					//초가 60이상 일때 분으로 변경
				C = C - 60;				//남은 초
			}
			if(B >= 60) {
				A++;					//분이 60이상 일때 시로 변경
				B = B - 60;		        //남은 분
			}
			if(A == 24) {
				A = A * 0;
			}
			System.out.print(A + " " + B + " " + C);
		}
		else if((B+a) >= 60) {
			A++;
			B = (B+a) - 60;
			if((C+b) >= 60) {
				B++;
				C = (C+b) - 60;
			}
			if(A == 24) {
				A = A * 0;
			}
			System.out.print(A + " " + B + " " + C);
		}
		else if((C+b) >= 60) {
			B++;
			C = (C+b) - 60;
			System.out.print(A + " " + B + " " + C);
		}
		else {
			System.out.print(A + " " + (B+a) + " " + (C+b));
		}
	}

}
