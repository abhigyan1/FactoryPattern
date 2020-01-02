package com.users;

public class ClientApp {

	public static void main(String[] args) {
	System.out.println("Hello");
	
	
	//Users adminUser = new AdminUser();
	//adminUser.getEmail();
	//adminUser.numberOfTimesUserVisited();
	Users anonymousUser = new AnonymousUser();
	anonymousUser.getEmail();
	anonymousUser.getaddress();
	anonymousUser.getCitynow();
	anonymousUser.numberOfTimesUserVisited();

   
	Users primeUser = new PrimeUser();
	primeUser.getEmail();
	primeUser.getaddress();
	primeUser.numberOfTimesUserVisited();
	primeUser.getCitynow();
	
	
	
		}
	}


