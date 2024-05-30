
public class UserManager {
	
	public void login(User user) {
		System.out.println("Giriş başarılı: " + user.getFirstName());
	}
	
	public void logout(User user) {
		System.out.println("Çıkış başarılı: " + user.getFirstName());
	}

}
