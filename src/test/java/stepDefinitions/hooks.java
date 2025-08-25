package stepDefinitions;

import io.cucumber.java.Before;

public class hooks {
	@Before("@NetBanking")
	public void NetBanking() {
		System.out.println("setup the netries in netbanking DB");
	}
	@Before("@Mortage")
	public void mortage() {
		System.out.println("setup the netries in mortage DB");
		System.out.println("updated in DB");
	}
	 //use after also

}
