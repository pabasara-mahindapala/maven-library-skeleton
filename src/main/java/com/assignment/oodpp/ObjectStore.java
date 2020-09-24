package com.assignment.oodpp;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ObjectStore {
	int store(Object object) throws FileNotFoundException, IOException, ClassNotFoundException;

	Object retrieve(int index) throws FileNotFoundException, IOException, ClassNotFoundException;
}
