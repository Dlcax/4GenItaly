import java.util.Scanner;

public class Username {
	String username;
	String password;
	
	public Username(String username,String password) {
		this.password=password;
		this.username=username;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
}
