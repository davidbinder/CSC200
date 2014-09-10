import java.util.Scanner;
public class AssignmentMain {

	/**
	 * @param args
	 * Chapter 2 problem number 2
	 * Write a program that reads a line of text and then
	 * displays the line, but with the fist occurrence of
	 * hate changed to love.
	 */
	public static void main(String[] args) {
		String find = "hate";
		String rep = "love";
		Scanner kbd = new Scanner(System.in);
		String input = kbd.nextLine(); //get user input
		//find the starting position of the string
		int position = find(find, input);
		if(position > -1){
			input = replace(position, find, rep, input);
		}
		System.out.println(input);

	}
	public static int find(String find, String input){
		//returns -1 if match is not found
		boolean found= false;
		int position = 0;
		int findlength = find.length();
		int inputlength = input.length();
		//scans the input string for the find string
		while((! found) && position <= (inputlength - findlength)){
			found = (find.equalsIgnoreCase(input.substring(position, position + findlength)));
			if(! found){position++;}
		}
		// if no matches are found change position to -1
		if(! found){
			position = -1;
		}
		return position;
	}
	public static String replace(int position, String find, String rep, String input){
		return (input.substring(0,position) + rep + input.substring(position + find.length(), input.length()));
	}

}
