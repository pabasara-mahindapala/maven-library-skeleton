package com.assignment.oodpp;

import java.util.ArrayList;
import java.util.List;

public class InMemoryObjectStore implements ObjectStore {
	private List<Object> objects;

	public InMemoryObjectStore() {
		objects = new ArrayList<Object>();
	}

	public int store(Object object) {
		return objects.add(object) ? objects.indexOf(object) : -1;
	}

	public Object retrieve(int index) {
		return objects.get(index);
	}

}
