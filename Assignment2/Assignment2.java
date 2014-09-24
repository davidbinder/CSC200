import java.util.Scanner;
public class Assignment2{
/*
Program Flowchart
1. make scanner
2. make int sum, temp, average
3. loop
4. sum = sum + next integer
5. exit loop when ammofnumbs = i
6. average = sum/ammofnumbs
7. print results
*/
	public static void main(String[] args){
		//ammount of numbers to enter
		int ammofnumbs = 5;
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter " + ammofnumbs + " numbers.");
		int sum = 0;
		int temp = 0;
		for(int i = 0; i < ammofnumbs; i++){
			temp = kbd.nextInt();
			sum += temp;
		}
		int average = sum/ammofnumbs;
		System.out.println("Sum " + sum);
		System.out.println("Average " + average);
	}
}
