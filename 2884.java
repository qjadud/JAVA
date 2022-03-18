import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int H = input.nextInt();  //알람시간 시
		int M = input.nextInt();  //알람시간 분
		
		int m = (60-45) + M;
		if(H == 0) {
			H = H + 23;
			System.out.print(H + " " + m);
		}
		else if(M < 45) {
			--H;
			System.out.print(H + " " + m);
		}
		H = H + 23;
		
	}

}
