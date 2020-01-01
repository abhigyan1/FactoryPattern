package com.library.entity;

public class DVD extends GenericItems {

	private String quality;
	private String multimedia;
	
	@Override
	public void type() {
		System.out.println("here is DVD type");
	}

	@Override
	public int compare(Object o1, Object o2) {
		DVD dvd1 = (DVD)o1;
		DVD dvd2 = (DVD)o2;
		if(dvd1.getPrice()>dvd2.getPrice()) {
			return 1;
		}
		else if (dvd1.getPrice()<dvd2.getPrice()) {
			return -1;
		}
		else
		return 0;
	}
}
