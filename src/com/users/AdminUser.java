package com.users;

public class AdminUser extends Users{

	
	 public AdminUser() {
		 super();
		 userLocation = new UserLocationImpl();
		 }
	
	 
	@Override
	public void numberOfTimesUserVisited() {
		System.out.println("Number of times admin has visited");
	}

}
