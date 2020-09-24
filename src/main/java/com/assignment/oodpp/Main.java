package com.assignment.oodpp;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		ObjectStore store = StoreFactory.create("file");

		Teacher x = new Teacher("Kamala", 25, "Horowpathana");
		int idx = store.store(x);
		Teacher y = new Teacher("Nimala", 25, "Kadawatha");
		int idy = store.store(y);
		Teacher z = new Teacher("Wimala", 25, "Galle");
		int idz = store.store(z);
		Teacher m = (Teacher) store.retrieve(idy);
		System.out.println(m.getName() + " " + m.getAge() + " " + m.getAddress());

	}

}
