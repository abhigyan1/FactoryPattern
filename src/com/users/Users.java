package com.users;

public abstract class Users {

public void getEmail() {
	System.out.println("Email of users");
}
public void getaddress() {
	System.out.println("Get Address of users");
}


public UserLocation userLocation;

public void getCitynow() {
	 userLocation.getCity();
}
	
	 //Non- Implemented
public abstract void numberOfTimesUserVisited();

}
