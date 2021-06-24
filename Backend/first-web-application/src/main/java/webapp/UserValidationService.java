package webapp;

public class UserValidationService {
	public boolean isUserValid(String user,String password) {
		if(user.equals("Debdeep") && password.equals("password"))
			return true;
		return false;
	}

}
