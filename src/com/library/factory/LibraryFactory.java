package com.library.factory;

import com.library.entity.Books;
import com.library.entity.DVD;
import com.library.entity.Stationary;

public class LibraryFactory extends BaseLibraryFactory {
  StringBuilder result = new StringBuilder();
	public String getInstance(String type){
		if(type.equalsIgnoreCase("Books")) {
		Books book = new Books();
		book.setAuthor("Arthur");
		result.append("book's author is "+book.getAuthor());
		
		}
		else if(type.equalsIgnoreCase("DVD")) {
			DVD dvd = new DVD();
			dvd.setType("Video");
			System.out.println("DVD's type is "+ dvd.getType());
	
		}
		else if(type.equalsIgnoreCase("Stationary")) {
			Stationary stationary = new Stationary();
			stationary.setWeight(2);
			System.out.println("stationary weight is::"+ stationary.getWeight());
		}
		return result.toString();
	}
}
