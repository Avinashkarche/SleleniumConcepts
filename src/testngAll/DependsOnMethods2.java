package testngAll;

import org.testng.annotations.Test;

public class DependsOnMethods2 {
	@Test(priority = 1)
	public void uploadImage() {
		System.out.println("Upload image test case");
	}

	@Test(priority = 2, dependsOnMethods = "testngAll.DependsOnMethods.logout")
	public void editProfile() {
		System.out.println("Edit Profile test case");
	}
}
