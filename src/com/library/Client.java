package com.library;

import com.library.factory.LibraryFactory;

public class Client {
public static void main(String[] args) {
	System.out.println("Hello I'm the client asking for library");
	LibraryFactory libraryFactory = new LibraryFactory();
	String s = libraryFactory.getInstance("Books");
	System.out.println(s);
}
}
