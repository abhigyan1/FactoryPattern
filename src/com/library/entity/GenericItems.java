package com.library.entity;

import java.util.Comparator;
import java.util.Date;

public abstract class GenericItems implements Comparator  {
   private Date manufactureDate;
   private double price;
   public Date getManufactureDate() {
	return manufactureDate;
}

public void setManufactureDate(Date manufactureDate) {
	this.manufactureDate = manufactureDate;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

private String type;
   
   public abstract void type();
}
