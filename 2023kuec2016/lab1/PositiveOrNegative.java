import java.util.Scanner;

class PositiveOrNegative {
	public static void main(String[] args) {
		System.out.print("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String ans = a >= 0 ? ((a == 0) ? "Zero" :"Positive") : "Negative";
		System.out.println(ans);
	}
}
