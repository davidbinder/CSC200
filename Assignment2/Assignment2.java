import java.util.Scanner;
public class Assignment2{

	public static void main(String[] args){
		//ammount of numbers to enter
		int ammofnumbs = 5;
		Scanner kbd = new Scanner(System.in);
		int[] numbs = new int[(ammofnumbs)];
		System.out.println("Enter " + ammofnumbs + " numbers.");
		int sum = 0;
		int temp = 0;
		for(int i = 0; i < ammofnumbs; i++){
			temp = kbd.nextInt();
			numbs[i] = temp;
			sum += temp;
		}
		int average = sum/ammofnumbs;
		System.out.println("Sum " + sum);
		System.out.println("Average " + average);
	}
}
