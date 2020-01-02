package com.users;

public class PrimeUser extends Users {
    public PrimeUser() {
		super();
		userLocation = new UserLocationImpl();
	}
	
	@Override
	public void numberOfTimesUserVisited() {
		System.out.println("Prime user has visited quite many times");
	}

}
