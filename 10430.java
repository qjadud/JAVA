import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		
		int a = (A+B) % C;
		int b = (B%C) % C;
		int c = (A%C);
        int d = (A*B) % C;
		
		System.out.println(a);
		System.out.println((c + (B%C)) % C);
		System.out.println(d);
		System.out.println((c * (B%C)) % C);
	}

}
