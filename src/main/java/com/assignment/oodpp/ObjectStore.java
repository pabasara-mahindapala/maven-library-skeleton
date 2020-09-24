package com.assignment.oodpp;

public interface ObjectStore {
	int store(Object object);

	Object retrieve(int index);
}
