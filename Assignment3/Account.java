
public class Account {
	private String AccountType;
	private String Username;
	private String Password;
	public Account(String type, String username, String password){
		AccountType = type;
		Username = username;
		Password = password;
		
	}
	public boolean compareAccountType(String type){
		return AccountType.equals(type);
	}
	public boolean compareUsername(String type){
		return Username.equals(type);
	}
	public boolean comparePassword(String type){
		return Password.equals(type);
	}

}
