package com.users;

public class AnonymousUser extends Users {

	public AnonymousUser() {
		//super();
		userLocation = new UserLocationImpl1();
	}

	@Override
	public void numberOfTimesUserVisited() {
		System.out.println("AnonymousUser visited ");
	}

}
