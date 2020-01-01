package com.library.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.library.factory.LibraryFactory;

class LibraryTests {

	@Test
	void test() {
		LibraryFactory libraryFactory = new LibraryFactory();
		libraryFactory.getInstance("Stationary");
		assertEquals("book's author is Arthur",libraryFactory.getInstance("Books") );
	}

}
