package com.assignment.oodpp;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	/**
	 * This is the main method which can be used to test the library
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @see Teacher
	 */
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		ObjectStore store = StoreFactory.create(StoreType.INMEMORY);
//		ObjectStore store = StoreFactory.create(StoreType.FILE);

		store.clear();

		Teacher x = new Teacher("Kamala", 25, "Horowpathana");
		int idx = store.store(x);
		Teacher y = new Teacher("Nimala", 25, "Kadawatha");
		int idy = store.store(y);
		Teacher z = new Teacher("Wimala", 25, "Galle");
		int idz = store.store(z);

		Teacher m = (Teacher) store.retrieve(idy);

		System.out.println(((Teacher) store.retrieve(idx)).getName() + " " + ((Teacher) store.retrieve(idx)).getAge()
				+ " " + ((Teacher) store.retrieve(idx)).getAddress());
		System.out.println(m.getName() + " " + m.getAge() + " " + m.getAddress());
		System.out.println(((Teacher) store.retrieve(idz)).getName() + " " + ((Teacher) store.retrieve(idz)).getAge()
				+ " " + ((Teacher) store.retrieve(idz)).getAddress());

	}

}
