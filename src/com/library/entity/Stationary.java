package com.library.entity;

public class Stationary extends GenericItems {

	private String type;
	private double weight;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public int compare(Object o1, Object o2) {
		Stationary stationary1 = (Stationary)o1;
		Stationary stationary2 = (Stationary)o2;
		if(stationary1.getPrice()> stationary2.getPrice()) {
			return -1;
		}
		else if(stationary1.getPrice()< stationary2.getPrice()) {
			return 1;
		}
		else
			return 0;
	}

	@Override
	public void type() {
		System.out.println("here is Stationary items");
	}

}
