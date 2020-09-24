package com.assignment.oodpp;

public class StoreFactory {

	public ObjectStore create(String type) {
		if (type.equalsIgnoreCase("InMemory")) {
			return new InMemoryObjectStore();
		} else if (type.equalsIgnoreCase("File")) {
			return new FileObjectStore();
		} else {
			return null;
		}

	}

}
