import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		int c = b % 10;
		int d = (b % 100) / 10;
		int e = b / 100;
		
        System.out.println(a * c);
        System.out.println(a * d);
        System.out.println(a * e);
        System.out.println(a * b);
	}

}
