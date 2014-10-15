import javax.swing.JOptionPane;
public class Assignment3Main {
	public static void main(String[] args) {
		int accountType = 1;
		String[] choices = { "Admin", "Student", "Staff"};
		Account account = new Account(choices[accountType], "david", "12345");
		login(choices, account);
		

	}
	public static void login(String[] choices, Account account){
		int triesLeft = 3;
		while(triesLeft > 0){
			String input = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]); 
			String username = (String) JOptionPane.showInputDialog("Enter Username");
			if(account.compareUsername(username) && account.compareAccountType(input)){
				while(triesLeft > 0){
					if(checkPassword(account)){
						JOptionPane.showMessageDialog(null, "Welcome " + input + " " + username);
						triesLeft = 0;
					}else{
						triesLeft--;
						JOptionPane.showMessageDialog(null, "Incorrect Password " + triesLeft + " Tries Left");
					}
				}
			}else{
				if(triesLeft <= 0){
					JOptionPane.showMessageDialog(null, "Account Locked. Contact Admin");
				}else{
					triesLeft--;
					JOptionPane.showMessageDialog(null, "Incorrect Username or Account Type" + triesLeft + "Tries Left");
				}
			}
		}
	}
	public static boolean checkPassword(Account account){
		String password = (String) JOptionPane.showInputDialog("Enter Password");
		return account.comparePassword(password);
	}
}
